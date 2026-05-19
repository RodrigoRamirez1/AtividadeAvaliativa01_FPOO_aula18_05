public class AutorService {
    public void menu(Livro livro){
        int opc = 0;
        do {
            IO.println("--- MENU ---");
            IO.println("1. Adicionar");
            IO.println("2. Remover");
            IO.println("3. Editar");
            IO.println("4. Listar");
            IO.println("O. Voltar ao Menu principal");

            opc = Integer.parseInt(IO.readln("Digite a opção desejada: "));

            switch (opc){
                case 1:
                    this.adicionar(livro);
                    break;
                case 2:
                    this.remover(livro);
                    break;
                case 3:
                    this.editar(livro);
                    break;
                case 4:
                    this.listar(livro);
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção inválida!");
                    break;
            }

        }while(opc != 0);

    }

    public void adicionar(Livro livro){
        String nome = IO.readln("Digite o nome: ");
        String nacionalidade = IO.readln("Digite a nacionalidade: ");
        int anoLancamento = Integer.parseInt(IO.readln("Digite ano lançamento: "));

        Autor autor = new Autor(nome,nacionalidade, anoLancamento);
        livro.getAutores().add(autor);

    }

    public void listar(Livro livro){
        for (int i = 0; i < livro.getAutores().size(); i++) {
            IO.println("Indice: " + i);
            IO.println(livro.getAutores().get(i).toString());
        }
    }

    public void remover(Livro livro){
        this.listar(livro);
        int indice = Integer.parseInt(IO.readln("Digite o indice para remover: "));
        livro.getAutores().remove(indice);
    }

    public void editar(Livro livro){
        this.listar(livro);
        int indice = Integer.parseInt(IO.readln("Digite o indice para editar: "));

        livro.getAutores().get(indice).setNome(IO.readln("Digite o Nome: "));
        livro.getAutores().get(indice).setNacionalidade(IO.readln("Digite a Nacionalidade: "));
        livro.getAutores().get(indice).setAnoNascimento(Integer.parseInt(IO.readln("Digite o ano Nascimento: ")));
    }
}

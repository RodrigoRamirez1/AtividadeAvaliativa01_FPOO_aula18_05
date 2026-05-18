import java.util.ArrayList;

public class LivroService {

    private ArrayList<Livro> livros = new ArrayList<>();
    private AutorService autorService = new AutorService();

    public LivroService() {
    }

    public LivroService(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void menu(){
        int opc = 0;
        do {
            IO.println("--- MENU ---");
            IO.println("1. Adicionar");
            IO.println("2. Remover");
            IO.println("3. Editar");
            IO.println("4. Listar");
            IO.println("O. Sair");

            opc = Integer.parseInt(IO.readln("Digite a opção desejada: "));

            switch (opc){
                case 1:
                    this.adicionar();
                    break;
                case 2:
                    this.remover();
                    break;
                case 3:
                    this.editar();
                    break;
                case 4:
                    this.editar();
                    break;
                case 0:
                    break;
                default:
                    IO.println("Opção inválida!");
                    break;
            }

        }while(opc != 0);

    }

    public void adicionar(){
        String titulo = IO.readln("Digite o Titulo: ");
        String genero = IO.readln("Digite o genero: ");
        Livro livro = new Livro(titulo, genero);

        this.autorService.menu(livro);
        this.livros.add(livro);
    }

    public void listar(){
        for (int i = 0; i < this.livros.size(); i++) {
            IO.println("Indice: " + i);
            IO.print(this.livros.get(i).toString());
        }
    }

    public void remover(){
        this.listar();
        int indice = Integer.parseInt(IO.readln("Digite o indice para remover: "));
        this.livros.remove(indice);
    }

    public void editar(){
        this.listar();
        int indice = Integer.parseInt(IO.readln("Digite o indice para editar: "));

        this.livros.get(indice).setTitulo(IO.readln("Digite o Titulo: "));
        this.livros.get(indice).setGenero(IO.readln("Digite a descrição: "));

        this.autorService.menu(this.livros.get(indice));
    }
}

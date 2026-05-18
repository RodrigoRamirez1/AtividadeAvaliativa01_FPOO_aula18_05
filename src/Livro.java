import java.util.ArrayList;

public class Livro {

    private String titulo;
    private String genero;
    private ArrayList<Autor> autores = new ArrayList<>();

    public Livro() {
    }

    public Livro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Livro(String titulo, String genero, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.genero = genero;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autores=" + autores +
                '}';
    }

}

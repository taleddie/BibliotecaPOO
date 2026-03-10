public class Livro {
    int id;
    String titulo;
    String autor;
    boolean disponivel;

    static int contador = 1;

    public Livro(String titulo, String autor) {
        this.id = contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void mostrarLivro() {
        System.out.println("ID: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);

        if (this.disponivel){
            System.out.println("Disponível: sim");
        } else {
            System.out.println("Disponível: não");
        }

    }
}

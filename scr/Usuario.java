public class Usuario {
    int id;
    String nome;

    static int contador = 1;

    public Usuario(String nome) {
        this.id = contador++;
        this.nome = nome;
    }

    public void mostrarUsuario() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("--------------------------");
    }
    
}

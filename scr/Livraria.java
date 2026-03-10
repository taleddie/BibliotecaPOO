import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("==========================");
        System.out.println("= Bem Vindo á Biblioteca =");
        System.out.println("==========================");

        boolean rodando = true;
        while (rodando) {

            System.out.println("    ");
            System.out.println("========== MENU ==========");
            System.out.println("=   1. Listar acervo     =");
            System.out.println("=   2. Cadastrar livro   =");
            System.out.println("=   3. Cadastrar usuário =");
            System.out.println("=   4. Listar usuários   =");
            System.out.println("=   5. Emprestar livro   =");
            System.out.println("=   6. Devolver livro    =");
            System.out.println("=   0. Sair              =");
            System.out.println("==========================");

            System.out.print("Escolha uma opção:: ");
            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1":
                    if (livros.isEmpty()) { 
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Livro l : livros) { 
                            l.mostrarLivro();    
                        }
                    }
                    break;

                case "2":
                    System.out.println("Digite o título do livro:: ");
                    String titulo = sc.nextLine().trim();

                    System.out.println("Digite o autor do livro:: ");
                    String autor = sc.nextLine().trim();

                    Livro novoLivro = new Livro(titulo, autor);

                    livros.add(novoLivro);

                    System.out.println("Novo livro cadastrado!");
                    break;

                case "3":
                    System.out.println("Digite o nome do usuário:: ");
                    String nome = sc.nextLine().trim();

                    Usuario novoUsuario = new Usuario(nome);
                    usuarios.add(novoUsuario);
                    
                    System.out.println("Novo usuário cadastrado!");
                    break;

                case "4":
                    if (usuarios.isEmpty()) { 
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (Usuario u : usuarios) { 
                            u.mostrarUsuario();    
                        }
                    }
                    break;

                case "5":
                    if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                    break;
                    }

                    boolean encontrado = false;

                    System.out.println("Digite o ID do livro que deseja pegar emprestado:: ");
                    int idLivro = Integer.parseInt(sc.nextLine());

                    for (Livro l : livros) {
                        if (l.id == idLivro) {

                        encontrado = true;

                        if (l.disponivel) {
                            l.disponivel = false;
                            System.out.println("Livro emprestado com sucesso!");
                            } else {
                                System.out.println("Esse livro já está emprestado.");
                            }
                        }
                    }

                    if (encontrado == false) {
                    System.out.println("Livro não encontrado.");
                    }

                break;

                case "6":
                    if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                    break;
                    }

                    boolean encontrado2 = false;

                    System.out.println("Digite o ID do livro que deseja devolver:: ");
                    int idLivro2 = Integer.parseInt(sc.nextLine());

                    for (Livro l : livros) {
                        if (l.id == idLivro2) {

                        encontrado2 = true;

                        if (!l.disponivel) {
                            l.disponivel = true;
                            System.out.println("Livro devolvido com sucesso!");
                            } else {
                                System.out.println("Esse livro já está disponível na biblioteca.");
                            }
                        }
                    }

                    if (encontrado2 == false) {
                    System.out.println("Livro não encontrado.");
                    }
                break;

                case "0":
                    System.out.println("Até a próxima!");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }

    }
}

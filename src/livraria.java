import java.util.ArrayList;
import java.util.Scanner;

public class livraria {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

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

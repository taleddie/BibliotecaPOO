import java.util.Scanner;

public class livraria {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========================");
        System.out.println("= Bem Vindo á Biblioteca =");
        System.out.println("==========================");

        boolean rodando = true;
        while (true) {
            
            System.out.println("    ");
            System.out.println("========== MENU ==========");
            System.out.println("=   1. Listar acervo     =");
            System.out.println("=   0. Sair              =");
            System.out.println("==========================");

            System.out.print("Escolha uma opção:: ");
            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1":
                    
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

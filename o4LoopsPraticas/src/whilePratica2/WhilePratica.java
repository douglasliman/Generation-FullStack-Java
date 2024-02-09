package whilePratica2;

import java.util.Scanner;


public class WhilePratica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String escolha = "s";
        
        int mulheresCisETrans = 0;
        int naoBinaria = 0;
        int homemCisEHomemTrans = 0;
        int outros = 0;
        
        int backend = 0;
        int frontend = 0;
        int mobile = 0;
        int fullStack = 0;
        
        while(!escolha.equalsIgnoreCase("n")) {
            System.out.println("\n ======== MENU ========");                
            System.out.println("Identidade de Gênero: ");
            System.out.println("1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
            System.out.println("Qual o gênero? ");
            int opcao = input.nextInt();
            input.nextLine();
            
            switch(opcao) {
                case 1:
                    mulheresCisETrans++;
                    break;
                case 2:
                    homemCisEHomemTrans++;
                    break;
                case 3:
                    naoBinaria++;
                    break;
                case 4:
                    mulheresCisETrans++;
                    break;
                case 5:
                    homemCisEHomemTrans++;
                    break;
                case 6:
                    outros++;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.println("\n Escolha a área de desenvolvimento:");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            System.out.println("Qual a stack? ");
            int opcao1 = input.nextInt();
            input.nextLine();
            
            switch(opcao1) {
                case 1:
                    backend++;
                    break;
                case 2:
                    frontend++;
                    break;
                case 3:
                    mobile++;
                    break;
                case 4:
                    fullStack++;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
                    
            System.out.println("Deseja um novo colaborador ou não (S/N)");
            escolha = input.nextLine();
        }
        
        input.close();
        
        System.out.println("Total de colaboradores Mulheres Cis e Trans: " + mulheresCisETrans);
        System.out.println("Total de colaboradores Não Binários: " + naoBinaria);
        System.out.println("Total de colaboradores Homens Cis e Homens Trans: " + homemCisEHomemTrans);
        System.out.println("Total de colaboradores Backend: " + backend);
        System.out.println("Total de colaboradores Frontend: " + frontend);
        System.out.println("Total de colaboradores Mobile: " + mobile);
        System.out.println("Total de colaboradores FullStack: " + fullStack);
    }
}

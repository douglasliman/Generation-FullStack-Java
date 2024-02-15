package randomNumbers;

import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSorteado;
        int palpite;
        boolean jogarNovamente = true;
        int tentativas = 0;
        
       
        
        System.out.println("Bem-vindo ao jogo da Mãe Dináh!");
        
        while (jogarNovamente) {
            numeroSorteado = (int) (Math.random() * 101);
            tentativas = 0;
            System.out.println("Um número entre 0 e 100 foi sorteado, Adivinhe qual é!");

            while (true) {
                System.out.print("Digite seu palpite (ou -1 ou maior 101 para desistir): ");
                palpite = input.nextInt();
                tentativas++;

                if (palpite < 0 || palpite > 100 ) {
                    System.out.println("Você desistiu. O número correto era: " + numeroSorteado);
                    break;
                } else if (palpite == numeroSorteado) {
                    System.out.println("Parabéns! Você adivinhou o número corretamente em " + tentativas + " tentativas.");
                    break;
                } else {
                    if (palpite < 0 || palpite > 100) {
                        System.out.println("Por favor, digite um número entre 0 e 100.");
                        continue;
                    }

                    if (Math.abs(palpite - numeroSorteado) > 10) {
                        System.out.println("Seu palpite está muito longe.");
                    } else {
                        System.out.println("Seu palpite está mais perto.");
                    }
                }
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
            String resposta = input.next();
            jogarNovamente = resposta.equalsIgnoreCase("S");
        }

        input.close();
    }
}

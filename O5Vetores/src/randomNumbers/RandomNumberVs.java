package randomNumbers;

import java.util.Scanner;

public class RandomNumberVs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jogarNovamente = true;

        System.out.println("============  Bem-vindo ao jogo da Mãe Dináh! ============ ");

        while (jogarNovamente) {
            System.out.println("============ Escolha o modo de jogo ============");
            System.out.println("1. Jogar sozinho contra a máquina");
            System.out.println("2. Jogar em dupla contra outro jogador");
            System.out.println("3. Sair do jogo");
            int modoJogo = input.nextInt();
            input.nextLine(); 
            
            switch (modoJogo) {
                case 1:
                    jogarSozinho(input);
                    break;
                case 2:
                    jogarEmDupla(input);
                    break;
                case 3:
                  System.out.println("Mãe Dináh sabe que nem todos tem o dom. \nMas darei mais uma chance!!!");
           
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
           
            System.out.print("Deseja jogar novamente? (S/N): ");
            String resposta = input.next();
            jogarNovamente = resposta.equalsIgnoreCase("S");
        }

        input.close();
    }

    private static void jogarSozinho(Scanner input) {
        int numeroSorteado;
        int palpite;
        int tentativas = 0;

        numeroSorteado = (int) (Math.random() * 101);
        System.out.println("Um número entre 0 e 100 foi sorteado, Adivinhe qual é!");

        while (true) {
            System.out.print("Digite seu palpite (ou -1 ou maior 101 para desistir): ");
            palpite = input.nextInt();
            tentativas++;

            if (palpite < 0 || palpite > 100) {
                System.out.println("Você desistiu. O número correto era: " + numeroSorteado);
                break;
            } else if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você adivinhou o número corretamente em " + tentativas + " tentativas.");
                break;
            } else {
                if (Math.abs(palpite - numeroSorteado) > 10) {
                    System.out.println("Seu palpite está muito longe.");
                } else {
                    System.out.println("Seu palpite está mais perto.");
                }
            }
        }
    }

    private static void jogarEmDupla(Scanner input) {
        int numeroSorteado;
        int palpiteJogador1, palpiteJogador2;
        int tentativasJogador1 = 0, tentativasJogador2 = 0;

        numeroSorteado = (int) (Math.random() * 101);
        System.out.println("Um número entre 0 e 100 foi sorteado, Adivinhem qual é!");

        while (true) {
            System.out.print("Jogador 1, digite seu palpite (ou -1 ou maior 101 para desistir): ");
            palpiteJogador1 = input.nextInt();
            tentativasJogador1++;

            if (palpiteJogador1 < 0 || palpiteJogador1 > 100) {
                System.out.println("Jogador 1 desistiu. O número correto era: " + numeroSorteado);
                break;
            } else if (palpiteJogador1 == numeroSorteado) {
                System.out.println("Parabéns, Jogador 1! Você adivinhou o número corretamente em " + tentativasJogador1 + " tentativas.");
                break;
            } else {
                if (Math.abs(palpiteJogador1 - numeroSorteado) > 10) {
                    System.out.println("Palpite do Jogador 1 está muito longe.");
                } else {
                    System.out.println("Palpite do Jogador 1 está mais perto.");
                }
            }

            System.out.print("Jogador 2, digite seu palpite (ou -1 ou maior 101 para desistir): ");
            palpiteJogador2 = input.nextInt();
            tentativasJogador2++;

            if (palpiteJogador2 < 0 || palpiteJogador2 > 100) {
                System.out.println("Jogador 2 desistiu. O número correto era: " + numeroSorteado);
                break;
            } else if (palpiteJogador2 == numeroSorteado) {
                System.out.println("Parabéns, Jogador 2! Você adivinhou o número corretamente em " + tentativasJogador2 + " tentativas.");
                break;
            } else {
                if (Math.abs(palpiteJogador2 - numeroSorteado) > 10) {
                    System.out.println("Palpite do Jogador 2 está muito longe.");
                } else {
                    System.out.println("Palpite do Jogador 2 está mais perto.");
                }
            }
        }
    }
}

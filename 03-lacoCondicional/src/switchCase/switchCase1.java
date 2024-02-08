package switchCase;

import java.util.Scanner;

public class switchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("########## menu #######");
		System.out.println("\n -- Digite 1 para ver indicação de um livro --");
		System.out.println("--Digite 2 para ver ler uma frase Motivacional--");
		System.out.println("--Digite 3 para receber uma indicação de música");
		opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Livro: Harry potter - qualquer um");
			break;
		case 2:
			System.out.println("Frase: nunca é o pior dia da sua vida se tiver um proximo");
			break;
		case 3:
			System.out.println("Música: Pacato cidadão");
			break;
		default:
			System.out.println("não é uma opção irmão");
			break;
		}
		
	}

}

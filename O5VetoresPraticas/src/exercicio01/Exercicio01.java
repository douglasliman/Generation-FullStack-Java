package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numeroDigitado;
		
		System.out.println("Digite um número");
		numeroDigitado = input.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if(numeroDigitado == vetor[i]) {
				System.out.println("O número "+ numeroDigitado +" está localizado na posição " + (i));
				return;
			}
			
		}
		
		System.out.println("Número não encontrado");
		input.close();
	}

}

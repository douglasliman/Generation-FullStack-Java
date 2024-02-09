package doWhilePratica;

import java.util.Scanner;

public class DoWhilePratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero;
		int somaDosNumerosDigitados = 0;
		System.out.println("DIGITA ESSA MERDA");
		
		do {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			somaDosNumerosDigitados += numero;

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + somaDosNumerosDigitados);

		input.close();

	}

}

package doWhilePratica2;

import java.util.Scanner;

public class doWhilePratica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			int numero;
			int somaDosNumerosDigitados = 0;
			int voltas = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			if(numero % 3 == 0 && numero != 0 ) {	
				somaDosNumerosDigitados += numero;
					voltas++;
			}
		}while(numero != 0);	
		input.close();
		
		double media = 0;
		if(voltas > 0) {
			  media = (double) somaDosNumerosDigitados/ voltas;
		}
		System.out.println("A média de todos os números múltiplos de 3 é: "+ media);
		
	}

}

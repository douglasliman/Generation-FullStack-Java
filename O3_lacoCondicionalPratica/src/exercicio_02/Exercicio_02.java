package exercicio_02;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		

		
		int numeroInteiro;
		
		System.out.println("Escreva um número inteiro: ");
		numeroInteiro = input.nextInt();
		
		if(numeroInteiro % 2 == 0 && numeroInteiro > 0) {
			System.out.println("O Número " +numeroInteiro + " é par e positivo" );
			
		} if(numeroInteiro % 2 != 0 && numeroInteiro > 0) {
			System.out.println("O Número " +numeroInteiro + " é ímpar e positivo" );
			
		} if(numeroInteiro % 2 == 0 && numeroInteiro < 0 ) {
			System.out.println("O Número " +numeroInteiro + " é par e negativo" );
			
		} if(numeroInteiro % 2 != 0 && numeroInteiro < 0 ){
			System.out.println("O Número " +numeroInteiro + " é ímpar e negativo" );
		}
		
		
		input.close();
	}

}

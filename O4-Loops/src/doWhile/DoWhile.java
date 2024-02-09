package doWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resultado, contador = 2;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro");
			numero = input.nextInt();
			
			resultado = numero * 5;
			System.out.println("\n O resultado da multiplicação é: "+ resultado);
			
		}while(contador <= 2);
	}

}

package exercicico_01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		int numeroA, numeroB, numeroC ;
		
		System.out.println("Digite numero A");
		numeroA = input.nextInt();
		System.out.println("Digite numero B");
		numeroB = input.nextInt();
		System.out.println("Digite numero C");
		int soma = numeroA + numeroB;
		numeroC = input.nextInt();
		
		if( soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} if(soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		if (soma == numeroC){
			System.out.println("A Soma de A + B é Igual a C");
		}
		input.close();
	}

}

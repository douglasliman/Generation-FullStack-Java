package loopsPraticas;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroInicio, numeroFinal ;
		
		System.out.println("Escreva o primeiro número: ");
		numeroInicio = input.nextInt();
		
		System.out.println("Escreva o segundo número: ");
		numeroFinal = input.nextInt();
		
		if(numeroInicio >= numeroFinal || (numeroFinal - numeroInicio) < 0) {
		    System.out.println("Número final deve ser maior que o inicial ");
		}


		for (int i = numeroInicio; i <= numeroFinal; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				 System.out.println(i + " é múltiplo de 3 e 5");
			}
		
		}
		
		input.close();
	}

}

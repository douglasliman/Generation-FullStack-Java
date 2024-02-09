package loopsPraticas02;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int par = 0, impar = 0;
		
		int numeroInicio , numeroFinal;
		
		System.out.println("Número inicial: ");
		numeroInicio = input.nextInt();
		
		System.out.println("Número inicial: ");
		numeroFinal = input.nextInt();
		
		if (numeroInicio >= numeroFinal) {
            System.out.println("Número inicial não pode ser maior que o final");
            return;
        }
		
		
		for(int i = numeroInicio; i < numeroFinal; i++) {
			if(i %2 ==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros impares: " +  impar);
		
	}

}

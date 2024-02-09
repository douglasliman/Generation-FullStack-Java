package white;

import java.util.Scanner;

public class ExemploWhile {
		
	public static void main(String[] args) {
		
		String continua = "s";
		int numero1, numero2, resultado;
		
		Scanner input = new Scanner (System.in);
		
		while(!continua.equals("n")) {
			
			System.out.println("\n ======== MENU ========");
			
			System.out.println("\n Deseja dsomar dois valores?");
			System.out.println("\n Digite s para sim ou digite n para não: ");
			continua = input.nextLine();
			System.out.println("============= let's bora ===========");
			
			
			System.out.println("Digite primeiro valor: ");
			numero1 = input.nextInt();
			
			System.out.println("Digite segundo valor: ");
			numero2 = input.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado é: " + resultado);
		}
		
	}
}

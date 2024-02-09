package exemplo_01;

import java.util.Scanner;

public class exemplo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int contador;
		
		Scanner input = new Scanner(System.in);
		
		for(contador = 1; contador<4; contador++) {
			
			System.out.println("\n Digite o " + contador + "º o nome");
			nome = input.nextLine();
			System.out.println("O " + contador + "º o nome é " + nome);
		}

	}

}

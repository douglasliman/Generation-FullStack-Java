package laco4;

import java.util.Scanner;

public class LacoCOndicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, media;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = input.nextFloat();
			
		media = (nota1 + nota2)  / 2;
		
		if (media >= 6) {
			System.out.println("Aê passou!");
		}else {
			System.out.println("Bora estudar, passar de anooo");
		}
	}

}

package whilePratica;

import java.util.Scanner;

public class WhilePratica {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			int idade;
			
			int menor21 =0 , maior50 = 0;
		
			
			System.out.println("Digite uma idade ");
			idade = input.nextInt();
				
			while(idade >= 0) {
				if(idade <21) {
					menor21++;
				}else if(idade >50) {
					maior50++;
				}
			
				System.out.println("Digite uma idade ");
				idade = input.nextInt();
			}
			if(idade <0) {
				System.out.println("Idade invalida " + idade);
			}
			System.out.println("Total de pessoas menores de 21 anos:" + menor21 + "\n");
	        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
	        input.close();
	}

}

package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  
		  float numero1  , numero2;
		  
		  System.out.println("======CALCULADORA =======");
		  System.out.println("1 - SOMAR");
		  System.out.println("2 - SUBTRAÇÃO");
		  System.out.println("3 - MULTIPLICAÇÃO");
		  System.out.println("4 - DIVISÂO");
		  
		  
		  System.out.println("Digite o 1º número: ");
		  numero1 = input.nextFloat();
		  System.out.println("Digite o 1º número ");
		  numero2 = input.nextFloat();
		  
		  
		  int opcao ;
		  float calcular = 0;
		  
		  System.out.println("Escolha o que quer calcular ");
		  opcao = input.nextInt();
		  switch(opcao) {
		  	case 1:
			  calcular = numero1 + numero2;
			  break;
			case 2:
				 calcular = numero1 - numero2;
			  break;
			case 3:
				 calcular = numero1 * numero2;
				  break;
			case 4:
				 calcular = numero1 / numero2;
				  break;		
			default:
				System.out.println("Operação Inválida!");
		  }
		  
		  float result = calcular;
		  
		  System.out.println(numero1 +" + "+ numero2 + " = " + result );
		  
		  input.close();
	}

}

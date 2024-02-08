package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float saldo = 1000f;
		int operacao;
		
		 System.out.println("Digite o número da operação (1 - Saldo, 2 - Saque, 3 - Depósito): ");
	     operacao = input.nextInt();
	     
	     
	     switch(operacao) {
	     case 1:
	    	 System.out.println("Saldo atual: R$ " + saldo);
	    	 break;
	     case 2:
	    	 System.out.println("Digite o valor a ser sacado: ");
	    	 float valorSaque = input.nextFloat();
	    	 	if (valorSaque > saldo) {
	    	 		System.out.println("Saldo insuficiente para o saque.");
	    	 	} else {
	    	 		saldo -= valorSaque;
	    	 		System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
             }
	    	 break;
	     case 3:
	    	  System.out.println("Digite o valor a ser depositado:");
              float valorDeposito = input.nextFloat();
              saldo += valorDeposito;
              System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
             
	    	 break;
	    	 default:
	    		 System.out.println("Operação Inválida!");
	     }
	     input.close();
	}
}

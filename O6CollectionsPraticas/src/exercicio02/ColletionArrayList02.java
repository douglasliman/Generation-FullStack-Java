package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class ColletionArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numeroDesejaEncontrar;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDesejaEncontrar = input.nextInt();
		if (numeros.contains(numeroDesejaEncontrar)) {
			System.out.println(
					"\nA posição da nota " + numeroDesejaEncontrar + " é: " + numeros.indexOf(numeroDesejaEncontrar));
		} else {
			System.out.println("O número " + numeroDesejaEncontrar + " não foi encontrado!");
		}
		input.close();
	}
}

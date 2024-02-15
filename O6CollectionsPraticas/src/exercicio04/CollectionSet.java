package exercicio04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numeroDigitado;
		Set<Integer> numeros = new HashSet<Integer>();
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
		System.out.println("Digite Um número");
		numeroDigitado = input.nextInt();
		if (numeros.contains(numeroDigitado)) {
			System.out.println("\nO número " + numeroDigitado + " foi encontrado");
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
		input.close();
	}

}

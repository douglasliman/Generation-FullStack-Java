package exercicio03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Set<Integer> setDigitados = new HashSet<Integer>();
		System.out.println("Digite 10 valores únicos, não repetidos: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número "+ (i+1) +" não repita o números: ");
			setDigitados.add(input.nextInt());
		}
		input.close();
		System.out.println();
		System.out.println("Listando todos os elementos com iterator");
		Iterator<Integer> iSetDigitados = setDigitados.iterator();
		while (iSetDigitados.hasNext()) {
			System.out.println(iSetDigitados.next());
		}

	}

}

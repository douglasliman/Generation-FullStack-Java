package exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int qtdCores;
		ArrayList<String> coresDigitadas = new ArrayList<String>();

		System.out.println("Quantas cores você quer adicionar em número: ");
		qtdCores = input.nextInt();

		System.out.println("Digite cinco cores");
		for (int i = 0; i < qtdCores; i++) {
			System.out.println("Digite a " + (i + 1) + " cor: ");
			input.nextLine();
			coresDigitadas.add(input.next());
		}

		System.out.println("Cores cadastradas no interator: \n");
		Iterator<String> iCores = coresDigitadas.iterator();

		while (iCores.hasNext()) {
			System.out.println(iCores.next());
			System.out.println();

		}
		System.out.println();

		System.out.println("As cores oordenadas: ");
		Collections.sort(coresDigitadas);
		for (String cor : coresDigitadas) {
			System.out.println(cor);
		}

		input.close();
	}

}

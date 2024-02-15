package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConhecendoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> setLivros = new HashSet<String>();

		setLivros.add("It a Coisa");
		setLivros.add("Percy Jackson");
		setLivros.add("Harry Potter");
		setLivros.add("HellRaiser");
		setLivros.add("Le Petit Prince");
		setLivros.add("Harry Potter");

		System.out.println("Livros na coleção: \n" + setLivros);
		System.out.println();

		System.out.println("Tem o livro Harry Potter? \n " + setLivros.contains("Harry Potter"));
		System.out.println();

		System.out.println("Removendo um le petit prince da coleção: \n");
		System.out.println("Removendo: " + setLivros.remove("Le Petit Prince"));
		System.out.println();

		for (String livro : setLivros) {
			if (livro != null) {
				System.out.println("o HashCode do Elemento Livro " + livro + livro.hashCode());
			}
		}
		System.out.println();
		System.out.println("Listando todos os elementos com iterator");

		Iterator<String> iSetLivros = setLivros.iterator();

		while (iSetLivros.hasNext()) {
			System.out.println(iSetLivros.next());
		}
		System.out.println();
		System.out.println("está vazia?");
		System.out.println(setLivros.isEmpty());

		System.out.println();
		System.out.println("Agora está");
		setLivros.clear();
		System.out.println(setLivros);

		System.out.println();
		System.out.println("Livros na coleção: \n" + setLivros);

	}

}

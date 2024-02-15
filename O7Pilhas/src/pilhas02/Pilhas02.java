package pilhas02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pilhas02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Queue<String> listaLivros = new LinkedList<>();

		while (true) {
			System.out.println("** ====== Sistema de Livros ====== **");
			System.out.println("** Opção 1: Adicionar livro na pilha  ");
			System.out.println("** Opção 2: Listar todos os livros ");
			System.out.println("** Opção 3: Retirar livro da fila");
			System.out.println("** Opção 0: Sair \n");

			System.out.println(" --- Escolha uma Opção ---");
			int opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro para adicionar ele na pilha");
				input.nextLine();
				String livro = input.nextLine();
				listaLivros.offer(livro);
				System.out.println("O " + livro + " foi adicionado na fila de espera");
				break;
			case 2:
				System.out.println("Os livros na pilha são:  \n" + listaLivros);

				break;
			case 3:
				if (!listaLivros.isEmpty()) {
					String livroRemovido = listaLivros.poll();
					System.out.println("removendo livro... " + livroRemovido);
				} else {
					System.out.println("Não há livros na pilha!");
				}
				break;

			case 0:
				System.out.println("Adios ");
				input.close();

				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		}
	}

}

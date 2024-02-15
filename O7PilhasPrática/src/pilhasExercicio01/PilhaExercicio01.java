package pilhasExercicio01;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class PilhaExercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<>();

		int opcao;
		do {
			System.out.println(
					"\nMenu:\n1: Adicionar um novo Cliente na fila\n2: Listar todos os Clientes na fila\n3: Chamar (retirar) uma pessoa da fila\n0: Sair");
			System.out.print("Digite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nomeCliente = scanner.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				listarClientesNaFila(filaClientes);
				break;
			case 3:
				chamarCliente(filaClientes);
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Por favor, digite uma opção válida.");
			}
		} while (opcao != 0);

		scanner.close();
	}

	private static void listarClientesNaFila(Queue<String> filaClientes) {
		System.out.println("Fila:");
		for (String cliente : filaClientes) {
			System.out.println(cliente);
		}
	}

	private static void chamarCliente(Queue<String> filaClientes) {
		if (filaClientes.isEmpty()) {
			System.out.println("A Fila está vazia!");
		} else {
			String clienteChamado = filaClientes.poll();
			System.out.println("O Cliente '" + clienteChamado + "' foi Chamado!");
		}
	}

}

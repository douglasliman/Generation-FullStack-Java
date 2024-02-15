package pilhas;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pilhas01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		while (true) {
			System.out.println("** ====== Sistema de Atendimento ====== **");
			System.out.println("** Opção 1: Adicionar pessoa na fila  ");
			System.out.println("** Opção 2: Realizar Atendimento ");
			System.out.println("** Opção 3: Verificar Tamanho da fila ");
			System.out.println("** Opção 4: Sair \n");

			System.out.println(" --- Escolha uma Opção ---");
			int opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da pessoa para adciionar ela na fila");
				input.nextLine();
				String nome = input.nextLine();
				fila.offer(nome);
				System.out.println("O " + nome + " foi adicionado na fila de espera");
				break;
			case 2:
				if (!fila.isEmpty()) {
					String pessoaAtendida = fila.poll();
					System.out.println("Atendendo... " + pessoaAtendida);
				} else {
					System.out.println("Não há ninguém na fila de espera!");
				}
				break;
			case 3:
				System.out.println("O tamanho da fila de espera é: " + fila.size());
	
				break;
			case 4:
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

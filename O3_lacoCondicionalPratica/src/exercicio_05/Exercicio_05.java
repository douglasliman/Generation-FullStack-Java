package exercicio_05;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int numeroComida, quantidade;

		System.out.println("=======  HAMBURGUERS =======");
		System.out.println("1 - Cachorro quente      10.00");
		System.out.println("2 - X-Salada             15.00");
		System.out.println("3 - X-Bacon              18.00");
		System.out.println("4 - Bauru                12.00");

		System.out.print("Código do Produto: ");
		numeroComida = input.nextInt();

		System.out.print("Quantidade: ");
		quantidade = input.nextInt();

		double precoUnitario = 0.0;
		String nomeProduto = "";

		switch (numeroComida) {
		case 1:
			precoUnitario = 10.00;
			nomeProduto = "Cachorro Quente";
			break;
		case 2:
			precoUnitario = 15.00;
			nomeProduto = "X-Salada";
			break;
		case 3:
			precoUnitario = 18.00;
			nomeProduto = "X-Bacon";
			break;
		case 4:
			precoUnitario = 12.00;
			nomeProduto = "Bauru";
			break;

		default:
			System.out.println("Código do comida não existe ");
			break;
		}

		int numeroBebida, quantidadeBebida;

		System.out.println("======= Sucos e Refris =======");
		System.out.println("1 - Refrigerante          8.00");
		System.out.println("2 - Suco de Laranja      13,00");

		System.out.print("Código do Produto: ");
		numeroBebida = input.nextInt();

		System.out.print("Quantidade: ");
		quantidadeBebida = input.nextInt();

		double precoUnitarioBebida = 0;
		String nomeBebida = "";

		switch (numeroBebida) {
		case 1:
			precoUnitarioBebida = 8.00;
			nomeBebida = "Refrigerante";
			break;
		case 2:
			precoUnitarioBebida = 13.00;
			nomeBebida = "Suco de laranja";
			break;
		default:
			System.out.println("Código do produto não existe ");
			break;
		}

		double valorTotal = (quantidade * precoUnitario) + (precoUnitarioBebida * quantidadeBebida);
		System.out.println("\nProduto: " + nomeProduto);
		System.out.println("\nProduto: " + nomeBebida);
		System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));

		input.close();
	}

}

package exercicio_06;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name;
		int employeeCode;
		float salary;
		System.out.print("Nome do funcionário: ");
		name = input.nextLine();

		System.out.println("=======  Cargos =======");
		System.out.println("1 - Gerente                  10%");
		System.out.println("2 - Vendedor                 7%");
		System.out.println("3 - Supervisor               9%");
		System.out.println("4 - Motorista                6%");
		System.out.println("5 - Estoquista               5%");
		System.out.println("6 - Técnico de TI            8%\n");

		System.out.print("Código do Cargo (1 a 6): ");
		employeeCode = input.nextInt();

		System.out.print("Salário: R$ ");
		salary = input.nextFloat();

		int reajuste = 0;
		String cargo = "";

		switch (employeeCode) {
		case 1:
			reajuste = 10;
			cargo = "Gerente";
			break;
		case 2:
			reajuste = 7;
			cargo = "Vendedor";
			break;
		case 3:
			reajuste = 9;
			cargo = "Supervisor";
			break;
		case 4:
			reajuste = 6;
			cargo = "Motorista";
			break;
		case 5:
			reajuste = 5;
			cargo = "Estoquista";
			break;
		case 6:
			reajuste = 8;
			cargo = "Técnico de TI";
			break;
		default:
			System.out.println("Código do cargo não existe");
			break;
		}

		float newSalary = salary + (reajuste / 100.0f) * salary;

		System.out.println("\nNome do colaborador: " + name);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + newSalary);

		input.close();
	}
}

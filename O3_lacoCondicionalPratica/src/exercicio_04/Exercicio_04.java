package exercicio_04;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String type, especie, whatIsEat;

		System.out.println("É tipo se é Vertebrado ou Invertebrado:");
		type = input.next();

		if (type.equalsIgnoreCase("vertebrado")) {

			System.out.println("É uma Ave ou um Mamífero");
			especie = input.next();

			if (especie.equalsIgnoreCase("ave")) {

				System.out.println("Ele é Onívoro ou Carnívoro?");
				whatIsEat = input.next();

				if (whatIsEat.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pombo");
				}

			} else if (especie.equalsIgnoreCase("mamífero")) {

				System.out.println("Ele é Onívoro ou Herbívoro?");
				whatIsEat = input.next();
				if (whatIsEat.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}
		} else if (type.equalsIgnoreCase("invertebrado")) {

			System.out.println("É uma Inseto ou um Anelídeo");
			especie = input.next();

			if (especie.equalsIgnoreCase("inseto")) {

				System.out.println("Ele é hematófago ou herbívoro?");
				whatIsEat = input.next();

				if (whatIsEat.equalsIgnoreCase("hematófago")) {
					System.out.println("pulga");
				} else {
					System.out.println("largata");
				}
			} else if (especie.equalsIgnoreCase("anelídeo")) {

				System.out.println("Ele é Onívoro ou Herbívoro?");
				whatIsEat = input.next();
				if (whatIsEat.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
				}
			}

		}
		input.close();

	}
}

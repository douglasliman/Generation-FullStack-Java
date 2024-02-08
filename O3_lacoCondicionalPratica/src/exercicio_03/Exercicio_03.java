package exercicio_03;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean isFirstTime;

        System.out.println("Digite o Nome do doador:");
        name = input.nextLine();
        System.out.println("Digite a Idade do doador:");
        age = input.nextInt();

        if (age < 18 || age >= 70) {
            System.out.println("Lamento " + name + ", você não pode doar sangue.");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Obrigado " + name + " por vir doar sangue.");
        } else if (age >= 61 && age <= 69) {
            System.out.println("É a primeira vez que " + name + " doa sangue? sim / não ");
            String answer = input.next();
            isFirstTime = answer.equalsIgnoreCase("não") || answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("ñ") || answer.equalsIgnoreCase("nao");
            if (isFirstTime) {
                System.out.println("Parabéns " + name + ", está apto a doar sangue.");
            } else {
                System.out.println("Lamento " + name + ", você não pode doar sangue.");
            }
        }

        input.close();
    }
}

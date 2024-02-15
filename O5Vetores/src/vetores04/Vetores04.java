package vetores04;

import java.util.Scanner;

public class Vetores04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetorInteiros[] = new int[5];
        Scanner leia = new Scanner(System.in);
        
        for(int indice = 0; indice < 5; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            vetorInteiros[indice] = leia.nextInt();
        }
        
        System.out.println("\nOs números digitados foram: \n");
        
        for(int indice = 0; indice < 5; indice++) {
            System.out.println((indice + 1) + "º número: " + vetorInteiros[indice]);
        }
	}

}

package vetores06;

import java.util.Arrays;
import java.util.Collections;

public class Vetores06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String array_nomes[] = {"Samantha", "Amanda", "Vinicius", "Cauê", "Leonardo"};

        Arrays.sort(array_nomes);
        
        System.out.println("Array em Ordem Crescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
        
        Arrays.sort(array_nomes, Collections.reverseOrder());
        
        System.out.println("\nArray em Ordem Decrescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
	}

}

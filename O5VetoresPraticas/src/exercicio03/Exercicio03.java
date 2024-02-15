package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] numerosInseridos = {
	            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	        };
		
	    System.out.println("Elementos da Diagonal Principal:");
	    for (int i = 0; i < numerosInseridos[0].length; i++) {
	        System.out.print(numerosInseridos[0][i][i] + " ");
	    }
	    
	    System.out.println("\nElementos da Diagonal Secundária:");
	    int n = numerosInseridos[0].length;
	    for (int i = 0; i < n; i++) {
	        System.out.print(numerosInseridos[0][i][n - 1 - i] + " ");
	    }
	    
	    
	    
        int n1 = numerosInseridos[0].length;
        int somaDiagonalPrimaria = 0;
        for (int i = 0; i < n1; i++) {
         
            somaDiagonalPrimaria += numerosInseridos[0][i][i];
        }
        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrimaria);
    
  
        int n2 = numerosInseridos[0].length;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n1; i++) {
   
            somaDiagonalSecundaria += numerosInseridos[0][i][n2 - 1 - i];
        }

        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	
	}

}

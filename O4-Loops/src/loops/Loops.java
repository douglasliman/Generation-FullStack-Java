package loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		int num4 = 8;
		int num5 = 10;
		int num6 = 11;
		int num7 = 14;
		int num8 = 16;
		int num9 = 18;
		int num10 = 20;

		
		int[] numeros = { num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
		
		int oddsAddition = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			
			if(isOdd(numero)) {
				   System.out.println(numero + " é ímpar");
			}else {
				
				System.out.println(numero + " é par");
			}
		}
		System.out.println("");
	}	
	public static boolean isOdd(int numero) {
		return numero %2 !=0;
		
	}
	
	
}

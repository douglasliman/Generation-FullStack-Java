package vetores;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] inteiros = {1, 12, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(inteiros[3]);
		System.out.println(inteiros);
		
		char [] charac = {'a','b','c','d','e','f'};	
		char [] shrek = new char[10];
		
		System.out.println(charac[5]);
		System.out.println(charac);
		
		for (int i = 0; i < inteiros.length; i++) {
            System.out.println(inteiros[i]);
        }
		
		for (int i = 0; i < charac.length; i++) {
		    System.out.print(charac[i] + " ");
		}
		
		int [] vec = new int [7];
		System.out.println(vec);
	
		
		for (int i = 0; i < 6; i++) {
          vec[i] = i;
          System.out.println(vec[i]);
        }
	}

}

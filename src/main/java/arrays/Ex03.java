package arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] numeros2 = new int[4];
		numeros2[0] = 50;
		numeros2[1] = 40;
		numeros2[2] = 66;
		numeros2[3] = 75;
		
		for (int i = 0; i < numeros2.length; i++ ) {
			System.out.println("nota na posição: " + i + ": valor -> " + numeros2[i]);
		}
		
	}
}

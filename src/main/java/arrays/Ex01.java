package arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] numeros2 = new int[4];
		numeros2[0] = 50;
		numeros2[1] = 40;
		numeros2[2] = 66;
		numeros2[3] = 75;
		
		System.out.println("Valor atual: " + numeros2[2]);
		
		numeros2[2] = 86;
		
		System.out.println("valor trocado: " + numeros2[2]);
		
	}
}

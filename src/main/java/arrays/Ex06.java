package arrays;

public class Ex06 {
	public static void main(String[] args) {
		int[] notas= new int[4];
		notas[0] = 50;
		notas[1] = 40;
		notas[2] = 75;
		notas[3] = 66;
		
		
		int maior = notas[0];
		
		for (int n : notas) {
			if (n > maior) {
				maior = n;
			}
		}
		
		System.out.println("Maior número é: " + maior);
		
	}
}

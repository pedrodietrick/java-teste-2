package arrays;

public class Ex07 {
	public static void main(String[] args) {
		
		int[] notas = new int[4];
		notas[0] = 50;
		notas[1] = 40;
		notas[2] = 66;
		notas[3] = 75;
		
		double total = 0;
		
		for (int n : notas) {
			total += n;
		}
		
		double media = total / notas.length;
		
		System.out.println("Total é: " + total);
		
	}
}

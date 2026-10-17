package arrays;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valores = new int[5];
		
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Qual o numero na posição: " + i + "?");
			valores[i] = scanner.nextInt();
		}
		
	}
}

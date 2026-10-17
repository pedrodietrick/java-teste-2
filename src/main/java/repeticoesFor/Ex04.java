package repeticoesFor;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int nota = -1;
		while (nota < 0 || nota > 10) {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Validado com sucesso.");
		
	}
}

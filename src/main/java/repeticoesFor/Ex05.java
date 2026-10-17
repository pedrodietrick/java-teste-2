package repeticoesFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> notas = new ArrayList<Integer>();
		int nota = 0;
		int contador = 1;
		System.out.println("Informe o -1 para sair do sistema: ");
		
		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = scanner.nextInt();
			if(nota >= 0) {
			notas.add(nota);
			contador ++;
			}
		}
		scanner.close();
		System.out.println("Nota que foram informadas: ");
		for (Integer n: notas) {
			System.out.println("notas informadas: " + n);
		}
	}
}

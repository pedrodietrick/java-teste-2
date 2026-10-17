package repeticoesFor;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		do {
			if(opcao == -1) {
			System.out.println("=========MENU==========");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("0 - Sair (ENCERRAR)");
			System.out.println("Escolha uma opcao.");
			}
			if(opcao == 1) {
				System.out.println("Opcao cadastro");
			} else if (opcao == 2) {
				System.out.println("Listar");
			}
			else if (opcao == 3) {
				System.out.println("Remover");
			}
			else if(opcao >= 4) {
				System.out.println("Invalido");
			}
				
	
			opcao = scanner.nextInt();
			
		} while(opcao != 0);
		
	}
}

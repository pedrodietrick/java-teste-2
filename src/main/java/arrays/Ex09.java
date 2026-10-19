package arrays;

public class Ex09 {
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4];
		
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		
		matriz[1][0] = 50;
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;
		
		matriz[2][0] = 90;
		matriz[2][1] = 100;
		matriz[2][2] = 110;
		matriz[2][3] = 120;
		
		
		System.out.println("Quantidades de linhas: " + matriz.length);
		
		System.out.println("Quantidade de colunas: " + matriz[0].length);
		
		for (int linha = 0; linha < matriz.length; linha ++) { //for linhas
			
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) { //for colunas
				System.out.println("Linha: " + linha + " Valor da coluna: " + matriz[linha][coluna]);
			}
			
		}
		
	}
}

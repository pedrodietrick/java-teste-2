package estruturascondicionais;

public class Ex02 {
	public static void main(String[] args) {
		
		double nota = 4.9;
		if (nota >= 9) {
			System.out.println("Excelente, aprovado");
		}else if (nota >= 7.0){
			System.out.println("Aprovado");
		} else if (nota >=5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
}

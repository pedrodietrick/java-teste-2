package estruturascondicionais;

public class Ex06 {
	public static void main(String[] args) {
		
		Object valor = "Java";
		
		if(valor instanceof String) {
			String texto = (String) valor;
			System.out.println(texto.toUpperCase());
		}
		
		if(valor instanceof String texto) {
			System.out.println(texto.toUpperCase());
		}
	}
}

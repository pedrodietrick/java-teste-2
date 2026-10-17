package estruturascondicionais;

public class Ex03 {
	public static void main(String[] args) {
		
		int idade = 27;
		
		if ( idade == 18) {
			System.out.println("Maior de 18");
		}
		if (idade != 18) {
			System.out.println("Não tem 18 anos");
		}
		if (idade >= 18) {
			System.out.println("Pessoa maior de 18");
		}
		else {
			System.out.println("Pessoa menor de idade");
		}
		
		
		String senha = "sds88999";
		
		if(senha != null && !senha.isEmpty()) {
			System.out.println("Processar e verificar a senha.");
		}else {
			System.out.println("Senha deve ser informada.");
		}
		
		
	}
}

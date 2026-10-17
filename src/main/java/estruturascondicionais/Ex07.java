package estruturascondicionais;

public class Ex07 {
	public static void main(String[] args) {
		
		String nome = "Pedro Dietick";
		int idade = 29;
		
		if(nome == null || nome.isBlank() || nome.equals("-")) {
			throw new IllegalArgumentException("Nome Obrigatorio");
		}
		
		
		if(idade <= 0) {
			throw new IllegalArgumentException("idade deve ser informada");
				
		}
		
		System.out.println("Meu nome: " + nome  + " Idade é: " + idade);
		
	}
}

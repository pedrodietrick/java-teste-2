package estruturascondicionais;

public class Ex08 {
	public static void main(String[] args) {
		
		String nome = "Pedro";
		int idade = 29;
		double salario = 1500;
		
		if(nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome deve ser informado");
		}
		if(idade < 18) {
			throw new IllegalArgumentException("Idade deve ser inforamda");
		}
		if(salario < 1500) {
			throw new IllegalArgumentException("Salario deve ser maior que 1500");
		}
		salvar();
		
	}
	
	public static void salvar() {
		System.out.println("Salvando");
	}
	
}

package estruturascondicionais;

public class Ex04 {
	public static void main(String[] args) {
		
		String opcao = "B";
		
		if(opcao.equals("A")) {
			System.out.println("Administrador");
		}else if(opcao.equals("U")) {
			System.out.println("Usuario");
		}else {
			System.out.println("Invalida");
		}
		
		
		//Switch
		
		switch(opcao) {
		case "A":
			System.out.println("Administrador");
			break;
		case "U":
			System.out.println("Usuario");
			break;
		default:
			System.out.println("Invalido");
		}
		
		
		String retorno = switch (opcao) {
		case "A"-> "Administrador";
		case "U"-> "Usuario";
		default -> "Invalido";
		};
		
		System.out.println("Valor do retorno: " + retorno);
		
	}
}

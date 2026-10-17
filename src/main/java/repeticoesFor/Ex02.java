package repeticoesFor;

public class Ex02 {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 3500;
		
		Produto p2 = new Produto();
		p2.nome = "Mouse";
		p2.preco = 80;
		
		
		Produto p3 = new Produto();
		p3.nome = "Teclado";
		p3.preco = 120;
		
		Produto[] produtos = {p1, p2, p3};
		
		System.out.println("===========Percorrendo o Array com indices==============");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Nome: " + produtos[i].nome);
			System.out.println("Preço: " + produtos[i].preco);
			System.out.println("=========Novo produto/valor=============");
		}
		
		System.out.println();
		
	}
}

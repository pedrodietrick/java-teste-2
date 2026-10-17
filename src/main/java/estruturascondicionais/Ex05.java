package estruturascondicionais;

public class Ex05 {
	public static void main(String[] args) {
		
		StatusPedido statusPedido = StatusPedido.ENVIADO;
		
		String retorno = switch (statusPedido) {
		case NOVO -> "Seu pedido foi criado";
		case CANCELADO -> "Seu pedido acaba de ser cancelado";
		case PAGO -> "Recebemos o pagamento do seu pedido";
		case ENVIADO -> "Seu pedido acaba de ser enviado para a transportadora";
		default -> "Invalido";
		};
		
		System.out.println("Status do pedido: " + retorno);
		
	}
}


public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTranserencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if(sucessoTranserencia) {
			System.out.println("transerencia com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}

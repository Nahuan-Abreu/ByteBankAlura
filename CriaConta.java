
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiriaConta = new Conta();
		primeiriaConta.saldo = 200;
		System.out.println(primeiriaConta.saldo);
		
		primeiriaConta.saldo += 100;
		System.out.println(primeiriaConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("primeira conta tem " + primeiriaConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiriaConta.agencia);
		System.out.println(primeiriaConta.numero);
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);
		
		if(primeiriaConta == segundaConta) {
			System.out.println("sao a mesmemissima conta");
		}else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiriaConta);
		System.out.println(segundaConta);
		
		
	}

} 


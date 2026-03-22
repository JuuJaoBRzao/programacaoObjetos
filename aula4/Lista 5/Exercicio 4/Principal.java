package pkg;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();
		novaConta.definirSaldoInicial(1000);
		System.out.println("Saldo atual : "+novaConta.saldo);
		
		novaConta.sacar(500);
		System.out.println("Saldo atual: " +novaConta.saldo);
		novaConta.depositar(50);
		System.out.println("Saldo atual: " +novaConta.saldo);
		novaConta.sacar(600);
		System.out.println("Saldo atual: " +novaConta.saldo);
	}

}

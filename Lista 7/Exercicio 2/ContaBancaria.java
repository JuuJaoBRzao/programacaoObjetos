package pkg;

public class ContaBancaria {
	public String titular;
	public float saldo;
	
	public void valores(String ti, float sa) {
		titular = ti;
		saldo = sa;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
			return true;
		} else {
			System.out.println("Saldo insuficiente para realizar o saque!");
			return false;
		}
	}
	
	public void transferir(double valor, ContaBancaria destino) {
		System.out.println("Transferindo valor...");
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo na conta: "+saldo);
	}
}

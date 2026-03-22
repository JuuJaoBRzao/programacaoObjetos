package pkg;

public class ContaCorrente {
	public float saldo;
	
	public void definirSaldoInicial (float valor){
		saldo = valor;
	}
	
	public void depositar(float valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public boolean sacar(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
			return true;
		} else {
			System.out.println("Saldo insuficiente para realizar o saque!");
			return false;
		}
	}
}

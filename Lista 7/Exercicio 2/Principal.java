package pkg;

public class Principal {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		c1.depositar(1000);
		c1.consultarSaldo();
		c1.sacar(500);
		c1.sacar(1500);
		c1.depositar(150);
		c1.transferir(100, c2);
		c1.consultarSaldo();
	}
}

package pkg;

public class Main {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		Cliente c = new Cliente("Guilherme", 15);
		
		double precoNormal = p.calcularPrecoFinal(100.00);
		double precoFinal = p.calcularPrecoFinal(100.00, c);
		
		System.out.println("Preço normal: "+precoNormal);
		System.out.println("Preco final: "+precoFinal);

	}

}

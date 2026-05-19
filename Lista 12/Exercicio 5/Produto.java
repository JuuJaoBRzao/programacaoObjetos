package pkg;

public class Produto {
	
    public double calcularPrecoFinal(double preco) {
        return preco;
    }
    
    public double calcularPrecoFinal(double preco, Cliente cliente) {
        double valorDesconto = preco * (cliente.desconto / 100);
        return preco - valorDesconto;
    }
}

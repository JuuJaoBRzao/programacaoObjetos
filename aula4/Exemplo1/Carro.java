package pkg;

public class Carro {
	public String marca;
	public String modelo;
	
	public void alugar() {
		System.out.println("O carro de " +marca+ " e " +modelo+ " foi alugado");
	}
	
	public void devolver() {
		System.out.println("O carro " +marca+ " e " +modelo+ " foi devolvido");
	} 
	
	public void exibirDados() {
		System.out.println("Marca de carro: "+marca);
		System.out.println("Modelo do carro: "+modelo);
	}
}

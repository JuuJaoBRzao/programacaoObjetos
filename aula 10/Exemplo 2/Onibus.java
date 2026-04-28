package pkg;

public class Onibus extends Carro {
	
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		chassi = "skdfjhskhf";
	}
	
	public void exibeMsg() {
		System.out.println("Esotu na classe onibus");
		System.out.println("O onibus é: " +nome);
		System.out.println("Modelo: " +modelo);
	}
}

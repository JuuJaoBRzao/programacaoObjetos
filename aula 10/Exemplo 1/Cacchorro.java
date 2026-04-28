package pkg;

public class Cacchorro extends Animal {

	protected String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println("Som:" +som);
	}
	
	public void exibir() {
		System.out.println("Nome do animal: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Raça: "+raca);
	}
}

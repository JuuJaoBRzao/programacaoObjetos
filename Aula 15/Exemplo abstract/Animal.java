package projeto;

public abstract class Animal {
	public String especie;
	public int idade;
	public String raca;
	
	public abstract void emiteSom();
	public abstract void cuidarPatio();
	
	public void exibeInfo() {
		System.out.println("Especie: "+especie);
		System.out.println("Idade: "+idade);
	}
}

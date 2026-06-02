package projeto;

public class Cachorro implements Animal {
	public String nome;
	public String raca;
	public int idade;
	
	@Override
	public void emitirSom() {
		System.out.println("sdajsjsdasjkl");	
		
	}

	@Override
	public void exibirInfo() {
		System.out.println("Cachorro: ");
		System.out.println("Nome: "+nome);
		System.out.println("Raca: "+raca);
		System.out.println("Idade: "+idade);
		
	}

	@Override
	public boolean verificaVacinacao() {
		System.out.println("Verificando vacinacao do cachorro...");
		return false;
	}

}

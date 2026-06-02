package projeto;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "graggle simpson";
		c.raca = "simpson";
		c.idade = 67;
		
		c.emitirSom();
		c.exibirInfo();
		System.out.println("Chamando verificação cachorro: "+c.verificaVacinacao());
		
		Gato g = new Gato();
		g.emitirSom();
		g.exibirInfo();
		System.out.println("Chamando verificacao gato: "+g.verificaVacinacao());
		

	}

}

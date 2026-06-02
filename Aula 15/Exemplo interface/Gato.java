package projeto;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("glub glub");
		
	}

	@Override
	public void exibirInfo() {
		System.out.println("gato");
		
	}

	@Override
	public boolean verificaVacinacao() {
		System.out.println("Verificando vacinacao do gato...");
		return false;
	}

}

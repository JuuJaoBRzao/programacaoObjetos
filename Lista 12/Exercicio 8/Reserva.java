package pkg;

public class Reserva {
	protected String nome;
	
	public Reserva(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionar() {
		System.out.println("Adicionando reserva no nome: "+nome);
	}
	
	public void cancelar() {
		System.out.println("Cancelando reserva no nome: "+nome);
	}
}

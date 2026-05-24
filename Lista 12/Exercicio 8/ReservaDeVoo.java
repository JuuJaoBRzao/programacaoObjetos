package pkg;

public class ReservaDeVoo extends Reserva{

	public ReservaDeVoo(String nome) {
		super(nome);
	}
	
	@Override
	public void adicionar() {
		System.out.println("Adicionando assento economico para: "+nome);
	}
	
	public void adicionar(String classe) {
		System.out.println("Adicionando assento da classe "+classe+ " para: "+nome);
	}
	
	public void cancelar(String nome) {
		System.out.println("Cancelando assentos de: "+nome);
	}
}

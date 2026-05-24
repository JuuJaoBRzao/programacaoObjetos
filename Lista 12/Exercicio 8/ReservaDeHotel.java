package pkg;

public class ReservaDeHotel extends Reserva{

	public ReservaDeHotel(String nome) {
		super(nome);
	}
	
	@Override
	public void adicionar() {
		System.out.println("Adicionar reserva de hotel no nome: "+nome);
	}
	
	@Override
	public void cancelar() {
		System.out.println("Cancelar reserva de hotel no nome: "+nome);
	}
}

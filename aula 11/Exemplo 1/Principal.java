package ythyu;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.fazerSom();
		
		System.out.println("Cachorro: ");
		Cachorro c = new Cachorro();
		c.fazerSom();
		
		a = new Cachorro();
		a.fazerSom();
		Passarinho p = new Passarinho();
		p.fazerSom();
		Peixe pe = new Peixe();
		pe.fazerSom();
	}

}

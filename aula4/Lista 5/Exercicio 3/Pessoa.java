package pkg;

public class Pessoa {
	public String nome;
	public String email;
	public String dataNascimento;
	public String endereco;
	public boolean admin;
	
	public void promoverAdmin() {
	    admin = true;
	}
	
	public void administrador() {
		if (admin == true) {
			System.out.println("Promovido para admin");
		} else {
			System.out.println("Não é administrador");
		}
	}
	
	public String retornaEM() {
		return email;
	}
}

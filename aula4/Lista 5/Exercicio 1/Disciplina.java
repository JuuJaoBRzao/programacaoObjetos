package pkg;

public class Disciplina {
	public String nome;
	public String cargaHoraria;
	public String professor;
	
	public void atribuirValores(String no, String hora, String profe) {
		nome = no;
		cargaHoraria = hora;
		professor = profe;
	}
	
	public String retornaNO() {
		return nome;
	}
	
	public String retornaHora() {
		return cargaHoraria;
	}
	
	public String retornaProfe() {
		return professor;
	}
}

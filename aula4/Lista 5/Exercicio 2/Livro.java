package pkg;

public class Livro {
	public String titulo;
	public String autor;
	public String anoPublicacao;
	public String genero;
	public boolean emprestado;
	
	public void emprestar() {
	    emprestado = true;
	}

	public void devolver() {
	    emprestado = false;
	}
	
	public void emprestimo() {
		if (emprestado == true) {
		    System.out.println("O livro " + titulo + " do autor " + autor + " foi emprestado");
		} else {
		    System.out.println("O livro " + titulo + " do autor " + autor + " não foi emprestado");
		}
	}
	
	public String retornaTI() {
		return titulo;
	}
	
	public String retornaAU() {
		return autor;
	}
	
	public String retornaAP() {
		return anoPublicacao;
	}
	
	public String retornaGE() {
		return genero;
	}
}

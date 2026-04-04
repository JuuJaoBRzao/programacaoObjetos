package pkg;

public class Livro {
	public String titulo;
	public String autor;
	public int paginas;
	public boolean emprestado;
	
	public void valores(String ti, String au, int pg) {
		titulo = ti;
		autor = au;
		paginas = pg;
	}
	
	public void emprestar() {
	    emprestado = true;
	}
	
	public void devolver() {
	    emprestado = false;
	}
	
	public void estaDisponivel() {
		if (emprestado == true) {
		    System.out.println("O livro " + titulo + " do autor " + autor + " foi emprestado");
		} else {
		    System.out.println("O livro " + titulo + " do autor " + autor + " não foi emprestado");
		}
	}
	
	public void detalhesLivro() {
		System.out.println("Detalhes do livro");
	}
}

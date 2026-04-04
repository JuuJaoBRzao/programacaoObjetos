package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Livro l = new Livro();
		System.out.println("Digite o titulo do livro: ");
		l.titulo= teclado.nextLine();
		System.out.println("Digite o autor do livro: ");
		l.autor = teclado.nextLine();
		System.out.println("O livro está emprestado? (true/false): ");
		l.emprestado = teclado.nextBoolean();
		
		System.out.println("Titulo do livro: "+l.titulo);
		System.out.println("Autor: "+l.autor);
		l.estaDisponivel();
	}
}

package ythyu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = teclado.nextLine();
		
		Pessoa p = new Pessoa();
		p.dizerOla();
		p.dizerOla(nome);
	}

}

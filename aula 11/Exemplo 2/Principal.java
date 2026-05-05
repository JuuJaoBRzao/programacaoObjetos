package ythyu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Pessoa pessoa;
		System.out.println("Digite 1 para pessoa");
		System.out.println("Digite 2 para programador");
		int op = teclado.nextInt();
		
		if (op == 1) {
			pessoa = new Pessoa();
			pessoa.trabalhar();
			
		} else if (op == 2) {
			pessoa = new Programador();
			pessoa.trabalhar();
		}
	
	}

}

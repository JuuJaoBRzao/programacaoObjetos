package pkg;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		try {
		System.out.println("Digite um numero inteiro: ");
		int n = teclado.nextInt();
		
		double raiz = Math.sqrt(n);
		System.out.println("Raiz do numero: "+raiz);
		} catch (InputMismatchException e) {
			System.out.println("Erro: caracter ou valor invalido\n");
		} catch (Exception e) {
			System.out.println("Exceção: "+e.getMessage());
		}
		
		teclado.close();
	}

}

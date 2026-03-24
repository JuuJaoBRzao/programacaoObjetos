package pkg;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		try {
		int premio = 5000;
		System.out.println("Digite quantas pessoas vão dividir o prêmio");
		int n = teclado.nextInt();
		
		double resultado = premio / n;
		System.out.println("O premio ficou "+ resultado +" para "+ n + " pessoas");
		
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero\n");
		} catch (InputMismatchException e) {
			System.out.println("Numero incorreto digitado\n");
		}
		
		teclado.close();
	}

}

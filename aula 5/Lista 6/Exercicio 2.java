package pkg;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		try {
			System.out.println("Digite o primeiro numero: ");
			int n1 = teclado.nextInt();
			System.out.println("Digite o segundo numero: ");
			int n2 = teclado.nextInt();
			
			System.out.println("Soma: "+(n1 + n2));
			System.out.println("Subtração: "+(n1 - n2));
			System.out.println("Multiplicação: "+(n1 * n2));
			System.out.println("Divisão: "+(n1 / n2));
			
		} catch (ArithmeticException e) {
			System.out.println("Erro: Numero dividido por zero" +e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erro: Digite apenas numeros inteiros" +e.getMessage());
		}
		
		teclado.close();
	}

}

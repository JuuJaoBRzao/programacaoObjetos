package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		String palavra = teclado.nextLine();
			
		try {
			double numero = Double.parseDouble(palavra);
			System.out.println("Número: " + numero);
		} catch (NumberFormatException e){
			System.out.println("Valor inválido!");
		}
		
		teclado.close();
	}
}

package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		int numero = teclado.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		System.out.println("Resultado: "+fatorial);
	}

}

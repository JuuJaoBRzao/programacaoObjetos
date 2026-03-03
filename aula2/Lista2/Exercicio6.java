package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 99; i++) {
			System.out.println("Digite um numero inteiro ou digite 0 para sair do programa: ");
			int n = teclado.nextInt();
			System.out.println("Numero digitado: "+n);
			
			if (n == 0) {
				System.out.println("Saindo do programa...");
				break;
			}
		}
	}
}

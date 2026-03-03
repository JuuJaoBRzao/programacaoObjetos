package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i <= 100; i++) {
			soma += i;
			
		}
		System.out.println("Soma dos numeros: "+soma);
	}

}

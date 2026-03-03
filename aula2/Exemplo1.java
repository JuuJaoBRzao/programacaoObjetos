package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um inteiro: ");
		int n = teclado.nextInt();
		System.out.println("Int digitado: "+n);
		System.out.println("Digite um double: ");
		double n1 = teclado.nextDouble();
		System.out.println("Double digitado: "+n1);
		teclado.nextLine(); //tirar enter do double
		System.out.println("Digite uma palavra para ler com nextLine: ");
		String palavra  = teclado.nextLine();
		System.out.println("Palavra digitada: "+palavra);
		System.out.println("Digite uma palavra para ler com next: ");
		palavra = teclado.next();
		System.out.println("Palavra digitada com .next "+palavra);
		teclado.close();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i vale: "+i);
		}

		int i = 0;
		while(i < 10) {
			System.out.println("i vale com while: "+i);
			i++;
		}
		
		int i = 0;
		do {
			System.out.println("i vale com do while: "+i);
		}
	
	}

}

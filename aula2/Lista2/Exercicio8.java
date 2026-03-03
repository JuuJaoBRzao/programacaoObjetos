package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cidade;
		
		do {
			System.out.println("Digite uma cidade (São Paulo sairá do programa)");
			cidade = teclado.nextLine();
		} while (!cidade.equals("São Paulo"));
			
			System.out.println("Programa encerrado");
	}
}

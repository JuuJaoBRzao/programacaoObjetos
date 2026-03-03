package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 99; i++) {
			System.out.println("Digite a nota do aluno ou digite -1 para sair do programa: ");
			float n = teclado.nextFloat();
			System.out.println("Nota: "+n);
			
			if (n == -1) {
				System.out.println("Saindo do programa...");
				break;
			}
		}
	}

}

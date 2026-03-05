package pkg;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float notas[] = new float[5];

		int soma = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota "+i+ ": ");
			notas[i] = teclado.nextInt();
			soma += notas[i];
		}
		float media = soma / 5;
		
		System.out.println("Media das notas:"+media);
		
	}

}

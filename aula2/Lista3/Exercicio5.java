package pkg;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor "+i+ ": ");
			vetor[i] = teclado.nextInt();
		}
		
		double maior = vetor[0];
		double menor = vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			} 
			
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			
		}
		
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);

	}

}

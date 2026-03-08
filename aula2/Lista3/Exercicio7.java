package pkg;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int notas[][] = new int [3][4];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno " + (i + 1));
			
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite a nota da disciplina " + (j + 1) + ": ");
				notas[i][j] = teclado.nextInt();
			}
			
		}

		double maior = notas[0][0];
		double menor = notas[0][0];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (notas[i][j] > maior) {
					maior = notas[i][j];
				}
				
				if (notas[i][j] < menor) {
					menor = notas[i][j];
				}
			}
		}
		
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
	}

}

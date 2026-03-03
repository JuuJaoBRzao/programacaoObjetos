package pkg;

import java.util.Scanner;

public class lista2_exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[5]; //int vetor[5];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento "+i+ ": ");
			vetor[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}
		
		vetor[0] = 5;
		vetor[1] = 10;
		vetor[2] = 15;
		vetor[3] = 20;
		vetor[4] = 25;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}
		
		int [][] matriz = new int [2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Digite o elemento ["+i+"]["+j+"]");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Elemento ["+i+"]["+j+"] = "+matriz[i][j]);
			}
		}
		
	}

}

package pkg;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor "+i+ ": ");
			vetor[i] = teclado.nextInt();
		}
		
		 for (int i = 0; i < 10; i++) {
	            if (vetor[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
	    }

	}

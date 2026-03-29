package pkg;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String[] nomes = {"Ana", "Bruno", "Carlos", "Deimon", "Eduardo"};
		
		try {
			System.out.println("Digite um numero de 0 a 4: ");
			int posicao = teclado.nextInt();
			
			System.out.println("Nome na posicao: "+nomes[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Posição fora do array");
		} catch (InputMismatchException e) {
			System.out.println("Erro: você deve digitar um número inteiro");
		}
		teclado.close();
	}
}

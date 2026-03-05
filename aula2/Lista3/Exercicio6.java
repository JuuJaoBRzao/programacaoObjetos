package pkg;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cidades[] = new String[5];
		float populacao[] = new float[5];
		
		for(int i = 0; i < cidades.length; i++) {
			System.out.println("Digite o nome da cidade " +i+ ": ");
			cidades[i] = teclado.nextLine();
		}
		
		for (int i = 0; i < populacao.length; i++) {
			System.out.println("Digite a população das cidade " +i+ ": ");
			populacao[i] = teclado.nextFloat();
		}
		
		float maior = populacao[0];
		int indiceMaior = 0;
		
		for (int i = 1; i < populacao.length; i++) {
			if (populacao[i] > maior) {
				maior = populacao[i];
				indiceMaior = i;
			}
		}
		
		System.out.println("Cidade mais populosa: "+cidades[indiceMaior]);
		System.out.println("População da cidade: "+maior);
	}

}

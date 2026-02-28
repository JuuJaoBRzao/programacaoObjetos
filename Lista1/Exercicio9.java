package pkg;

import java.util.Scanner;

public class lista1_exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo numero: ");
		float numero2 = sc.nextFloat();
		
		System.out.println("Digite 1 para fazer a soma dos números");
		System.out.println("Digite 2 para fazer a subtração dos números");
		System.out.println("Digite 3 para fazer a multiplicação dos números");
		System.out.println("Digite 4 para fazer a divisaõ dos numeros");
		int opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:	
				float soma = numero1 + numero2;
				System.out.println("Soma: " +soma);
				break;
			case 2:
				float subtracao = numero1 - numero2;
				System.out.println("Subtracao: " +subtracao);
				break;
			case 3:	
				float multiplicacao = numero1 * numero2;
				System.out.println("Multiplicacao: " +multiplicacao);
				break;
			case 4:
				float divisao = numero1 / numero2;
				System.out.println("Divisao: " +divisao);
				break;
			default:
				System.out.println("Numero invalido");
				break;
		}
	}

}

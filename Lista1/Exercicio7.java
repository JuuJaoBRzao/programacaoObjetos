package pkg;

import java.util.Scanner;

public class lista1_exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int a = sc.nextInt();
		System.out.println("Digite um valor");
		int b = sc.nextInt();
		
		if (a == 0 || b == 0) {
			System.out.println("Nao é possivel ter multiplos de 0");
		} else if (a % b == 0 || b % a == 0) {
			System.out.println("Sao multiplos do mesmo numero");
		} else
			System.out.println("Nao sao multiplos do mesmo numero");
	}

}

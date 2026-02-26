package pkg;
import java.util.Scanner;

public class lista1_exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int valor3 = sc.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior numero eh: " +valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior numero eh: "+valor2);
		} else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior numero eh: " +valor3);
		}

	}

}

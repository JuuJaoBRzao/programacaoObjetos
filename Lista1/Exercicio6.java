package pkg;
import java.util.Scanner;

public class lista1_exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int valor3 = sc.nextInt();
		
		int aux;
		
		if (valor1 > valor2) {
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
		}
		
		if (valor1 > valor3) {
			aux = valor1;
			valor1 = valor3;
			valor3 = aux;
		}
		
		if (valor2 > valor3) {
			aux = valor2;
			valor2 = valor3;
			valor3 = aux;
		}
		
		System.out.println("Valores em ordem crescente:");
		System.out.println(valor1 + " - " + valor2 + " - " + valor3);

	}
}

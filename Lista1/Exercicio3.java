package pkg;
import java.util.Scanner;

public class lista1_exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite um numero: ");
		float numero2 = sc.nextFloat();
		System.out.println("Digite um numero: ");
		float numero3 = sc.nextFloat();
		System.out.println("Digite um numero: ");
		float numero4 = sc.nextFloat();
		
		float soma = numero1 + numero2 + numero3 + numero4;
		float media = soma / 4;
		System.out.println("Media: " +media);
	}

}

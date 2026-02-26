package pkg;
import java.util.Scanner;

public class lista1_exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo numero: ");
		float numero2 = sc.nextFloat();
		
		float soma = numero1 + numero2;
		System.out.println("Soma: " +soma);
		float subtracao = numero1 - numero2;
		System.out.println("Subtracao: " +subtracao);
		float multiplicacao = numero1 * numero2;
		System.out.println("Multiplicacao: " +multiplicacao);
		float divisao = numero1 / numero2;
		System.out.println("Divisao: " +divisao);
				
	}

}

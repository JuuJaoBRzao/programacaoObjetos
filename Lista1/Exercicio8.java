package pkg;
import java.util.Scanner;

public class lista1_exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 16) {
			System.out.println("Nao esta apto para votar");
		} else if (idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Voto facultativo");
		} else {
			System.out.println("Voto obrigatorio");
		}

	}

}

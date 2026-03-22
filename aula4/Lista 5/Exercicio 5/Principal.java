package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha o construtor:");
		System.out.println("Digite 1 para o construtor com nome e idade: ");
		System.out.println("Digite 2 para o construtor com apenas idade: ");
		System.out.println("Sua escolha: ");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
		if (opcao == 1) {
			System.out.println("Digite o nome: ");
			String nome = teclado.nextLine();
			System.out.println("Digite a idade: ");
			int idade = teclado.nextInt();
			
			Pessoa p = new Pessoa(nome, idade);
			
		} else if (opcao == 2) {
			System.out.println("Digite a idade: ");
			int idade = teclado.nextInt();
			
			Pessoa p = new Pessoa(idade);
		} else {
            System.out.println("Opção inválida!");
        }
		
		teclado.close();
	}
}

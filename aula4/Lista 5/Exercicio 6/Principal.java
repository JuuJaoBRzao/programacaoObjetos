package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Digite o nome: ");
			String nome = teclado.nextLine();
			System.out.println("Digite o numero da matricula: ");
			int matricula = teclado.nextInt();
			teclado.nextLine();
			
			Aluno a = new Aluno(nome, matricula);
			
			System.out.println("Digite a data de nascimento: ");
			String dataNascimento = teclado.nextLine();
			
			Aluno a2 = new Aluno(dataNascimento);
			
			System.out.println("Digite o nome: ");
			String no = teclado.nextLine();
			System.out.println("Digite a data de nascimento: ");
			String nascimento = teclado.nextLine();
			System.out.println("Digite o ano que ingressou na faculdade: ");
			int anoIngresso = teclado.nextInt();
			
			Aluno a3 = new Aluno(nome, dataNascimento, anoIngresso);
		
		teclado.close();
	}
}

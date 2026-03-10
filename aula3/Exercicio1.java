package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome 1: ");
		a1.nome = teclado.nextLine();
		System.out.println("Digite a matricula 1: ");
		a1.matricula = teclado.nextLine();
		System.out.println("Digite o CPF 1: ");
		a1.cpf = teclado.nextLine();
		System.out.println("Digite a  idade 1: ");
		a1.idade = teclado.nextInt();
		
		System.out.println("Aluno instanciado: ");
		System.out.println("Nome: " +a1.nome);
		System.out.println("Matricula: "+a1.matricula);
		System.out.println("CPF: "+a1.cpf);
		System.out.println("Idade: "+a1.idade);
		
		Aluno a2 = new Aluno();
		System.out.println("Digite o nome 2: ");
		a2.nome = teclado.nextLine();
		System.out.println("Digite a matricula 2: ");
		a2.matricula = teclado.nextLine();
		System.out.println("Digite o CPF 2: ");
		a2.cpf = teclado.nextLine();
		System.out.println("Digite a idade 2: ");
		a2.idade = teclado.nextInt();
		
		System.out.println("Aluno 2 instanciado: ");
		System.out.println("Nome: " +a2.nome);
		System.out.println("Matricula: "+a2.matricula);
		System.out.println("CPF: "+a2.cpf);
		System.out.println("Idade: "+a2.idade);
		
		Aluno a3 = new Aluno();
		System.out.println("Digite o nome 3: ");
		a3.nome = teclado.nextLine();
		System.out.println("Digite a matricula 3: ");
		a3.matricula = teclado.nextLine();
		System.out.println("Digite o CPF 3: ");
		a3.cpf = teclado.nextLine();
		System.out.println("Digite a idade 3: ");
		a3.idade = teclado.nextInt();
		
		System.out.println("Aluno 3 instanciado: ");
		System.out.println("Nome: " +a3.nome);
		System.out.println("Matricula: "+a3.matricula);
		System.out.println("CPF: "+a3.cpf);
		System.out.println("Idade: "+a3.idade);
	}

}

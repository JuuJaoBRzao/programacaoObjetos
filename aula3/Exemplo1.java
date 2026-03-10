package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Digite a  idade 1: ");
		a1.idade = teclado.nextInt();
		
		a1.nome = "Esthevan";
		a1.matricula = "102030";
		a1.cpf = "123.456.789-01";
		System.out.println("Aluno instanciado: ");
		System.out.println("Nome: " +a1.nome);
		System.out.println("Matricula: "+a1.matricula);
		System.out.println("CPF: "+a1.cpf);
		System.out.println("Idade: "+a1.idade);
		
		
		
		Aluno a2 = new Aluno();
		System.out.println("Digite a idade 2: ");
		a2.idade = teclado.nextInt();
		
		a2.nome = "Leonardo";
		a2.matricula = "203010";
		a2.cpf = "987.654.321-10";
		System.out.println("Aluno 2 instanciado: ");
		System.out.println("Nome: " +a2.nome);
		System.out.println("Matricula: "+a2.matricula);
		System.out.println("CPF: "+a2.cpf);
		System.out.println("Idade: "+a2.idade);
		
		Aluno a3 = new Aluno();
		System.out.println("Digite a idade 3: ");
		a3.idade = teclado.nextInt();
		
		a3.nome = "Bruno";
		a3.matricula = "302010";
		a3.cpf = "028.348.283-21";
		System.out.println("Aluno 3 instanciado: ");
		System.out.println("Nome: " +a3.nome);
		System.out.println("Matricula: "+a3.matricula);
		System.out.println("CPF: "+a3.cpf);
		System.out.println("Idade: "+a3.idade);
	}

}

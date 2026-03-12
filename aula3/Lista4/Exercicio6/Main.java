package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a1.nome = teclado.nextLine();
		System.out.println("Digite o número da matrícula: ");
		a1.matricula = teclado.nextInt();
		System.out.println("Digite a nota 1 do aluno: ");
		a1.nota1 = teclado.nextFloat();
		System.out.println("Digite a nota 2 do aluno: ");
		a1.nota2 = teclado.nextFloat();
		System.out.println("Digite a nota 3 do aluno: ");
		a1.nota3 = teclado.nextFloat();
		
		float soma = a1.nota1 + a1.nota2 + a1.nota3;
		float media = soma / 3;
		
		System.out.println("Nome: "+a1.nome);
		System.out.println("Matricula: "+a1.matricula);
		System.out.println("Nota 1: "+a1.nota1);
		System.out.println("Nota 2: "+a1.nota2);
		System.out.println("Nota 3: "+a1.nota3);
		System.out.println("Media final: "+media);
		
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		teclado.close();
	}

}

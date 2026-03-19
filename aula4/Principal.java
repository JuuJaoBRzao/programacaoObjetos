package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Disciplina d = new Disciplina();
		d.atribuirValores("Guilherme", "80 horas", "Alexandre");
		System.out.println("Nome do aluno: "+d.nome);
		System.out.println("Carga horaria: "+d.cargaHoraria);
		System.out.println("Nome do professor: "+d.professor);
		
		String nome, cargaHoraria, professor;
		System.out.println("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		System.out.println("Digite a carga horaria da disciplina: ");
		cargaHoraria = teclado.nextLine();
		System.out.println("Digite o nome do professor: ");
		professor = teclado.nextLine();
		
		Disciplina d2 = new Disciplina();
		d2.atribuirValores(nome, cargaHoraria, professor);
		System.out.println("Nome do aluno: "+d2.nome);
		System.out.println("Carga horaria: "+d2.cargaHoraria);
		System.out.println("Nome do professor: "+d2.professor);

	}

}

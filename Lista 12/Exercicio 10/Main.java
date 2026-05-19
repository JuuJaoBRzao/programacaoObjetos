package pkg;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Guilherme", 9.9, 9.5);
		Aluno a2 = new Aluno("Bruno", 9.8, 9.9);
		Aluno a3 = new Aluno("Leonardo", 1, 0);
		
		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.add(a3);
		
		exibirAlunos(listaAluno);
	}

	public static void exibirAlunos(List<Aluno> lista) {
		for (Aluno a : lista) {
			System.out.println("Nome: "+a.getNome());
			System.out.println("Nota 1: "+a.getNota1());
			System.out.println("Nota 2: "+a.getNota2());
			System.out.println("Media: "+a.calcularMedia());
			System.out.println("\n");
		}
	}
	
	public static void exibirAluno2(List<Aluno> lista) {
		for (int i= 0; i < lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i).getNome());
			System.out.println("Nota 1: "+lista.get(i).getNota1());
			System.out.println("Nota 2: "+lista.get(i).getNota2());
			System.out.println("Media: "+lista.get(i).calcularMedia());
			System.out.println("\n");
		}
	}
	
	public static void exibirAluno3(List<Aluno> lista) {
		for (int i= 0; i < lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i).getNome());
			System.out.println("Nota 1: "+lista.get(i).getNota1());
			System.out.println("Nota 2: "+lista.get(i).getNota2());
			System.out.println("Media: "+lista.get(i).calcularMedia());
			System.out.println("\n");
		}
	}
}

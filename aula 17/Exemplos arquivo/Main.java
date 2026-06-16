package projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 20);
		Aluno a2 = new Aluno("Maria", 22);
		Aluno a3 = new Aluno("Pedro", 19);
		
		//Escrevendo os alunos em um arquivo de texto
		try {
			FileWriter arquivo = new FileWriter("alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
	
		//Escrevendo os alunos no arquivo
		escritor.write(a1.getNome() + "," + a1.getIdade());
		escritor.newLine();
		
		escritor.write(a2.getNome() + "," + a2.getIdade());
		escritor.newLine();
		
		escritor.write(a3.getNome() + "," + a3.getIdade());
		escritor.newLine();
		
		escritor.close();
		arquivo.close();
		
		System.out.println("Alunos salvos no arquivo alunos.txt");
	} catch (IOException e) {
		e.printStackTrace();
	}

 }
}

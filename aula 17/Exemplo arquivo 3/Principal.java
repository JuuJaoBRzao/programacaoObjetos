package project;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        // Criando objetos Aluno (Slide 16)
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Alziras", 19);
        
        // Criando a lista para receber os dados lidos (Slide 16)
        List<Aluno> lista = new ArrayList<>();
        
        // Instanciando a classe Arquivo com o nome do arquivo "alunos" (Slide 16)
        Arquivos arquivo = new Arquivos("alunos");
        
        // Gravando os três alunos no arquivo (Slide 16)
        arquivo.gravaArquivo(aluno1);
        arquivo.gravaArquivo(aluno2);
        arquivo.gravaArquivo(aluno3);
        
        // Lendo os alunos do arquivo e armazenando o retorno na lista (Slide 16)
        lista = arquivo.leArquivo();
        
        // Percorrendo a lista e exibindo os dados no console (Slide 16)
        for (Aluno a : lista) {
            System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}

package pkg;

public class Aluno {
	public String nome;
	public String dataNascimento;
	public int matricula;
	public int anoIngresso;
	
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		
		System.out.println("Construtor com nome e matricula: ");
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
	}
	
	public Aluno(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		
		System.out.println("Construtor apenas com data de nascimento: ");
        System.out.println("Data de nascimento: " + dataNascimento);
	}
	
	public Aluno(String nome, String dataNascimento, int anoIngresso) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;
		
		System.out.println("Construtor com nome, data de nascimento e ano ingressado na faculdade: ");
		System.out.println("Nome: "+nome);
		System.out.println("Data de nascimento: "+dataNascimento);
		System.out.println("Ano ingresso na faculdade: "+anoIngresso);
	}
}

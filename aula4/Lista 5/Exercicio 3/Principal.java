package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome da pessoa: ");
		p.nome= teclado.nextLine();
		System.out.println("Digite o email: ");
		p.email = teclado.nextLine();
		System.out.println("Digite a data de nascimento: ");
		p.dataNascimento = teclado.nextLine();
		System.out.println("Digite o endereco: ");
		p.endereco = teclado.nextLine();
		
		System.out.println("Nome :"+p.nome);
		System.out.println("Email: "+p.email);
		System.out.println("Data de nascimento: "+p.dataNascimento);
		System.out.println("Endereco: "+p.endereco);
		p.promoverAdmin();
		p.administrador();
		
		Pessoa p2 = new Pessoa();
		System.out.println("Digite o nome da pessoa: ");
		p2.nome= teclado.nextLine();
		System.out.println("Digite o email: ");
		p2.email = teclado.nextLine();
		System.out.println("Digite a data de nascimento: ");
		p2.dataNascimento = teclado.nextLine();
		System.out.println("Digite o endereco: ");
		p2.endereco = teclado.nextLine();
		
		System.out.println("Nome :"+p2.nome);
		System.out.println("Email: "+p2.email);
		System.out.println("Data de nascimento: "+p2.dataNascimento);
		System.out.println("Endereco: "+p2.endereco);
		p2.administrador();
	}

}

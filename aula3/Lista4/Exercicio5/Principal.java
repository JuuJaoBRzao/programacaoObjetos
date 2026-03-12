package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Produto p1 = new Produto();
		System.out.println("Digite o nome do produto: ");
		p1.nome = teclado.nextLine();
		System.out.println("Digite o preço do produto: ");
		p1.preco = teclado.nextFloat();
		System.out.println("Digite a quantidade em estoque: ");
		p1.quantidadeEstoque = teclado.nextInt();
		
		float valorTotal = p1.preco * p1.quantidadeEstoque;
		
		System.out.println("Nome: "+p1.nome);
		System.out.println("Preço: "+p1.preco);
		System.out.println("Quantia em  estoque: " +p1.quantidadeEstoque);
		System.out.println("Valor total em estoque: "+valorTotal);
		
		teclado.close();
	}

}

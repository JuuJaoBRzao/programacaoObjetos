package pkg;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Produto p1 = new Produto("Chiclete", 1.99, 20);
		Produto p2 = new Produto("Refrigerante Guaraná 2L", 9.99, 10);
		Produto p3 = new Produto("Presunto", 12.99, 15);
		
		listaProduto.add(p1);
		listaProduto.add(p2);
		listaProduto.add(p3);
		
		exibirProduto(listaProduto);
	}

	public static void exibirProduto(List<Produto> lista) {
		for (Produto p : lista) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Preço: "+p.getPreco());
			System.out.println("Quantidade: "+p.getQuantidade());
			System.out.println("\n");
		}
	}
	
	public static void exibirProduto2(List<Produto> lista) {
		for (int i= 0; i < lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i).getNome());
			System.out.println("Preço: "+lista.get(i).getPreco());
			System.out.println("Quantidade: "+lista.get(i).getQuantidade());
			System.out.println("\n");
		}
	}
	
	public static void exibirProduto3(List<Produto> lista) {
		for (int i= 0; i < lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i).getNome());
			System.out.println("Preço: "+lista.get(i).getPreco());
			System.out.println("Quantidade: "+lista.get(i).getQuantidade());
		}
	}
}

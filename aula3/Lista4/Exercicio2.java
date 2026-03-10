package pkg;

import java.util.Scanner;

public class computadorMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Computador c1 = new Computador();
		System.out.println("Digite a marca do computador 1: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do computador 1: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o tipo do computador 1: ");
		c1.tipo = teclado.nextLine();
		System.out.println("Digite o preço do comptador 1: ");
		c1.preco = teclado.nextFloat();
		
		System.out.println("Computador 1");
		System.out.println("Marca: " +c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Tipo: "+c1.tipo);
		System.out.println("Preço: "+c1.preco);
		
		Computador c2 = new Computador();
		c2.marca = "Acer";
		c2.modelo = "Nitro";
		c2.tipo = "Notebook";
		c2.preco = 4500;
		
		System.out.println("Computador 2");
		System.out.println("Marca: " +c2.marca);
		System.out.println("Modelo: "+c2.modelo);
		System.out.println("Tipo: "+c2.tipo);
		System.out.println("Preço: "+c2.preco);

	}

}

package pkg;

import java.util.Scanner;

public class carroMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Carro c1 = new Carro();
		System.out.println("Digite a marca do carro 1: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 1: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 1: ");
		c1.anoFabricacao = teclado.nextInt();
		
		System.out.println("Carro 1");
		System.out.println("Marca: " +c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Ano de fabricação: "+c1.anoFabricacao);
		
		Carro c2 = new Carro();
		teclado.nextLine();
		System.out.println("Digite a marca do carro 2: ");
		c2.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 2: ");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 2: ");
		c2.anoFabricacao = teclado.nextInt();
		
		System.out.println("Carro 2");
		System.out.println("Marca: " +c2.marca);
		System.out.println("Modelo: "+c2.modelo);
		System.out.println("Ano de fabricação: "+c2.anoFabricacao);
	}

}

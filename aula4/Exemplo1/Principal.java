package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro c = new Carro();
		
		System.out.println("Digite a marca do carro: ");
		c.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		c.modelo = teclado.nextLine();
		
		c.alugar();
		c.devolver();
		c.exibirDados();
		teclado.close();
	}

}

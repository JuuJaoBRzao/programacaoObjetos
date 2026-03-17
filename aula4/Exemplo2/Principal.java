package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Calculadora c = new Calculadora();
		c.a = 4.37;
		c.b = 4.37;
//		double resultado;
//		resultado = c.somar();
//		System.out.println("Resultado da soma: "+resultado);
		System.out.println("Resultado da soma: "+c.somar());
	}

}

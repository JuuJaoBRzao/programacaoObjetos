package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
        String entrada = teclado.nextLine();

        try {
            double celsius = Double.parseDouble(entrada);
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido! Digite um número com ponto (ex: 25.5).");
        }
        
        teclado.close();
    }

}

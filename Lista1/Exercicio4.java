package pkg;

import java.util.Scanner;

public class lista1_exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		int x = sc.nextInt();
		System.out.println("Digite o valor de y: ");
		int y = sc.nextInt();
		
		if (x == 0 && y == 0) {
			System.out.println("O ponto esta na origem");
		} else if (x == 0) {
			System.out.println("O ponto esta sobre o eixo y");
		} else if (y == 0) {
			System.out.println("O ponto esta sobre o eixo x");
		}  else if (x > 0 && y > 0) {
            System.out.println("O ponto está no 1º quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no 2º quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no 3º quadrante.");
        } else {
            System.out.println("O ponto está no 4º quadrante.");
        }
    }

 }

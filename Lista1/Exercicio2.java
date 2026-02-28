package pkg;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a marcação do odômetro no início do dia: ");
		float marcacaoInicial = sc.nextFloat();
		System.out.println("Digite a marcação do odômetro no final do dia: ");
		float marcacaoFinal = sc.nextFloat();
		System.out.println("Digite a quantidade de litros de combustível gasto: ");
		float litrosCombustivel = sc.nextFloat();
		System.out.println("Digite o valor total recebido dos passageiros: ");
		float dinheiroPassageiros  = sc.nextFloat();
		
		float totalKM = marcacaoFinal - marcacaoInicial;
		float mediaConsumo = totalKM / litrosCombustivel;
		double lucro = dinheiroPassageiros - (litrosCombustivel * 4.90);
		
		System.out.println("A media de consumo foi: " +mediaConsumo);
		System.out.println("O lucro total foi: " +lucro);
	}

}

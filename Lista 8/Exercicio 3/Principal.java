import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a base do retângulo: ");
        double base = teclado.nextDouble();
        retangulo.setBase(base);

        System.out.print("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();
        retangulo.setAltura(altura);

        System.out.println("\n--- Dados do Retângulo ---");
        System.out.println("Base:   " + retangulo.getBase());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área:   " + retangulo.calculaArea());

        teclado.close();
    }
}

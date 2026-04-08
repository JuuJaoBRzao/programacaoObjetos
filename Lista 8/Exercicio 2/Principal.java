import java.util.Scanner;
 
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo circulo = new Circulo();
 
        System.out.print("Digite o raio do círculo: ");
        circulo.setRaio(teclado.nextDouble());
 
        System.out.printf("Área do círculo: %.2f%n", circulo.calculaArea());
 
        teclado.close();
    }
}
 

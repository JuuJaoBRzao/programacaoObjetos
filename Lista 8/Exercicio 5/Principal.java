import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Triangulo t = new Triangulo();

        System.out.println("Digite o lado A do triangulo: ");
        t.setLadoA(teclado.nextFloat());
        System.out.println("Digite o lado B do triangulo: ");
        t.setLadoB(teclado.nextFloat());
        System.out.println("Digite o lado C do triangulo: ");
        t.setLadoC(teclado.nextFloat());

        System.out.println("Lado A: " + t.getLadoA());
        System.out.println("Lado B: " + t.getLadoB());
        System.out.println("Lado C: " + t.getLadoC());

        if(t.verificaEquilatero()) {
            System.out.println("O triangulo é equilatero");
        } else {
            System.out.println("O triangulo não é equilatero");
        }

        teclado.close();
    }
}

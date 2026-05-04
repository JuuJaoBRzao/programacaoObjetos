import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cor: ");
        String cor = sc.nextLine();

        System.out.print("Preenchido? (true/false): ");
        boolean preenchido = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Informe a largura: ");
        double largura = Double.parseDouble(sc.nextLine());

        System.out.print("Informe a altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        Retangulo r = new Retangulo(cor, preenchido, largura, altura);

        System.out.println("\n--- Resultado ---");
        System.out.println("Cor: " + r.cor);
        System.out.println("Preenchido: " + r.preenchido);
        System.out.println("Área: " + r.calcularArea());

        sc.close();
    }
}

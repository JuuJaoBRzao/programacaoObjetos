public class Main {

    public static void main(String[] args) {

        System.out.println("=== Gerente ===");
        Gerente gerente = new Gerente("Maria Santos", 5000.00, 1500.00, 8);
        gerente.exibirSalario();

        System.out.println();
        System.out.println("=== Vendedor ===");
        Vendedor vendedor = new Vendedor("Carlos Lima", 2000.00, 30000.00, 3.5);
        vendedor.exibirSalario();
    }
}

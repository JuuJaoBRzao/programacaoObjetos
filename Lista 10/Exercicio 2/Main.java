public class Main {

    public static void main(String[] args) {

        System.out.println("=== Conta Bancária ===");
        ContaBancaria cb = new ContaBancaria(1000.0);
        cb.calcularSaldo();

        System.out.println();

        System.out.println("=== Conta Corrente ===");
        ContaCorrente cc = new ContaCorrente(500.0, 300.0);
        cc.calcularSaldo();
    }
}

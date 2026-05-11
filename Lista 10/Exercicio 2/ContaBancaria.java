public class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void calcularSaldo() {
        System.out.printf("Saldo bancário: R$ %.2f%n", saldo);
    }
}

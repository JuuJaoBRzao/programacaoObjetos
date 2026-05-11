public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void calcularSaldo() {
        double saldoDisponivel = saldo + limite;
        System.out.printf("Saldo em conta:    R$ %.2f%n", saldo);
        System.out.printf("Limite de crédito: R$ %.2f%n", limite);
        System.out.printf("Saldo disponível:  R$ %.2f%n", saldoDisponivel);
    }
}

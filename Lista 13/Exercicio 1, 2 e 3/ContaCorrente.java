public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("  [ContaCorrente] Valor invalido.");
            return;
        }
        saldo += valor;
        System.out.printf("  [ContaCorrente] Deposito de R$ %.2f realizado!%n", valor);
        exibirSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("  [ContaCorrente] Valor invalido.");
            return;
        }
        if (valor > saldo + limite) {
            System.out.printf("  [ContaCorrente] Saldo insuficiente. Disponivel: R$ %.2f%n", saldo + limite);
            return;
        }
        saldo -= valor;
        System.out.printf("  [ContaCorrente] Saque de R$ %.2f realizado!%n", valor);
        exibirSaldo();
    }
}

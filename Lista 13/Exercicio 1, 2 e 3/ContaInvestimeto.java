public class ContaInvestimento extends Conta {

    private double taxaRendimento;

    public ContaInvestimento(double saldo, double limite, double taxaRendimento) {
        super(saldo, limite);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("  [ContaInvestimento] Valor invalido.");
            return;
        }
        saldo += valor;
        System.out.printf("  [ContaInvestimento] Aplicacao de R$ %.2f realizada!%n", valor);
        System.out.printf("  [ContaInvestimento] Rendimento estimado: R$ %.2f (%.1f%% a.m.)%n",
                saldo * taxaRendimento / 100, taxaRendimento);
        exibirSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("  [ContaInvestimento] Valor invalido.");
            return;
        }
        if (valor > saldo) {
            System.out.printf("  [ContaInvestimento] Saldo insuficiente. Disponivel: R$ %.2f%n", saldo);
            return;
        }
        saldo -= valor;
        System.out.printf("  [ContaInvestimento] Resgate de R$ %.2f realizado!%n", valor);
        exibirSaldo();
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.printf("  [ContaInvestimento] Rendimento de R$ %.2f creditado!%n", rendimento);
        exibirSaldo();
    }
}

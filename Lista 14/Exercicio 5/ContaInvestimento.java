class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldo, double limite) { super(saldo, limite); }

    @Override
    public void depositar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        saldo += valor;
        System.out.println("[Investimento] Depósito de R$" + valor + ". Saldo: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        if (valor > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
        saldo -= valor;
        System.out.println("[Investimento] Saque de R$" + valor + ". Saldo: R$" + saldo);
    }

    public void atualizaRendimentos() {
        double rendimento = saldo * 0.05;
        saldo += rendimento;
        System.out.println("[Investimento] Rendimento de 5% aplicado. Saldo: R$" + saldo);
    }
}

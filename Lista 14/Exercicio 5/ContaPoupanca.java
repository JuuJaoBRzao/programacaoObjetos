class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo, double limite) { super(saldo, limite); }

    @Override
    public void depositar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        saldo += valor;
        System.out.println("[Poupança] Depósito de R$" + valor + ". Saldo: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        if (valor > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
        saldo -= valor;
        System.out.println("[Poupança] Saque de R$" + valor + ". Saldo: R$" + saldo);
    }

    public void atualizaJuros() {
        double juros = saldo * 0.03;
        saldo += juros;
        System.out.println("[Poupança] Juros de 3% aplicados. Saldo: R$" + saldo);
    }
}

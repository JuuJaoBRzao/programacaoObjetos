class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        if (valor > saldo)
            throw new IllegalArgumentException("Saldo insuficiente. Disponível: R$" + saldo);
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + saldo);
    }
}

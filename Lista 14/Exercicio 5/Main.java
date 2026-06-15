class Main {
    public static void main(String[] args) {
        ContaInvestimento ci = new ContaInvestimento(1000, 0);
        ci.depositar(500);
        ci.atualizaRendimentos();
        ci.sacar(200);
        System.out.println("Saldo investimento: R$" + ci.getSaldo());

        System.out.println();

        ContaPoupanca cp = new ContaPoupanca(2000, 0);
        cp.depositar(500);
        cp.atualizaJuros();
        cp.sacar(100);
        System.out.println("Saldo poupança: R$" + cp.getSaldo());
    }
}

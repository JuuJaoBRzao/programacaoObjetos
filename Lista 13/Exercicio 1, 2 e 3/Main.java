ublic class Main {

    public static void main(String[] args) {

        System.out.println("=== Conta Corrente ===");
        ContaCorrente cc = new ContaCorrente(1000.00, 500.00);
        cc.depositar(200.00);
        cc.sacar(300.00);
        cc.sacar(2000.00);      
      
        System.out.println();
        System.out.println("=== Conta Investimento ===");
        ContaInvestimento ci = new ContaInvestimento(5000.00, 0.00, 1.2);
        ci.depositar(1000.00);
        ci.aplicarRendimento();
        ci.sacar(500.00);
        ci.sacar(99999.00);      
    }
}

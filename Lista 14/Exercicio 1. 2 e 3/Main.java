class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 500);

        conta.depositar(200);
        conta.sacar(300);

        try {
            conta.sacar(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            conta.depositar(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            conta.sacar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

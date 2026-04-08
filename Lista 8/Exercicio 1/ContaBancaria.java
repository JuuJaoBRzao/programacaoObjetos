public class ContaBancaria {
    private double saldo;
    private double limite;
 
    public double getSaldo() {
        return saldo;
    }
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public double getLimite() {
        return limite;
    }
 
    public void setLimite(double limite) {
        this.limite = limite;
    }
 
    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (saldo - valor < -limite) {
            System.out.println("Saque negado! Limite da conta seria ultrapassado.");
            System.out.printf("Saldo disponível (incluindo limite): R$ %.2f%n", saldo + limite);
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
        }
    }
}
 

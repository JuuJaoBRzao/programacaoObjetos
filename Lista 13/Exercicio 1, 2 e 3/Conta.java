public abstract class Conta {

    public double saldo;
    public double limite;

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}

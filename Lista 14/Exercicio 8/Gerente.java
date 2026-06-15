class Gerente extends Funcionario {
    public Gerente(String nome, double salario) { super(nome, salario); }

    @Override
    public double calcularSalario() {
        double bonus = salario * 0.20;
        double total = salario + bonus;
        System.out.println("Gerente " + nome + ": R$" + salario + " + bônus R$" + bonus + " = R$" + total);
        return total;
    }
}

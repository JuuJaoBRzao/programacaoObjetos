class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) { super(nome, salario); }

    @Override
    public double calcularSalario() {
        System.out.println("Vendedor " + nome + ": salário R$" + salario);
        return salario;
    }
}

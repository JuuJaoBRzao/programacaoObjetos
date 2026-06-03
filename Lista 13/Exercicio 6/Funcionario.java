public abstract class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirSalario() {
        System.out.printf("  %s | Base: R$ %.2f | Total: R$ %.2f%n",
                nome, salarioBase, calcularSalario());
    }
}

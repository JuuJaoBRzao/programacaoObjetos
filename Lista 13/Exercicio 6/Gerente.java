public class Gerente extends Funcionario {

    private double bonusGerencial;
    private int numeroDeFuncionarios;

    public Gerente(String nome, double salarioBase, double bonusGerencial, int numeroDeFuncionarios) {
        super(nome, salarioBase);
        this.bonusGerencial = bonusGerencial;
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusGerencial + (numeroDeFuncionarios * 100.0);
    }

    @Override
    public void exibirSalario() {
        System.out.println("  [Gerente]");
        System.out.printf("  Nome             : %s%n", nome);
        System.out.printf("  Salario base     : R$ %.2f%n", salarioBase);
        System.out.printf("  Bonus gerencial  : R$ %.2f%n", bonusGerencial);
        System.out.printf("  Adicional equipe : R$ %.2f (%d x R$100)%n",
                numeroDeFuncionarios * 100.0, numeroDeFuncionarios);
        System.out.printf("  Salario total    : R$ %.2f%n", calcularSalario());
    }
}

public class Vendedor extends Funcionario {

    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * comissaoPercentual / 100);
    }

    @Override
    public void exibirSalario() {
        double comissao = totalVendas * comissaoPercentual / 100;
        System.out.println("  [Vendedor]");
        System.out.printf("  Nome            : %s%n", nome);
        System.out.printf("  Salario base    : R$ %.2f%n", salarioBase);
        System.out.printf("  Total vendas    : R$ %.2f%n", totalVendas);
        System.out.printf("  Comissao (%.1f%%): R$ %.2f%n", comissaoPercentual, comissao);
        System.out.printf("  Salario total   : R$ %.2f%n", calcularSalario());
    }
}

package pkg;

public class Gerente extends Funcionario{
	private double bonusAnual;

	public Gerente(String nome, double salario, double bonusAnual) {
		super(nome, salario);
		this.bonusAnual = bonusAnual;
	}

	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	
	public void aumentarSalario(double percentual, double percentualBonus) {
        super.aumentarSalario(percentual);
        salario += bonusAnual * (percentualBonus / 100.0);
    }

	@Override
	public String toString() {
		return "Gerente [bonusAnual=" + bonusAnual + ", nome=" + nome + ", salario=" + salario + "]";
	}
}

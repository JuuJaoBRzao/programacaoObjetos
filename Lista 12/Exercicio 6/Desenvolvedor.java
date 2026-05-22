package pkg;

public class Desenvolvedor extends Funcionario{
	private double horasExtras;
	private double valorHoraExtra;
	
	public Desenvolvedor(String nome, double salario, double horasExtras, double valorHoraExtra) {
		super(nome, salario);
		this.horasExtras = horasExtras;
		this.valorHoraExtra = valorHoraExtra;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public void aumentarSalario(double percentual, boolean incorporarHorasExtras) {
        super.aumentarSalario(percentual);
        if (incorporarHorasExtras) {
            salario += horasExtras * valorHoraExtra;
            horasExtras = 0;
        }
    }

	@Override
	public String toString() {
		return "Desenvolvedor [horasExtras=" + horasExtras + ", valorHoraExtra=" + valorHoraExtra + ", nome=" + nome
				+ ", salario=" + salario + "]";
	}
}

public class Carro extends Veiculo {

    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.velocidadeAtual = 0;
    }

    @Override
    public void acelerar(int velocidade) {
        velocidadeAtual += velocidade;
        System.out.printf("  [Carro] %s %s acelerando... %d km/h%n",
                marca, modelo, velocidadeAtual);
    }

    @Override
    public void frear(int velocidade) {
        velocidadeAtual = Math.max(0, velocidadeAtual - velocidade);
        System.out.printf("  [Carro] %s %s freando... %d km/h%n",
                marca, modelo, velocidadeAtual);
        if (velocidadeAtual == 0)
            System.out.println("  [Carro] Veiculo parado.");
    }
}

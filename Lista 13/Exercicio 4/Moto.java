public class Moto extends Veiculo {

    private int velocidadeAtual;
    private boolean modoEsportivo;

    public Moto(String marca, String modelo, int ano, boolean modoEsportivo) {
        super(marca, modelo, ano);
        this.velocidadeAtual = 0;
        this.modoEsportivo = modoEsportivo;
    }

    @Override
    public void acelerar(int velocidade) {
        int ganho = modoEsportivo ? (int)(velocidade * 1.3) : velocidade;
        velocidadeAtual += ganho;
        System.out.printf("  [Moto] %s %s acelerando%s... %d km/h%n",
                marca, modelo, modoEsportivo ? " (esportivo)" : "", velocidadeAtual);
    }

    @Override
    public void frear(int velocidade) {
        velocidadeAtual = Math.max(0, velocidadeAtual - velocidade);
        System.out.printf("  [Moto] %s %s freando... %d km/h%n",
                marca, modelo, velocidadeAtual);
        if (velocidadeAtual == 0)
            System.out.println("  [Moto] Moto parada.");
    }
}

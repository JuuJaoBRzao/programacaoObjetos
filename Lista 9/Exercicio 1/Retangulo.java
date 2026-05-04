public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean preenchido,
                     double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return altura * largura;
    }
}

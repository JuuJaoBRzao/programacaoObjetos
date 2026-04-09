public class Retangulo {

    private double base;
    private double altura;

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Erro: base deve ser maior que zero.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: altura deve ser maior que zero.");
        }
    }

    // Método que calcula a área
    public double calculaArea() {
        return this.base * this.altura;
    }
}

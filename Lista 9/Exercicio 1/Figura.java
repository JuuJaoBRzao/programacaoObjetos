public class Figura {
    private String cor;
    private boolean preenchido;

    public Figura(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }
    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
}

public class Computador {
    protected String marca;
    private String modelo;

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String exibeModelo() {
        return "Modelo: " + modelo;
    }
}

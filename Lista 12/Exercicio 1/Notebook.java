public class Notebook extends Computador {

    public Notebook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return "Marca: " + marca;
    }
}

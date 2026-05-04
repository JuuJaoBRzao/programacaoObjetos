public class SerHumano extends Animal {
    protected String nome;
    protected int idade;

    public SerHumano(String tipo, String nome, int idade) {
        super(tipo);
        this.nome = nome;
        this.idade = idade;
    }

    public String falar() {
        return "Nem todos falam.";
    }
}

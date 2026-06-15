class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) { super(marca, modelo, ano); }

    @Override
    public void acelerar() {
        System.out.println("Carro " + marca + " " + modelo + " acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro " + marca + " " + modelo + " freando...");
    }
}

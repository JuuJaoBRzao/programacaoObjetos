class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) { super(marca, modelo, ano); }

    @Override
    public void acelerar() {
        System.out.println("Moto " + marca + " " + modelo + " acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto " + marca + " " + modelo + " freando...");
    }
}

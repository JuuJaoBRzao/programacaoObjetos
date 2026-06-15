class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022);
        Veiculo moto = new Moto("Honda", "CB500", 2021);

        carro.acelerar();
        carro.frear();

        System.out.println();

        moto.acelerar();
        moto.frear();
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Carro ===");
        Carro carro = new Carro("Toyota", "Corolla", 2023);
        carro.exibirInfo();
        carro.acelerar(60);
        carro.acelerar(40);
        carro.frear(50);
        carro.frear(100);      

        System.out.println();
        System.out.println("=== Moto ===");
        Moto moto = new Moto("Honda", "CB 600F", 2022, true);
        moto.exibirInfo();
        moto.acelerar(80);
        moto.frear(40);
        moto.frear(200);        
    }
}

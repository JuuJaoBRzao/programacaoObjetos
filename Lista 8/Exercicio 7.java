public class Carro {
    private String placa;
    private int numChassi;
    private boolean emMovimento;

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
        this.emMovimento = false;
    }
  
    public void acelerar() {
        emMovimento = true;
        System.out.println("O carro " + placa + " está acelerando!");
    }

    public boolean frear() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("O carro " + placa + " freou.");
            return true;
        } else {
            System.out.println("O carro já está parado.");
            return false;
        }
    }
}

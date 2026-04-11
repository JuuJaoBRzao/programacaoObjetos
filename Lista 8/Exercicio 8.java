public class Retangulo {

    private int x;
    private int y;

    public Retangulo(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public void inserir_lados(int a, int b) {
        this.x = a;
        this.y = b;
        System.out.println("Lados atualizados: " + x + " e " + y);
    }

    public void calcular_area() {
        int area = x * y;
        System.out.println("Área do retângulo: " + area);
    }
}

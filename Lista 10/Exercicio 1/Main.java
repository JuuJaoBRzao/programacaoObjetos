public class Main {

    public static void main(String[] args) {

        FormaGeometrica forma = new FormaGeometrica();
        forma.calcularArea();         // Área não definida para esta forma.

        System.out.println();

        Triangulo t1 = new Triangulo(8.0, 5.0);
        t1.calcularArea();            // Área do triângulo: 20,00

        Triangulo t2 = new Triangulo(6.0, 4.0);
        t2.calcularArea();            // Área do triângulo: 12,00

        System.out.println();

        // Polimorfismo: referência do tipo pai aponta para filho
        FormaGeometrica fg = new Triangulo(10.0, 3.0);
        fg.calcularArea();            // Área do triângulo: 15,00
    }
}

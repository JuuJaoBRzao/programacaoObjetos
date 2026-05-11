public class Main {

    public static void main(String[] args) {

        Casa casa = new Casa();
      
        double preco1 = casa.calcularPreco(80);
        System.out.printf("Preço (80 m²):             R$ %,.2f%n", preco1);
      
        double preco2 = casa.calcularPreco(80, 3);
        System.out.printf("Preço (80 m², 3 quartos):  R$ %,.2f%n", preco2);

        double preco3 = casa.calcularPreco(120, 4);
        System.out.printf("Preço (120 m², 4 quartos): R$ %,.2f%n", preco3);
    }
}

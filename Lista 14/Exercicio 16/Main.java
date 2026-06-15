class Main {
    public static void main(String[] args) {
        System.out.println("Válido: " + new Triangulo(3, 4, 5));
        System.out.println("Válido: " + new Triangulo(5, 5, 5));
 
        try {
            new Triangulo(1, 2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

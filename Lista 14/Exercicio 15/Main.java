class Main {
    public static void main(String[] args) {
        System.out.println("Data válida: " + new Data(15, 6, 2024));
        System.out.println("Data válida (bissexto): " + new Data(29, 2, 2024));
 
        try {
            new Data(31, 2, 2023);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
 
        try {
            new Data(0, 5, 2023);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Ana");

        // Chama a versão com 1 argumento
        p.falar("Olá!");

        System.out.println();

        // Chama a versão sobrecarregada com 2 argumentos
        p.falar("Bom dia!", 3);
    }
}

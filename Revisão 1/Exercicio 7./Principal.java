import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o preco do produto: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = teclado.nextInt();

        Produto p1 = new Produto(nome, preco, quantidade);

        p1.exibirInformacoes();
        System.out.println("Valor total: R$ " +p1.calcularValorTotal());

        Produto p2 = new Produto("Teclado Mecânico", 349.90, 15);

        p2.exibirInformacoes();
        System.out.println("Valor total: R$ " +p2.calcularValorTotal());
    }
}

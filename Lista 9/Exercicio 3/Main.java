import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe a idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.print("Informe o tipo: ");
        String tipo = sc.nextLine();

        Pessoa p = new Pessoa(tipo, nome, idade);

        System.out.println("\n--- Atributos ---");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Tipo: " + p.tipo);

        System.out.println("\n--- Métodos ---");
        System.out.println(p.falar());
        p.andar();

        sc.close();
    }
}

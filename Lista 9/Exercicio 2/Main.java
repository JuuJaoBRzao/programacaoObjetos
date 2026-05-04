import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nomePessoa = sc.nextLine();

        System.out.print("Informe o nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();

        Pessoa p = new Pessoa(nomePessoa);
        Funcionario f = new Funcionario(nomeFuncionario);

        System.out.println("\n--- Pessoa: " + p.nome + " ---");
        p.trabalhar();

        System.out.println("\n--- Funcionário: " + f.nome + " ---");
        f.trabalhar();

        sc.close();
    }
}

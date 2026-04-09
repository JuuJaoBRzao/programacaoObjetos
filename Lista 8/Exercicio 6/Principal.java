import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite a idade: ");
        p.setIdade(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Digite o nome: ");
        p.setNome(teclado.nextLine());
        System.out.println("Digite o cpf: ");
        p.setCpf(teclado.nextLine());

        System.out.println("Idade: " + p.getIdade());
        System.out.println("Nome: " + p.getNome());
        System.out.println("CPF: " + p.getCpf());

        p.verificaMaiorIdade();

        teclado.close();
    }
}

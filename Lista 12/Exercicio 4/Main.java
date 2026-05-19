import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);

        System.out.print("Digite o valor do cheque a ser depositado: ");
        double valorCheque = scanner.nextDouble();
        Cheque cheque = new Cheque(valorCheque);
        conta.depositar(cheque);

        System.out.println("Saldo atual da conta: " + conta.getSaldo());

        scanner.close();
    }
}

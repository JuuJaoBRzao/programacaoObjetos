import java.util.Scanner;
 
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
 
        System.out.print("Digite o saldo inicial: R$ ");
        conta.setSaldo(teclado.nextDouble());
 
        System.out.print("Digite o limite da conta: R$ ");
        conta.setLimite(teclado.nextDouble());
 
        System.out.print("Digite o valor do saque: R$ ");
        double valorSaque = teclado.nextDouble();
 
        conta.saque(valorSaque);
 
        teclado.close();
    }
}

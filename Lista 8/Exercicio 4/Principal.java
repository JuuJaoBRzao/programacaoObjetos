import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Carro c = new Carro();

        System.out.println("Digite a marca do carro: ");
        c.setMarca(teclado.nextLine());
        System.out.println("Digite o modelo do carro: ");
        c.setModelo(teclado.nextLine());
        System.out.println("Digite o ano do carro: ");
        c.setAno(teclado.nextInt());

        c.exibeDetalhe();

        teclado.close();
    }
}

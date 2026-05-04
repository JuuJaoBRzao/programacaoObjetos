import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a marca do Notebook: ");
        String marcaNb = sc.nextLine();

        System.out.print("Informe a marca do Netbook: ");
        String marcaNet = sc.nextLine();

        Notebook nb = new Notebook(marcaNb);
        Netbook net = new Netbook(marcaNet);

        System.out.println("\n--- Notebook ---");
        System.out.println(nb.exibeMarca());
        System.out.println(nb.exibeModelo());

        System.out.println("\n--- Netbook ---");
        System.out.println(net.exibeMarca());
        System.out.println(net.exibeModelo());

        sc.close();
    }
}

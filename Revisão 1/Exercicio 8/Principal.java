import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Usuario u = new Usuario("admin", "1234");

        System.out.println("Digite o nome de usuario: ");
        String nomeUsuario = teclado.nextLine();
        System.out.println("Digite a senha: ");
        String senha = teclado.nextLine();

        u.login(nomeUsuario, senha);
        u.exibirStatus();
        u.logout();
        
    }
}

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o titulo do filme: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o nome do diretor: ");
        String diretor = teclado.nextLine();
        System.out.println("Digite a duração do filme em minutos: ");
        int duracao = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o genero do filme: ");
        String genero = teclado.nextLine();

        Filme f = new Filme(titulo, diretor, duracao, genero);

        f.exibirInformacoes();
        f.ehLongo();
    }
}

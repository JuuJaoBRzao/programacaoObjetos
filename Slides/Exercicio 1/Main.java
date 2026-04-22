import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Criando objeto com valores padrão
        Disciplina disciplina = new Disciplina();
 
        // a) Exibindo conteúdo ORIGINAL dos atributos
        System.out.println("\n===== a) CONTEUDO ORIGINAL =====");
        disciplina.exibirInformacoes();
 
        // b) Usuário insere novos valores
        System.out.println("\n===== b) INSERIR NOVOS VALORES =====");
 
        System.out.print("Digite o nome da disciplina:    ");
        String novoNome = scanner.nextLine();
        disciplina.setNome(novoNome);
 
        System.out.print("Digite a carga horaria (horas): ");
        int novaCarga = scanner.nextInt();
        scanner.nextLine();
        disciplina.setCargaHoraria(novaCarga);
 
        System.out.print("Digite o nome do professor:     ");
        String novoProfessor = scanner.nextLine();
        disciplina.setNomeProfessor(novoProfessor);
 
        // c) Exibindo NOVO conteúdo dos atributos
        System.out.println("\n===== c) NOVO CONTEUDO =====");
        disciplina.exibirInformacoes();
 
        scanner.close();
    }
}
 

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] tarefas = new String[3];
        boolean[] concluida = new boolean[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            tarefas[i] = teclado.nextLine();
            concluida[i] = false;
        }

        System.out.print("Digite o número da tarefa a marcar como concluída (1-3): ");
        int numero = teclado.nextInt();
        if (numero >= 1 && numero <= 3) {
            concluida[numero - 1] = true;
        } else {
            System.out.println("Número inválido.");
        }

        System.out.println("\nTarefas:");
        for (int i = 0; i < 3; i++) {
            String status = concluida[i] ? "Concluída" : "Pendente";
            System.out.println((i + 1) + ". " + tarefas[i] + " - " + status);
        }

        teclado.close();
    }
}

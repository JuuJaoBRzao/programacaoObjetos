import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
 
public class Cliente {
 
    private String host;
    private int porta;
    private Scanner scanner;
 
    public Cliente(String host, int porta) {
        this.host = host;
        this.porta = porta;
        this.scanner = new Scanner(System.in);
    }
 
    public void iniciar() {
        boolean continuar = true;
 
        while (continuar) {
            exibirMenu();
            int opcao = lerOpcao();
 
            if (opcao == 1) {
                realizarOperacao("CONSULTAR");
            } else if (opcao == 2) {
                realizarOperacao("EMPRESTAR");
            } else if (opcao == 3) {
                continuar = false;
                System.out.println("Encerrando cliente...");
            } else {
                System.out.println("Opcao invalida!");
            }
        }
 
        scanner.close();
    }
 
    private void exibirMenu() {
        System.out.println();
        System.out.println("===== MENU =====");
        System.out.println("1 - Consultar livro");
        System.out.println("2 - Emprestar livro");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opcao: ");
    }
 
    private int lerOpcao() {
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            opcao = -1;
        }
        return opcao;
    }
 
    private void realizarOperacao(String operacao) {
        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
 
        Object resposta = enviarRequisicao(operacao, titulo);
 
        if (resposta != null) {
            exibirResposta(resposta);
        }
    }
 
    private Object enviarRequisicao(String operacao, String titulo) {
        Socket socket = null;
        ObjectOutputStream saida = null;
        ObjectInputStream entrada = null;
        Object resposta = null;
 
        try {
            socket = new Socket(host, porta);
 
            saida = new ObjectOutputStream(socket.getOutputStream());
            saida.flush();
            saida.writeObject(operacao);
            saida.writeObject(titulo);
            saida.flush();
 
            entrada = new ObjectInputStream(socket.getInputStream());
            resposta = entrada.readObject();
 
        } catch (IOException e) {
            System.out.println("Erro ao conectar ao servidor: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao ler resposta do servidor: " + e.getMessage());
        } finally {
            try {
                if (saida != null) {
                    saida.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar conexao: " + e.getMessage());
            }
        }
 
        return resposta;
    }
 
    private void exibirResposta(Object resposta) {
        System.out.println();
 
        if (resposta instanceof Livro) {
            Livro livro = (Livro) resposta;
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de publicacao: " + livro.getAnoPublicacao());
            System.out.println("Emprestado: " + (livro.isEmprestado() ? "Sim" : "Nao"));
        } else {
            System.out.println(resposta);
        }
    }
 
    public static void main(String[] args) {
        Cliente cliente = new Cliente("localhost", 12345);
        cliente.iniciar();
    }
}

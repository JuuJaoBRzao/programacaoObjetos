import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
 
public class Servidor {
 
    private ArrayList<Livro> livros;
 
    public Servidor() {
        this.livros = new ArrayList<Livro>();
        inicializarLivros();
    }
 
    private void inicializarLivros() {
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Cortico", "Aluisio Azevedo", 1890));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("Clean Code", "Robert C. Martin", 2008));
    }
 
    public void iniciar(int porta) {
        ServerSocket serverSocket = null;
 
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Servidor iniciado na porta " + porta);
            System.out.println("Aguardando conexoes...");
 
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado: " + socket.getInetAddress());
                atenderCliente(socket);
            }
 
        } catch (IOException e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o servidor: " + e.getMessage());
                }
            }
        }
    }
 
    private void atenderCliente(Socket socket) {
        ObjectOutputStream saida = null;
        ObjectInputStream entrada = null;
 
        try {
            saida = new ObjectOutputStream(socket.getOutputStream());
            saida.flush();
            entrada = new ObjectInputStream(socket.getInputStream());
 
            String operacao = (String) entrada.readObject();
            String titulo = (String) entrada.readObject();
            System.out.println("Requisicao recebida: " + operacao + " - " + titulo);
 
            Object resposta = processarRequisicao(operacao, titulo);
            saida.writeObject(resposta);
            saida.flush();
 
        } catch (IOException e) {
            System.out.println("Erro de comunicacao com o cliente: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao ler objeto recebido: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
                if (saida != null) {
                    saida.close();
                }
                socket.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar conexao: " + e.getMessage());
            }
        }
    }
 
    private Object processarRequisicao(String operacao, String titulo) {
        Livro livroEncontrado = buscarLivro(titulo);
 
        if (operacao.equalsIgnoreCase("CONSULTAR")) {
            if (livroEncontrado == null) {
                return "Livro inexistente: " + titulo;
            }
            return livroEncontrado;
 
        } else if (operacao.equalsIgnoreCase("EMPRESTAR")) {
            if (livroEncontrado == null) {
                return "Livro inexistente: " + titulo;
            }
            if (livroEncontrado.isEmprestado()) {
                return "Livro ja emprestado: " + titulo;
            }
            livroEncontrado.setEmprestado(true);
            return "Emprestimo realizado com sucesso!";
 
        } else {
            return "Operacao invalida: " + operacao;
        }
    }
 
    private Livro buscarLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
 
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.iniciar(12345);
    }
}

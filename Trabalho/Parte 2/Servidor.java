import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
 
public class Servidor {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> listaVeiculos = arquivo.leArquivo();
 
        System.out.println("Servidor iniciado, aguardando conexoes...");
 
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
 
            while (true) {
                Socket conexao = serverSocket.accept();
                System.out.println("Cliente conectado: " + conexao.getInetAddress());
 
                try {
                    ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
                    PrintWriter saida = new PrintWriter(conexao.getOutputStream(), true);
 
                    Veiculo veiculo = (Veiculo) entrada.readObject();
 
                    listaVeiculos.add(veiculo);
                    arquivo.gravaArquivo(listaVeiculos);
 
                    System.out.println("Veiculo cadastrado: " + veiculo.getPlaca() + " - " + veiculo.getModelo());
                    saida.println("Veiculo cadastrado com sucesso!");
 
                    entrada.close();
                    saida.close();
                    conexao.close();
                } catch (Exception e) {
                    System.out.println("Erro ao processar conexao: " + e.getMessage());
                }
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

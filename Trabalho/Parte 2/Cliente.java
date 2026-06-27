import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
 
public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== CADASTRO DE VEICULO ===");
 
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano de fabricacao: ");
        int ano = Integer.parseInt(scanner.nextLine());
        System.out.print("Quilometragem: ");
        double km = Double.parseDouble(scanner.nextLine());
 
        Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);
 
        try {
            Socket socket = new Socket("localhost", 12345);
 
            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
            saida.writeObject(veiculo);
            saida.flush();
 
            String resposta = entrada.readLine();
            System.out.println("Resposta do servidor: " + resposta);
 
            saida.close();
            entrada.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao servidor: " + e.getMessage());
        }
 
        scanner.close();
    }
}

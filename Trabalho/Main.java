import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> listaVeiculos = arquivo.leArquivo();
 
        int opcao;
 
        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Alterar quilometragem do veiculo");
            System.out.println("3 - Excluir veiculo pelo numero da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());
 
            if (opcao == 1) {
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
                listaVeiculos.add(veiculo);
                arquivo.gravaArquivo(listaVeiculos);
 
                System.out.println("Veiculo cadastrado com sucesso!");
 
            } else if (opcao == 2) {
                System.out.print("Placa do veiculo: ");
                String placa = scanner.nextLine();
                boolean encontrou = false;
 
                for (Veiculo v : listaVeiculos) {
                    if (v.getPlaca().equals(placa)) {
                        System.out.print("Nova quilometragem: ");
                        double novaKm = Double.parseDouble(scanner.nextLine());
                        v.setQuilometragem(novaKm);
                        encontrou = true;
                        break;
                    }
                }
 
                if (encontrou) {
                    arquivo.gravaArquivo(listaVeiculos);
                    System.out.println("Quilometragem atualizada com sucesso!");
                } else {
                    System.out.println("Veiculo nao encontrado.");
                }
 
            } else if (opcao == 3) {
                System.out.print("Placa do veiculo: ");
                String placa = scanner.nextLine();
                boolean removeu = listaVeiculos.removeIf(v -> v.getPlaca().equals(placa));
 
                if (removeu) {
                    arquivo.gravaArquivo(listaVeiculos);
                    System.out.println("Veiculo excluido com sucesso!");
                } else {
                    System.out.println("Veiculo nao encontrado.");
                }
 
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
 
            } else {
                System.out.println("Opcao invalida!");
            }
        }
 
        scanner.close();
    }
}

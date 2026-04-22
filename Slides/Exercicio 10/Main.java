mport java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int opcao;
 
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Criar produto informando nome");
            System.out.println("2 - Criar produto informando nome e preco");
            System.out.println("3 - Exibir informacoes do produto");
            System.out.println("4 - Atribuir nome do produto");
            System.out.println("5 - Obter nome do produto");
            System.out.println("6 - Atribuir preco do produto");
            System.out.println("7 - Obter preco do produto");
            System.out.println("8 - Atribuir quantidade em estoque");
            System.out.println("9 - Obter quantidade em estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome1 = scanner.nextLine();
                    produto = new Produto(nome1);
                    System.out.println("Produto criado com sucesso!");
                    break;
 
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nome2 = scanner.nextLine();
                    System.out.print("Digite o preco do produto: ");
                    double preco2 = scanner.nextDouble();
                    scanner.nextLine();
                    produto = new Produto(nome2, preco2);
                    System.out.println("Produto criado com sucesso!");
                    break;
 
                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        produto.exibirInformacoes();
                    }
                    break;
 
                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        produto.setNome(novoNome);
                        System.out.println("Nome atualizado com sucesso!");
                    }
                    break;
 
                case 5:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.println("Nome do produto: " + produto.getNome());
                    }
                    break;
 
                case 6:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Digite o novo preco: ");
                        double novoPreco = scanner.nextDouble();
                        scanner.nextLine();
                        produto.setPreco(novoPreco);
                        System.out.println("Preco atualizado com sucesso!");
                    }
                    break;
 
                case 7:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.printf("Preco do produto: R$ %.2f%n", produto.getPreco());
                    }
                    break;
 
                case 8:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Digite a quantidade em estoque: ");
                        int qtd = scanner.nextInt();
                        scanner.nextLine();
                        produto.setQuantidadeEstoque(qtd);
                        System.out.println("Estoque atualizado com sucesso!");
                    }
                    break;
 
                case 9:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
                    }
                    break;
 
                case 0:
                    System.out.println("Saindo... Ate logo!");
                    break;
 
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
 
        } while (opcao != 0);
 
        scanner.close();
    }
}

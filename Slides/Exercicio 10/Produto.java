public class Produto {
 
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEstoque;
 
    // Construtor que recebe apenas o nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }
 
    // Construtor que recebe nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }
 
    // Getters e Setters
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getPreco() {
        return preco;
    }
 
    public void setPreco(double preco) {
        this.preco = preco;
    }
 
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
 
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
 
    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("=== Informações do Produto ===");
        System.out.println("Nome:              " + nome);
        System.out.printf("Preço:             R$ %.2f%n", preco);
        System.out.println("Quantidade Estoque: " + quantidadeEstoque);
        System.out.println("==============================");
    }
}

public abstract class Pessoa {

    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public abstract void efetuarCompra(String produto, double valor);

    public void exibirInfo() {
        System.out.printf("  Nome: %s | Cidade: %s%n", nome, cidade);
    }
}

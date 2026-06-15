class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, int idade, String cpf) {
        super(nome, cidade, idade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra(String produto, double valor) {
        System.out.println(nome + " (CPF: " + cpf + ") comprou " + produto + " por R$" + valor);
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    @Override
    public void efetuarCompra(String produto, double valor) {
        System.out.println("PF " + nome + " (CPF: " + cpf + ") comprou " + produto + " por R$" + valor);
    }
}

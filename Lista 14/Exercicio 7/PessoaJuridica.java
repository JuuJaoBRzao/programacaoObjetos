class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    public String getCnpj() { return cnpj; }

    @Override
    public void efetuarCompra(String produto, double valor) {
        System.out.println("PJ " + nome + " (CNPJ: " + cnpj + ") comprou " + produto + " por R$" + valor);
    }
}

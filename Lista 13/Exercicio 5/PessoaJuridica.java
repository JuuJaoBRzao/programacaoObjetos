ublic class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String cidade, String cnpj, String razaoSocial) {
        super(nome, cidade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void efetuarCompra(String produto, double valor) {
        double desconto = valor * 0.05;
        double valorFinal = valor - desconto;
        System.out.println("  [PessoaJuridica] Compra realizada!");
        System.out.printf("  Empresa     : %s | CNPJ: %s%n", razaoSocial, cnpj);
        System.out.printf("  Produto     : %s%n", produto);
        System.out.printf("  Valor bruto : R$ %.2f%n", valor);
        System.out.printf("  Desconto PJ : -R$ %.2f (5%%)%n", desconto);
        System.out.printf("  Valor final : R$ %.2f%n", valorFinal);
        System.out.printf("  NF com CNPJ : %s%n", cnpj);
    }

    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
}

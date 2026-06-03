public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra(String produto, double valor) {
        System.out.println("  [PessoaFisica] Compra realizada!");
        System.out.printf("  Cliente : %s | CPF: %s%n", nome, cpf);
        System.out.printf("  Produto : %s%n", produto);
        System.out.printf("  Valor   : R$ %.2f%n", valor);
        System.out.printf("  NF com CPF: %s%n", cpf);
    }

    public String getCpf() { return cpf; }
}

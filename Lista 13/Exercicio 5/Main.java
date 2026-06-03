public class Main {

    public static void main(String[] args) {

        System.out.println("=== Pessoa Fisica ===");
        PessoaFisica pf = new PessoaFisica("Joao Silva", "Porto Alegre", "123.456.789-00");
        pf.exibirInfo();
        pf.efetuarCompra("Notebook Dell", 3500.00);

        System.out.println();
        System.out.println("=== Pessoa Juridica ===");
        PessoaJuridica pj = new PessoaJuridica("Tech LTDA", "Sao Paulo",
                "12.345.678/0001-99", "Tech Solucoes LTDA");
        pj.exibirInfo();
        pj.efetuarCompra("Servidor HP", 15000.00);
    }
}

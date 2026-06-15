class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "São Paulo", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X Ltda", "Rio de Janeiro", "12.345.678/0001-99");

        pf.efetuarCompra("Notebook", 3500.00);
        pf.efetuarCompra("Mouse", 150.00);

        System.out.println();

        pj.efetuarCompra("Servidor", 15000.00);
        pj.efetuarCompra("Licença de Software", 4200.00);
    }
}

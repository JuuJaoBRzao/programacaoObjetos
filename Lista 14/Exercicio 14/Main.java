class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "SP", 30, "123.456.789-00");
        pf.efetuarCompra("Notebook", 3500.00);

        try {
            new PessoaFisica("Inválido", "RS", -5, "000");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            new PessoaFisica("Inválido", "RS", 150, "000");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

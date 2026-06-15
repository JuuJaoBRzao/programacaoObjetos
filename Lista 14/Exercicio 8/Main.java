class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Ana", 5000);
        Funcionario vendedor = new Vendedor("Carlos", 2000);

        gerente.calcularSalario();
        vendedor.calcularSalario();
    }
}

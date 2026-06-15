abstract class Pessoa {
    protected String nome;
    protected String cidade;
    protected int idade;

    public Pessoa(String nome, String cidade, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        validarIdade(idade);
    }

    public void validarIdade(int idade) {
        if (idade < 0 || idade > 120)
            throw new IllegalArgumentException(
                "Idade inválida: " + idade + ". Deve ser entre 0 e 120."
            );
    }

    public abstract void efetuarCompra(String produto, double valor);
}

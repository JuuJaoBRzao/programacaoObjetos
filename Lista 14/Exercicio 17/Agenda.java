class Agenda {
    public void adicionarContato(String nome, String telefone) {
        if (nome == null || nome.isEmpty())
            throw new IllegalArgumentException(
                "Nome não pode ser nulo ou vazio."
            );
        if (telefone == null || telefone.isEmpty())
            throw new IllegalArgumentException(
                "Telefone não pode ser nulo ou vazio."
            );
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
    }
}

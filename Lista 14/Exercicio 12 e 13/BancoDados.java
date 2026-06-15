class BancoDeDados implements AcessoDados {
    @Override
    public void conectar() { System.out.println("[BD] Conectado ao banco de dados."); }

    @Override
    public void desconectar() { System.out.println("[BD] Desconectado do banco de dados."); }

    @Override
    public void inserir(String dado) { System.out.println("[BD] Inserindo: " + dado); }

    @Override
    public void atualizar(String dado) { System.out.println("[BD] Atualizando: " + dado); }

    @Override
    public void excluir(String dado) { System.out.println("[BD] Excluindo: " + dado); }
}

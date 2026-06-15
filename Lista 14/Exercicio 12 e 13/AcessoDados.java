interface AcessoDados {
    void conectar();
    void desconectar();
    void inserir(String dado);
    void atualizar(String dado);
    void excluir(String dado);
}

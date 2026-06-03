public interface AcessoDados {

    void conectar();
    void desconectar();
    void inserir(String dados);
    void atualizar(String criterio, String novosDados);
    void excluir(String criterio);
}

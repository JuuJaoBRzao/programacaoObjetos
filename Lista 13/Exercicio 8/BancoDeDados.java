public class BancoDeDados implements AcessoDados {

    private String host;
    private String banco;
    private boolean conectado;

    public BancoDeDados(String host, String banco) {
        this.host = host;
        this.banco = banco;
        this.conectado = false;
    }

    @Override
    public void conectar() {
        if (conectado) {
            System.out.println("  [BD] Ja existe uma conexao ativa.");
            return;
        }
        System.out.printf("  [BD] Conectando ao banco '%s' em '%s'...%n", banco, host);
        conectado = true;
        System.out.println("  [BD] Conexao estabelecida!");
    }

    @Override
    public void desconectar() {
        if (!conectado) {
            System.out.println("  [BD] Nenhuma conexao ativa.");
            return;
        }
        System.out.printf("  [BD] Encerrando conexao com '%s'...%n", banco);
        conectado = false;
        System.out.println("  [BD] Conexao encerrada!");
    }

    @Override
    public void inserir(String dados) {
        if (!conectado) { System.out.println("  [BD] Erro: sem conexao."); return; }
        System.out.printf("  [BD] INSERT >> %s%n", dados);
        System.out.println("  [BD] 1 registro inserido.");
    }

    @Override
    public void atualizar(String criterio, String novosDados) {
        if (!conectado) { System.out.println("  [BD] Erro: sem conexao."); return; }
        System.out.printf("  [BD] UPDATE >> WHERE [%s] SET [%s]%n", criterio, novosDados);
        System.out.println("  [BD] 1 registro atualizado.");
    }

    @Override
    public void excluir(String criterio) {
        if (!conectado) { System.out.println("  [BD] Erro: sem conexao."); return; }
        System.out.printf("  [BD] DELETE >> WHERE [%s]%n", criterio);
        System.out.println("  [BD] 1 registro excluido.");
    }
}

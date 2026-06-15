class Main {
    public static void main(String[] args) {
        AcessoDados bd = new BancoDeDados();

        bd.conectar();
        bd.inserir("usuario='joao'");
        bd.atualizar("SET nome='João Silva' WHERE usuario='joao'");
        bd.excluir("usuario='joao'");
        bd.desconectar();
    }
}

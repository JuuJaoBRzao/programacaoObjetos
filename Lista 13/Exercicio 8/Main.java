public class Main {

    public static void main(String[] args) {

        System.out.println("=== Banco de Dados ===");
        BancoDeDados bd = new BancoDeDados("localhost:5432", "sistema_vendas");

        bd.inserir("nome='Ana'");           
        bd.conectar();
        bd.inserir("nome='Ana', idade=30");
        bd.atualizar("id=1", "nome='Ana Paula'");
        bd.excluir("id=99");
        bd.conectar();                     
        bd.desconectar();
        bd.desconectar();                   
    }
}

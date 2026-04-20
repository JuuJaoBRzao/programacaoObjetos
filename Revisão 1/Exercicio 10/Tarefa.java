public class Tarefa {
    private String descricao;
    private boolean concluida = false;

    public Tarefa(Strin descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean concluirTarefa(){
        System.out.println("Tarefa concluida");
        this.concluida = true;
        return concluida;
    }

    public exibirTarefa(){
        System.out.println("Tarefa: " +descricao);
        if(concluida){
            System.out.println("Status: Concluida");
        } else {
            System.out.println("Status: Pendente");
        }
    }
}

public class Disciplina {
 
    // Atributos privados
    private String nome;
    private int cargaHoraria;
    private String nomeProfessor;
 
    // Construtor com valores padrão
    public Disciplina() {
        this.nome = "Programacao Orientada a Objetos";
        this.cargaHoraria = 60;
        this.nomeProfessor = "Ricardo Frohlich da Silva";
    }
 
    // Getters
    public String getNome() { return nome; }
    public int getCargaHoraria() { return cargaHoraria; }
    public String getNomeProfessor() { return nomeProfessor; }
 
    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public void setNomeProfessor(String nomeProfessor) { this.nomeProfessor = nomeProfessor; }
 
    // Método para exibir os atributos
    public void exibirInformacoes() {
        System.out.println("+---------------------------------+");
        System.out.println("| Informacoes da Disciplina       |");
        System.out.println("+---------------------------------+");
        System.out.println("  Nome:          " + nome);
        System.out.println("  Carga Horaria: " + cargaHoraria + "h");
        System.out.println("  Professor:     " + nomeProfessor);
        System.out.println("+---------------------------------+");
    }
}

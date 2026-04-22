public class Livro {
 
    // Atributos privados
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;
 
    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo        = titulo;
        this.autor         = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero        = genero;
        this.emprestado    = false; // começa disponível
    }
 
    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
 
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
 
    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
 
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
 
    public boolean isEmprestado() { return emprestado; }
 
    // Método de informações
    public void exibirInformacoes() {
        System.out.println("+------------------------------------------+");
        System.out.println("|          INFORMACOES DO LIVRO            |");
        System.out.println("+------------------------------------------+");
        System.out.println("  Titulo:         " + titulo);
        System.out.println("  Autor:          " + autor);
        System.out.println("  Ano publicacao: " + anoPublicacao);
        System.out.println("  Genero:         " + genero);
        System.out.println("  Status:         " + (emprestado ? "Emprestado" : "Disponivel"));
        System.out.println("+------------------------------------------+");
    }
 
    // Método de empréstimo
    public void emprestar() {
        if (emprestado) {
            System.out.println("ERRO: O livro \"" + titulo + "\" ja esta emprestado. Devolucao pendente.");
        } else {
            emprestado = true;
            System.out.println("OK: O livro \"" + titulo + "\" foi emprestado com sucesso!");
        }
    }
 
    // Método de devolução
    public void devolver() {
        if (!emprestado) {
            System.out.println("AVISO: O livro \"" + titulo + "\" ja esta disponivel. Nenhuma devolucao necessaria.");
        } else {
            emprestado = false;
            System.out.println("OK: O livro \"" + titulo + "\" foi devolvido com sucesso!");
        }
    }
}
 

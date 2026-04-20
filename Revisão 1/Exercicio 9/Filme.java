public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoEmMinutos;
    private String genero;

    public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " +titulo);
        System.out.println("Diretor: " +diretor);
        System.out.println("Duração: " +duracaoEmMinutos);
        System.out.println("Genero: " +genero);
    }

    public boolean ehLongo(){
        if(duracaoEmMinutos >= 120){
            System.out.println("O filme tem 2 horas ou mais");
            return true;
        } else {
            System.out.println("Filme tem menos de 2 horas");
            return false;
        }
    }
}

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Versão 1: imprime a mensagem uma única vez
    public void falar(String mensagem) {
        System.out.println(nome + " diz: " + mensagem);
    }

    // Versão 2: imprime a mensagem N vezes (sobrecarga)
    public void falar(String mensagem, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(nome + " diz: " + mensagem);
        }
    }
}

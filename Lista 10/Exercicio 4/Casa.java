public class Casa {

    private static final double PRECO_M2     = 3_000.0;  
    private static final double PRECO_QUARTO = 15_000.0; 
  
    public double calcularPreco(int tamanho) {
        return tamanho * PRECO_M2;
    }

    public double calcularPreco(int tamanho, int quartos) {
        return (tamanho * PRECO_M2) + (quartos * PRECO_QUARTO);
    }
}

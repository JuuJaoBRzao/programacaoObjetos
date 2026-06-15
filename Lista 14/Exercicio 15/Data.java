class Data {
    private int dia;
    private int mes;
    private int ano;
 
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
    }
 
    public void validarData() {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido: " + mes);
 
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if (bissexto) diasPorMes[1] = 29;
 
        if (dia < 1 || dia > diasPorMes[mes - 1])
            throw new IllegalArgumentException(
                "Data inválida: " + dia + "/" + mes + "/" + ano
            );
    }
 
    @Override
    public String toString() { return dia + "/" + mes + "/" + ano; }
}

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Arquivo {
    private String nomeArquivo;
 
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
 
    public void gravaArquivo(List<Veiculo> listaVeiculos) {
        try {
            FileWriter arqw = new FileWriter(nomeArquivo + ".txt");
            BufferedWriter escritor = new BufferedWriter(arqw);
 
            for (Veiculo v : listaVeiculos) {
                escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca() + "," + v.getAnoFabricacao() + "," + v.getQuilometragem());
                escritor.newLine();
            }
 
            escritor.close();
            arqw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public List<Veiculo> leArquivo() {
        List<Veiculo> listaVeiculos = new ArrayList<>();
 
        try {
            FileReader arqr = new FileReader(nomeArquivo + ".txt");
            BufferedReader leitor = new BufferedReader(arqr);
 
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");
 
                String placa = campos[0];
                String modelo = campos[1];
                String marca = campos[2];
                int anoFabricacao = Integer.parseInt(campos[3]);
                double quilometragem = Double.parseDouble(campos[4]);
 
                Veiculo veiculo = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);
                listaVeiculos.add(veiculo);
            }
 
            leitor.close();
            arqr.close();
        } catch (IOException e) {
            // Arquivo ainda nao existe, lista comeca vazia
        }
 
        return listaVeiculos;
    }
}

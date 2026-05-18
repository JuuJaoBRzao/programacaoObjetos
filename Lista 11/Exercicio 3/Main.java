package pkg;

import java.util.ArrayList;
import java.util.List;

public class Main {
	 
    public static int contarMulheres(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("F")) {
                contador++;
            }
        }
        return contador;
    }
 
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
 
        pessoas.add(new Pessoa("Ana",     25, "F"));
        pessoas.add(new Pessoa("Bruno",   30, "M"));
        pessoas.add(new Pessoa("Carla",   22, "F"));
        pessoas.add(new Pessoa("Diego",   28, "M"));
        pessoas.add(new Pessoa("Elisa",   35, "F"));
        pessoas.add(new Pessoa("Felipe",  19, "M"));
 
        int totalMulheres = contarMulheres(pessoas);
 
        System.out.println("=== Lista de Pessoas ===");
        for (Pessoa p : pessoas) {
            System.out.printf("Nome: %-10s | Idade: %d | Sexo: %s%n",
                    p.getNome(), p.getIdade(), p.getSexo());
        }
        System.out.println("\nQuantidade de mulheres: " + totalMulheres);
    }
}

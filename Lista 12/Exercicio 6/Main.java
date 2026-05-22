package pkg;

public class Main {

	public static void main(String[] args) {
		Funcionario[] equipe = {
	            new Gerente("Ana Lima", 12_000.00, 8_000.00),
	            new Gerente("Carlos Mendes", 15_000.00, 10_000.00),
	            new Desenvolvedor("Beatriz Costa", 7_500.00, 40, 75.0),
	            new Desenvolvedor("Diego Alves",   8_200.00, 55, 75.0),
	            new Desenvolvedor("Fernanda Rocha",6_800.00, 30, 75.0)
	        };

	        System.out.println("=== ESTADO INICIAL ===");
	        for (Funcionario f : equipe) System.out.println(f);

	        System.out.println("\n=== AUMENTO BASE: 10% PARA TODOS ===");
	        for (Funcionario f : equipe) f.aumentarSalario(10);
	        for (Funcionario f : equipe) System.out.println(f);

	        System.out.println("\n=== AUMENTO ESPECÍFICO POR CARGO ===");
	        for (Funcionario f : equipe) {
	            if (f instanceof Gerente g) {
	                g.aumentarSalario(5, 15);
	            } else if (f instanceof Desenvolvedor d) {
	                d.aumentarSalario(3, true);
	            }
	            System.out.println(f);
	        }

	        System.out.println("\n=== TOTAL DA FOLHA ===");
	        double total = 0;
	        for (Funcionario f : equipe) total += f.getSalario();
	        System.out.printf("R$ %,.2f%n", total);

	}

}

package pkg;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int numeros[] = {1, 2, 3};
			System.out.println(numeros[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: indice fora do array\n" +e.getMessage());
		} catch (Exception e) {
			System.out.println("Exceção: "+e.toString());
		}
		
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Erro: Exceção aritmetica\n" +e.getMessage());
		} catch (Exception e) {
			System.out.println("Exceção: "+e.toString());
		}
		
		try {
			String numero = "abc";
			int valor = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			System.out.println("Erro: Formato errado de número para string\n" +e.getMessage());
		} catch (Exception e) {
			System.out.println("Exceção: "+e.toString());
		}

	}

}

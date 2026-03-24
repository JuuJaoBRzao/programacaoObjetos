// ArithmeticException:	Erros matemáticos, como divisão por zero.
// NullPointerException: A famosa "NPE". Ocorre quando você tenta usar um objeto que está nulo.
// ArrayIndexOutOfBoundsException:	Quando você tenta acessar uma posição do array que não existe.
// ClassCastException:	Tentativa inválida de converter um objeto de um tipo para outro.
// NumberFormatException: Tentar converter uma String (tipo "ABC") em número.
// IllegalArgumentException:	Quando um método recebe um argumento que não faz sentido.
// IOException: Falha geral de entrada/saída (leitura de arquivos, rede).
// FileNotFoundException: Quando o código tenta abrir um arquivo que não está lá.
// SQLException: Erros ao interagir com bancos de dados.

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

package projeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Animal a = new Animal();
		Cachorro c = new Cachorro();
		Tigre t = new Tigre();
		c.emiteSom();
		t.emiteSom();*/
		
		Scanner teclado = new Scanner (System.in);
		Animal a;
		int op;
		System.out.println("Digite:");
		System.out.println("1 para instanciar o cachorro ou");
		System.out.println("2 para instanciar o tigre");
		op = teclado.nextInt();
		
		if(op == 1) {
			a = new Cachorro();
			a.especie = "sdklfdkl";
			a.idade = 67;
			a.raca = "dsfks";
			a.emiteSom();
			a.exibeInfo();
			a.cuidarPatio();
		} else {
			a = new Tigre();
			a.especie = "tigre do ursinho po";
			a.idade = 200;
			a.raca = "lkdfjsl";
			a.emiteSom();
			a.exibeInfo();
			a.cuidarPatio();
		}

	}

}

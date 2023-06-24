package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe n1:");
		double n1 = leitor.nextInt();
		System.out.println("Informe n2:");
		double n2 = leitor.nextInt();
		System.out.println("Informe n3:");
		double n3 = leitor.nextInt();
		System.out.println("Informe n4:");
		double n4 = leitor.nextInt();

		double m = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A média é:");
		System.out.println(m);
	}

}

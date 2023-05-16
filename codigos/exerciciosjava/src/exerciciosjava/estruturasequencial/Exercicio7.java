package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do lado do quadrado:");
		double lado = leitor.nextDouble();

		double area = lado * lado;

		double dobroArea = area * 2;

		System.out.println("O dobro da área do quadrado é:");
		System.out.println(dobroArea);
	}

}

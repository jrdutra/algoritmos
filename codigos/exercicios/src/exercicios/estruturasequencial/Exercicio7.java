package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o lado do quadrado:");
		double l = leitor.nextDouble();

		double area = l * l;

		double dobroDaArea = area * 2;

		System.out.println("O dobro da área é:");
		System.out.println(dobroDaArea);
	}

}

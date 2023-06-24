package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a nota 1:");
		double n1 = leitor.nextDouble();

		System.out.println("Informe a nota 2:");
		double n2 = leitor.nextDouble();

		double media = (n1 + n2) / 2;

		if (media == 10) {
			System.out.println("Aprovado com Distinção ");
		} else {
			if (media >= 7.0) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
}

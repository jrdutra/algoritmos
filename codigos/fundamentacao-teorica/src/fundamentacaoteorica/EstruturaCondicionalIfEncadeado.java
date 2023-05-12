package fundamentacaoteorica;

import java.util.Scanner;

public class EstruturaCondicionalIfEncadeado {

	public static void main(Strings[] args) {
		System.out.println("Informe o dia da semana: ");
		Scanner leitor = new Scanner(System.in);
		int dia = leitor.nextInt();

		System.out.println("O dia da semana informado é:");

		if (dia == 1) {
			System.out.println("domingo");
		} else if (dia == 2) {
			System.out.println("segunda-feira");
		} else if (dia == 3) {
			System.out.println("terça-feira");
		} else if (dia == 4) {
			System.out.println("quarta-feira");
		} else if (dia == 5) {
			System.out.println("quinta-feira");
		} else if (dia == 6) {
			System.out.println("sexta-feira");
		} else if (dia == 7) {
			System.out.println("sábado");
		} else {
			System.out.println("dia inválido");
		}

	}

}

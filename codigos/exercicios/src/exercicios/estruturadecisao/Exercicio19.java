package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe um valor:");
		int valor = leitor.nextInt();

		if (valor > 0) {
			System.out.println("O valor informado é positivo");
		} else {
			System.out.println("O valor informado é negativo");
		}

	}

}

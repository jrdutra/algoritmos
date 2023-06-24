package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe n1:");
		int n1 = leitor.nextInt();

		System.out.println("Informe n2:");
		int n2 = leitor.nextInt();

		System.out.println("Informe n3:");
		int n3 = leitor.nextInt();

		int maior;

		if (n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}

		if (maior < n3) {
			maior = n3;
		}

		System.out.println("O maior número informado é: " + maior);

	}

}

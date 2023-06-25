package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o n1: ");
		int n1 = leitor.nextInt();

		System.out.println("Informe o n2: ");
		int n2 = leitor.nextInt();

		System.out.println("Informe o n3: ");
		int n3 = leitor.nextInt();

		int aux;

		if (n2 > n1) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}

		if (n3 > n1) {
			aux = n1;
			n1 = n3;
			n3 = aux;
		}

		if (n3 > n2) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}

		System.out.println("A ordem decrescente dos números é: " + n1 + " " + n2 + " " + n3);

	}

}

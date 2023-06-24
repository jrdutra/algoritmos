package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe n1:");
		int n1 = leitor.nextInt();

		System.out.println("Informe n2:");
		int n2 = leitor.nextInt();

		System.out.println("Informe n3:");
		int n3 = leitor.nextInt();

		int maiorNumero;
		int menorNumero;

		if (n1 > n2) {
			maiorNumero = n1;
			menorNumero = n2;
		} else {
			maiorNumero = n2;
			menorNumero = n1;
		}

		if (maiorNumero < n3) {
			maiorNumero = n3;
		}

		if (menorNumero > n3) {
			menorNumero = n3;
		}

		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("O menor número é: " + menorNumero);

	}

}

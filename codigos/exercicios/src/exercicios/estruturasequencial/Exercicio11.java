package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro:");
		int n1 = leitor.nextInt();

		System.out.println("Informe o segundo número inteiro:");
		int n2 = leitor.nextInt();

		System.out.println("Informe um número real:");
		double n3 = leitor.nextDouble();

		System.out.println("a. O produto do dobro do primeiro com metade do segundo:");
		int dobroPrimeiro = n1 * 2;
		int metadeSegundo = n2 / 2;
		int produto = dobroPrimeiro * metadeSegundo;
		System.out.println(produto);

		System.out.println("b. A soma do triplo do primeiro com o terceiro:");
		int triploPrimeiro = n1 * 3;
		double soma = triploPrimeiro + n3;
		System.out.println(soma);

		System.out.println("c. O terceiro elevado ao cubo:");
		double cubo = n3 * n3 * n3;
		System.out.println(cubo);
	}

}

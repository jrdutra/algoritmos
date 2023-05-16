package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro:");
		int numInt1 = leitor.nextInt();

		System.out.println("Informe o segundo número inteiro:");
		int numInt2 = leitor.nextInt();

		System.out.println("Informe um número real:");
		double numReal = leitor.nextDouble();

		System.out.println("a. O produto do dobro do primeiro com metade do segundo:");
		int dobroPrimeiro = numInt1 * 2;
		int metadeSegundo = numInt2 / 2;
		int produto = dobroPrimeiro * metadeSegundo;
		System.out.println(produto);

		System.out.println("b. A soma do triplo do primeiro com o terceiro:");
		int triploPrimeiro = numInt1 * 3;
		double soma = triploPrimeiro + numReal;
		System.out.println(soma);

		System.out.println("c. O terceiro elevado ao cubo.");
		double cubo = numReal * numReal * numReal;

		System.out.println("Cubo: " + cubo);
	}

}

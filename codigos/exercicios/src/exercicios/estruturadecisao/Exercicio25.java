package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o preço do produto 1");
		double preco1 = leitor.nextDouble();
		System.out.println("Informe o preço do produto 2");
		double preco2 = leitor.nextDouble();
		System.out.println("Informe o preço do produto 3");
		double preco3 = leitor.nextDouble();

		double menorPreco;

		if (preco1 < preco2) {
			menorPreco = preco1;
		} else {
			menorPreco = preco2;
		}

		if (preco3 < menorPreco) {
			menorPreco = preco3;
		}

		System.out.println("Você deve optar pelo produto de preço: R$" + menorPreco);
	}

}

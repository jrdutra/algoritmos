package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe preço do produto 1");
		double preco1 = leitor.nextDouble();

		System.out.println("Informe preço do produto 2");
		double preco2 = leitor.nextDouble();

		System.out.println("Informe preço do produto 3");
		double preco3 = leitor.nextDouble();

		double menorPreco;
		int produto;

		if(preco1 > preco2){
			menorPreco = preco2;
			produto = 2;
		}else {
			menorPreco = preco1;
			produto = 1;
		}

		if(menorPreco > preco3) {
			menorPreco = preco3;
			produto = 3;
		}

		System.out.println("Você deve optar pelo produto " + produto);
	}

}

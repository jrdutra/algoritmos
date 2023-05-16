package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o peso de peixe:");
		double pesoTotal = leitor.nextDouble();

		double excesso = pesoTotal - 50;
		double multa = excesso * 4;

		System.out.println("Peso excedente: " + excesso);
		System.out.println("Multa: R$" + multa);
	}

}

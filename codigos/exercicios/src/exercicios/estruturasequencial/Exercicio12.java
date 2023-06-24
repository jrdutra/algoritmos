package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a sua altura:");
		double altura = leitor.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O seu peso ideal é:");
		System.out.println(pesoIdeal);
	}

}

package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a sua altura:");
		double altura = leitor.nextDouble();

		double pesoIdealHomem = (72.7 * altura) - 58;
		double pesoIdealMulher = (62.1 * altura) - 44.7;

		System.out.println("O peso ideal para homem é: ");
		System.out.println(pesoIdealHomem);

		System.out.println("O peso ideal para mulher é:");
		System.out.println(pesoIdealMulher);
	}

}

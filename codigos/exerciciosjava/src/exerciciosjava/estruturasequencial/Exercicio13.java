package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe sua altura:");
		double altura = leitor.nextDouble();

		double pesoIdealHomem = 72.7*altura-58;
		System.out.println("O seu peso ideal para um homem é: ");
		System.out.println(pesoIdealHomem);

		double pesoIdealMulher = 62.1*altura-44.7;
		System.out.println("O seu peso ideal para uma mulher é: ");
		System.out.println(pesoIdealMulher);
	}

}

package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Celcius:");
		double C = leitor.nextDouble();

		double F = ((9 * C) / 5) + 32;

		System.out.println("A temperatura em graus Fahrenheit é:");
		System.out.println(F);
	}

}

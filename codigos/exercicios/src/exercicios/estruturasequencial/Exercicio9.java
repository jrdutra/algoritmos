package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Fahrenheit:");
		double F = leitor.nextDouble();

		double C = 5 * ((F - 32) / 9);

		System.out.println("A temperatura em graus Celcius é:");
		System.out.println(C);
	}

}

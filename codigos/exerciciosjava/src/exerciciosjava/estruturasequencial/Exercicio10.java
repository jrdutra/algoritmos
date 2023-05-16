package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Célcius:");
		double temperaturaCelcius = leitor.nextDouble();

		double temperaturaFahrenheit = temperaturaCelcius * (9/5) + 32;

		System.out.println("A temperatura em graus Fahrenheit é:");
		System.out.println(temperaturaFahrenheit);
	}

}

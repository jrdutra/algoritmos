package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Fahrenheit:");
		double temperaturaFahrenheit = leitor.nextDouble();

		double temperaturaCelcius = 5 * ((temperaturaFahrenheit - 32) / 9);

		System.out.println("A temperatura em graus célcius é: " + temperaturaCelcius);
	}

}

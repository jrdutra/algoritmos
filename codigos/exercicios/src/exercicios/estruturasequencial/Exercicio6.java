package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		System.out.println("Informe o raio do círculo:");

		Scanner leitor = new Scanner(System.in);
		double raio = leitor.nextDouble();

		double area = 3.14 * raio * raio;

		System.out.println("A área do circulo é:");
		System.out.println(area);
	}

}

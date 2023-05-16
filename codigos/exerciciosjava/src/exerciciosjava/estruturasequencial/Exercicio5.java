package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a medida em metros:");
		int medidaMetro = leitor.nextInt();

		int medidaCentimetro = medidaMetro * 100;

		System.out.println("A medida em centimetros é:");
		System.out.println(medidaCentimetro);
	}

}

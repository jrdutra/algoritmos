package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe qual o seu turno de estudo:");
		System.out.println("M-matutino");
		System.out.println("V-Vespertino");
		System.out.println("N-Noturno");

		char turno = leitor.next().charAt(0);

		switch(turno) {
			case 'M':
				System.out.println("Bom dia!");
				break;
			case 'V':
				System.out.println("Boa Tarde!");
				break;
			case 'N':
				System.out.println("Boa Noite!");
				break;
			default:
				System.out.println("Turno inválido");
		}

	}

}

package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe uma letra:");

		char letra = leitor.next().charAt(0);

		// FORMA 1
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Forma 1: É uma vogal");
		} else {
			System.out.println("Forma 1: É uma consoante");
		}

		// FORMA 2
		boolean ehVogal = false;
		if (letra == 'a') {
			System.out.println("Forma 2: É uma vogal");
			ehVogal = true;
		}

		if (letra == 'e') {
			System.out.println("Forma 2: É uma vogal");
			ehVogal = true;
		}

		if (letra == 'i') {
			System.out.println("Forma 2: É uma vogal");
			ehVogal = true;
		}

		if (letra == 'o') {
			System.out.println("Forma 2: É uma vogal");
			ehVogal = true;
		}

		if (letra == 'u') {
			System.out.println("Forma 2: É uma vogal");
			ehVogal = true;
		}

		if (!ehVogal) {
			System.out.println("Forma 2: É uma consoante");
		}

		// FORMA 3
		switch (letra) {
		case 'a':
			System.out.println("Forma 3: É uma vogal");
			break;
		case 'e':
			System.out.println("Forma 3: É uma vogal");
			break;
		case 'i':
			System.out.println("Forma 3: É uma vogal");
			break;
		case 'o':
			System.out.println("Forma 3: É uma vogal");
			break;
		case 'u':
			System.out.println("Forma 3: É uma vogal");
			break;
		default:
			System.out.println("Forma 3: É uma consoante");
		}

	}

}

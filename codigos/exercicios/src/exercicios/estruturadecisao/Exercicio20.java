package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe uma letra: ");
		char letra = leitor.next().charAt(0);

		switch (letra) {
		case 'F':
			System.out.println("F - Feminino");
			break;
		case 'M':
			System.out.println("M - Masculino");
			break;
		default:
			System.out.println("Outro sexo");
			break;
		}

	}

}

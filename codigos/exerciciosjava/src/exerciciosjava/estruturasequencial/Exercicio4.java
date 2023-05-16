package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a nota 1:");
		int nota1 = leitor.nextInt();

		System.out.println("Informe a nota 2:");
		int nota2 = leitor.nextInt();

		System.out.println("Informe a nota 3:");
		int nota3 = leitor.nextInt();

		System.out.println("Informe a nota 4:");
		int nota4 = leitor.nextInt();

		int media = (nota1 + nota2 + nota3 + nota4)/4;

		System.out.println("A media das notas é:");
		System.out.println(media);
	}

}

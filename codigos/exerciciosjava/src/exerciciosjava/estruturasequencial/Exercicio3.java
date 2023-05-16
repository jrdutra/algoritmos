package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe um numero inteiro:");
		int numero1 = leitor.nextInt();

		System.out.println("Informe um segundo número inteiro:");
		int numero2 = leitor.nextInt();

		int soma = numero1 + numero2;

		System.out.println("A soma é:");
		System.out.println(soma);
	}
}

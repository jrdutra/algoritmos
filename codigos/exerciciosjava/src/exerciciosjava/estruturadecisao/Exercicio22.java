package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a nota parcial 1");
		double nota1 = leitor.nextDouble();

		System.out.println("Informe a nota parcial 2");
		double nota2 = leitor.nextDouble();

		double media = (nota1 + nota2) / 2;

		if(media == 10.0) {
			System.out.println("Aprovado com Distinção");
		}else if(media >= 7.0) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}

	}

}

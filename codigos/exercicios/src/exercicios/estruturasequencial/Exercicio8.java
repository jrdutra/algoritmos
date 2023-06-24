package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora?");
		double precoHora = leitor.nextDouble();

		System.out.println("Qual o número de horas trabalhadas no mês?");
		double qtdHora = leitor.nextDouble();

		double salario = qtdHora * precoHora;

		System.out.println("O salário é:");
		System.out.println(salario);
	}
}

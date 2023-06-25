package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o salário: ");
		double salario = leitor.nextDouble();

		double percentualAumento;

		if (salario <= 280.0) {
			percentualAumento = 20;
		} else if (salario <= 700) {
			percentualAumento = 15;
		} else if (salario <= 1500) {
			percentualAumento = 10;
		} else {
			percentualAumento = 5;
		}

		double valorAumento = salario * (percentualAumento / 100);

		double novoSalario = salario + valorAumento;

		System.out.println("O salário antes do reajuste: R$" + salario);
		System.out.println("O percentual de aumento aplicado: " + percentualAumento + "%");
		System.out.println("O valor do aumento: R$" + valorAumento);
		System.out.println("O novo salário após o aumento: R$" + novoSalario);

	}

}

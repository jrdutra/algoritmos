package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o salário: ");
		double salario = leitor.nextDouble();

		double percentualAumeto;

		if(salario <= 280.0) {
			percentualAumeto = 20;
		}else if(salario <= 700.0) {
			percentualAumeto = 15;
		}else if(salario <= 1500.0) {
			percentualAumeto = 10;
		}else {
			percentualAumeto = 5;
		}

		double valorAumento = salario * (percentualAumeto / 100);

		double novoSalario = salario + valorAumento;

		System.out.println("O salário antes do reajuste: R$" + salario);
		System.out.println("O percentual de aumento aplicado: " + percentualAumeto + "%");
		System.out.println("O valor do aumento: R$" + valorAumento);
		System.out.println("O novo salário, após o aumento: R$" + novoSalario);

	}

}

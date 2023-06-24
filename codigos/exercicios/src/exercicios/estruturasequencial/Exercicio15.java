package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double valorHora = leitor.nextDouble();
		System.out.println("Qual número de horas trabalhadas no mês?");
		double qtdHoras = leitor.nextDouble();

		double salarioBruto = valorHora * qtdHoras;

		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;

		double descontos = ir + inss + sindicato;

		double salarioLiquido = salarioBruto - descontos;

		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("Desconto IR: R$" + ir);
		System.out.println("Desconto inss: R$" + inss);
		System.out.println("Desconto sindicato: R$" + sindicato);
		System.out.println("Salario Líquido: R$" + salarioLiquido);
	}

}

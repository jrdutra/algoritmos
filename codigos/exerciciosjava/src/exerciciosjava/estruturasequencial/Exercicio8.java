package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora?");
		double ganhoHora = leitor.nextDouble();

		double ganhoDia = ganhoHora * 8;

		double ganhoSemana = ganhoDia * 5;

		double ganhoMes = ganhoSemana * 4;

		System.out.println("O seu salário no mês é:");
		System.out.println(ganhoMes);
	}

}

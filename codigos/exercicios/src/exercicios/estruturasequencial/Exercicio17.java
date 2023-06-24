package exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o tamanho do arquivo para download(em MB): ");
		double tamanhoArquivo = leitor.nextDouble();

		System.out.println("Informe a velocidade de download(em MB/s): ");
		double velocidadeDownload = leitor.nextDouble();

		double tempoSegundos = tamanhoArquivo / velocidadeDownload;
		double tempoMinutos = tempoSegundos / 60;

		System.out.println("O tempo de download em minutos é: " + tempoMinutos);
	}

}

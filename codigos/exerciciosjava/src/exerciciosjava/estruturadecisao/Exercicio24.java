package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o número 1");
		int numero1 = leitor.nextInt();

		System.out.println("Informe o número 2");
		int numero2 = leitor.nextInt();

		System.out.println("Informe o número 3");
		int numero3 = leitor.nextInt();

		int maiorNumero;
		int menorNumero;

		if(numero1 > numero2){
			maiorNumero = numero1;
			menorNumero = numero2;
		}else {
			maiorNumero = numero2;
			menorNumero = numero1;
		}

		if(maiorNumero < numero3) {
			maiorNumero = numero3;
		}

		if(menorNumero > numero3) {
			menorNumero = numero3;
		}

		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("O menor número é: " + menorNumero);

	}

}

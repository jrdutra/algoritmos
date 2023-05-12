package fundamentacaoteorica;

import java.util.Scanner;

public class InstrucaoLer {

	public static void main(Strings[] args) {
		System.out.println("Informe um número:");
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		System.out.println("O número informado é:");
		System.out.println(a);
	}

}

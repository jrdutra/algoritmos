package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe uma letra");
		char letra = leitor.next().charAt(0);

		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("É uma vogal");
		}else {
			System.out.println("É uma consoante");
		}

	}

}

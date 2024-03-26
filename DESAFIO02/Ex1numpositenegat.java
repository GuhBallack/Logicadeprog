package DESAFIO02;

import java.util.Scanner;

public class Ex1numpositenegat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado: ");
		
		int numero = scanner.nextInt();
		
		if ( numero > 0 ) {
			System.out.println("POSITIVO");
		}
		
		else if (numero < 0 ) {
			System.out.println("NEGATIVO");
		}
		
		else if (numero == 0 ) {
			System.out.println("0");

		}

	}

}

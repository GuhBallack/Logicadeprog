package DESAFIO02;

import java.util.Scanner;

public class Ex2parouimpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado: ");
		
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0 ) { 
		System.out.println("Numero é par");
		
	}
		else {
			System.out.println("Numero é impar");
			
			}
		
	}

}

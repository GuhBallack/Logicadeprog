package DESAFIO02;

import java.util.Scanner;

public class Ex4NumFatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero Positivo: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		int fatorial = numero;
		int ref = numero;
		
		if (numero < 0) {
			System.out.println("Numero não pode ser negativo");
			
		}
		else {
				while (numero > 1) {
					fatorial = fatorial * (numero - 1);
					numero--;
					
				}
				
				System.out.println("O fatorial de " + ref +": " + fatorial);
	}

	}
}

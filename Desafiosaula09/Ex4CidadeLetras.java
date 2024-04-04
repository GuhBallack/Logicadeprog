package Desafiosaula09;

import java.util.Scanner;

public class Ex4CidadeLetras {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da Cidade: ");
		String Cidade = scanner.nextLine();
		
		if(Cidade.equalsIgnoreCase("Curitiba")) {
			System.out.println("Cidade é Curitiba");
			
		} else {
			System.out.println("Cidade não é Curitiba");
			
		}

	}

}
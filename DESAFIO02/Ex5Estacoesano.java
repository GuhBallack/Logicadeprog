package DESAFIO02;

import java.util.Scanner;

public class Ex5Estacoesano {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite um numero de 1 a 12: ");
			int numero = scanner.nextInt();
			scanner.nextLine();
			
			String estacao;
			
			switch(numero) {
			
				case 1:
					estacao = "Janeiro - Verão";
					break;
					
				case 2:
					estacao = "Fevereiro - Verão";
					break;
					
				case 3:
					estacao = "Março - Verão, Outono";
					break;
					
				case 4:
					estacao = "Abril - Outono";
					break;
				
				case 5:
					estacao = "Maio - Outono";
					break;
					
				case 6:
					estacao = "Junho - Outono, Inverno";
					break;
					
				case 7:
					estacao = "Julho - Inverno";
					break;
				case 8:
					estacao = "Agosto - Inverno";
					break;
					
				case 9:
					estacao = "Setembro - Inverno, Primavera";
					break;
				
				case 10:
					estacao = "Outubro - Primavera";
					break;
					
				case 11:
					estacao = "Novembro - Primavera";
					break;
					
				case 12:
					estacao = "Dezembro - Primavera, Verão";
					break;
			
				default:
					estacao = "Não corresponde a um mês";
				
			};
			
			System.out.println("O mês e a estação são: " + estacao);
		}
	}
}


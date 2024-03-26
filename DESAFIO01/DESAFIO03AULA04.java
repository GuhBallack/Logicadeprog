package DESAFIO01;

import java.util.Scanner;

public class DESAFIO03AULA04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double Num1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite o segundo numero: ");
		double Num2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Escolha a operação: [+] [-] [*] [/]: ");
		String operacao = scanner.nextLine();
		
		var resultado = switch(operacao) {
		case "+" -> Num1 + Num2;
		case "-" -> Num1 - Num2;
		case "*" -> Num1 * Num2;
		case "/" -> Num1 / Num2;
		default -> "Erro";
		
		};
		
		if (resultado == "Erro") {
			System.out.println("Operação Invalida");
			
		}
		else {
			System.out.println("Resultado da operação: " + resultado);
		}
	}

}

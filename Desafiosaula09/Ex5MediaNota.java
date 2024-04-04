package Desafiosaula09;

import java.util.Scanner;

public class Ex5MediaNota {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a primeira Nota: ");
		double input1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Informe a segundaa Nota: ");
		double input2 = scanner.nextDouble();
		scanner.nextLine();

		String nota1 = String.format ("Nota 1 Bimestre: %.2f", input1);
		String nota2 = String.format ("Nota 2 Bimestre: %.2f", input2);
		String MediaNota = String.format("Média da Nota = %.2f", (input1+input2) / 2);
		
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(MediaNota);
		
	}

}

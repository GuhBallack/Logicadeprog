package Desafiosaula09;

import java.util.Scanner;

public class Ex6TresStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite as 3 Palavras: ");
		String palavras = scanner.nextLine();
		
		String[] ps = palavras.split(",");
		String PalavraMaior = ps[0];
		
		for(String p : ps) {
			if(p.length() > PalavraMaior.length()) {
				PalavraMaior = p;
				
			}
		}
		
		System.out.println("A maior palavra é: " + PalavraMaior);

	}

}

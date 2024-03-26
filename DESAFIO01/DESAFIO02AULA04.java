package DESAFIO01;
import java.util.Scanner;

public class DESAFIO02AULA04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura em metros: ");
		
		int altura = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite seu sexo F ou M: ");
		String sexo = scanner.nextLine();
		
		double peso_ideal = switch (sexo) {
		case "M" -> (72.7 * altura) - 58;
		case "F" -> (62.1 * altura) - 44.7;
		default -> 0;
	
		};
		
		if (peso_ideal == 0) {
			System.out.println("Sexo não reconhecido");
		}
		
		else {
			System.out.println("Peso ideal é de: " + peso_ideal);
		}
		
	}

}

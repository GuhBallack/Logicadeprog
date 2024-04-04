package Desafiosaula10;

public class Ex1CincoElementos {

	public static void main(String[] args) {
		
		int[] numeros = { 3, 13, 25, 45, 63 };
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			
		}

		System.out.print("O resultado é: " + soma);
	}

}

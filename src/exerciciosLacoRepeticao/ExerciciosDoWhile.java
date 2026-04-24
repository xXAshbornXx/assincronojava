package exerciciosLacoRepeticao;

import java.util.Scanner;

public class ExerciciosDoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int somaPositivos = 0;

		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
	}
}

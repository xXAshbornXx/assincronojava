package exerciciosVetores;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {

		boolean encontrado = false;
		int val;
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);
		System.out.print("Entre com o número que você deseja encontrar: ");
		val = leia.nextInt();

		for (int cont = 0; cont < 10; cont++) {
			if (val == vetorNumeros[cont]) {
				System.out.print("O número " + val + " está localizado na posição: " + cont);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("O número " + val + " não foi encontrado!");
		}
	}
}

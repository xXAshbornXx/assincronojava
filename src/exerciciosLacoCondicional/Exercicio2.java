package exerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("O numéro " + num + " é Par e Positivo.");
		} else if (num < 0 && num % 2 == 0) {
			System.out.println("O numéro " + num + " é Par e Negativo.");
			} else if (num < 0 && num % 2 != 0) {
				System.out.println("O numéro " + num + " é Ímpar e Negativo.");
				} else if (num > 0 && num != 0) {
					System.out.println("O número " + num + " é Ímpar e Positivo");
				}
	}
}

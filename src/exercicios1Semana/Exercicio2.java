package exercicios1Semana;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// Declarando Variaveis
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, mf;
		
		// Entrada de Dados
		System.out.print("Entre com a nota 1: ");
		n1 = leia.nextFloat();
		System.out.print("Entre com a nota 2: ");
		n2 = leia.nextFloat();
		System.out.print("Entre com a nota 3: ");
		n3 = leia.nextFloat();
		System.out.print("Entre com a nota 4: ");
		n4 = leia.nextFloat();
		
		// Processamento
		mf = (n1 + n2 + n3 + n4) / 4;
		
		// Saída de Dados
		System.out.print("Olá, a sua média final é: " + mf + ".");
		

	}

}

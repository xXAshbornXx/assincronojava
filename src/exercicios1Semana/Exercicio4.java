package exercicios1Semana;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Declaração variavel
		Scanner leia = new Scanner(System.in);
		float dif, n1, n2, n3, n4;
		
		// Entrada de Dados
		System.out.print("Entre com o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.print("Entre com o segundo número: ");
		n2 = leia.nextFloat();
		System.out.print("Entre com o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.print("Entre com o quarto número: ");
		n4 = leia.nextFloat();
		
		// Processamento
		dif = (n1 * n2) - (n3  * n4);
		
		// Saída
	System.out.print("A diferença entre os produtos é: " + dif + ".");

	}

}

package exercicios1Semana;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Declarando as Variaveis
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosal;
		
		// Entrada de Dados
		System.out.print("Entre com o seu salário: ");
		salario = leia.nextFloat();
		System.out.print("Entre com o valor do abono: ");
		abono = leia.nextFloat();
		
		// Processamento
		novosal = salario + abono;
		
		// Saída de Dados
		System.out.println("Olá, o seu novo salário é: " + novosal + ".");
		
	}



}

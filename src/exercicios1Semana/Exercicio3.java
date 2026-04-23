package exercicios1Semana;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// Declaração de Var
		Scanner leia = new Scanner(System.in);
		float sb, an, he, desc, sl;
		
		// Entrada de Dados
		System.out.print("Entre com o seu salário base: ");
		sb = leia.nextFloat();
		System.out.print("Entre com o seu adicional noturno: ");
		an = leia.nextFloat();
		System.out.print("Entre com as horas extra: ");
		he = leia.nextFloat();
		System.out.print("Entre com os seus descontos: ");
		desc = leia.nextFloat();
		
		// Processamento
		sl = sb + an + (he * 5) - desc;
		
		//Saída
		
		System.out.print("O seu salário líquido é R$ " + sl + " .");

	}

}

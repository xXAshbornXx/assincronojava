package exerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int numa, numb, numc, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		numa = leia.nextInt();
		System.out.print("Digite o número B: ");
		numb = leia.nextInt();
		System.out.print("Digite o número C: ");
		numc = leia.nextInt();
		
		soma = (numa + numb);
		
		if (soma > numc) {
			System.out.println("A Soma de A + B é Maior que C.");
		} else if (soma == numc) {
			System.out.println("A Soma de A + B é Igual a C.");
		} else {
			System.out.println("A Soma de A + B é Menor que C");
		
		}	
		
	}

}

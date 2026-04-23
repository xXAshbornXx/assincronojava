package exerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		
				Scanner leia = new Scanner(System.in);
				
				String nome;
				int idade;
				boolean primeiraDoacao;
				
				System.out.print("Digite o Nome do doador: ");
				nome = leia.nextLine();
				
				System.out.print("Digite a Idade do doador: ");
				idade = leia.nextInt();
				
				System.out.print("Primeira doação de sangue? (true/false): ");
				primeiraDoacao = leia.nextBoolean();
				
				
				if (idade >= 18 && idade < 60) {
					System.out.println(nome + " está apto(a) para doar sangue!");
					
				} else if (idade >= 60 && idade <= 69) {
					if (primeiraDoacao) {
						System.out.println(nome + " não está apto(a) para doar sangue!");
					} else {
						System.out.println(nome + " está apto(a) para doar sangue!");
					}
					
				} else {
					System.out.println(nome + " não está apto(a) para doar sangue!");

	}
	}
}

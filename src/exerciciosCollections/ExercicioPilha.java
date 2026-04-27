package exerciciosCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioPilha {

	public static void main(String[] args) {

		int opt;
		Deque<String> bibli = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n================ MENU ================");
			System.out.println("1- Adicionar Livro na pilha");
			System.out.println("2- Listar todos os Livros");
			System.out.println("3- Retirar Livro da pilha");
			System.out.println("0- Sair");
			System.out.print("\nEntre com a opção desejada: ");

			opt = Integer.parseInt(leia.nextLine());

			switch (opt) {
			case 1:
				System.out.print("\nDigite o nome do Livro: ");
				String nome = leia.nextLine();
				bibli.push(nome);
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				if (bibli.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha: " + bibli);
				}
				break;
			case 3:
				if (bibli.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nO Livro " + bibli.pop() + " foi retirado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida!");
			}

		} while (opt != 0);
	}

}

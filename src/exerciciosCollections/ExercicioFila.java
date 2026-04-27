package exerciciosCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		int opt;
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n================ MENU ================");
			System.out.println("1- Adicionar Cliente na Fila");
			System.out.println("2- Listar Todos os Clientes");
			System.out.println("3- Retirar Cliente da Fila");
			System.out.println("0- Sair");
			System.out.print("\nEntre com a opção desejada: ");

			opt = Integer.parseInt(leia.nextLine());

			switch (opt) {
			case 1:
				System.out.print("\nDigite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\nLista de Clientes na Fila: " + fila);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\nO Cliente " + fila.poll() + " foi retirado!");
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

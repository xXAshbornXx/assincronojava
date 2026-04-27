package exerciciosCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<Integer>();

        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros.add(leia.nextInt());
        }

        Iterator<Integer> inum = numeros.iterator();

        System.out.println("\nListar dados do Set:");
        while (inum.hasNext()) {
            System.out.println(inum.next());
        }

	}

}

package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioList {

	public static void main(String[] args) {
	
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
		System.out.print("Digite a " + (i+1) + "° cor: ");
		String color = leia.nextLine();
		cores.add(color); 
		}
		System.out.println("\nListar todas as cores:");
        for (String c : cores) {
            System.out.println(c);
        }

        Collections.sort(cores);
        
        System.out.println("\nOrdenar as cores:");
        for (String c : cores) {
            System.out.println(c);
        }
	}

}

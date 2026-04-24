package exerciciosLacoRepeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int num, contpar = 0, contimp = 0;
		 int i = 1;
				  
		 while (i <= 10) {
			 System.out.print("Digite a " + i + "° número: ");
			  num = leia.nextInt();
			  i++;
		  if (num % 2 == 0 ) {
			 contpar++;
		 } else {
				 contimp++;
			;	
		 }	 
		 } 
		 System.out.println("Total de números pares: " + contpar + "." );
		 System.out.println("Total de números ímpares: " + contimp + "." );
	}
}

		



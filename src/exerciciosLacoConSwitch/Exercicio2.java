package exerciciosLacoConSwitch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	    String nome, cargoNome = "";
	    int cargoCodigo;
	    float salario, reajuste = 0, novoSalario;

	    System.out.print("Nome do colaborador: ");
	    nome = leia.nextLine();

	    System.out.print("Cargo (1 a 6): ");
	    cargoCodigo = leia.nextInt();

	    System.out.print("Salário: ");
	    salario = leia.nextFloat();

	    switch (cargoCodigo) {
	        case 1:
	            cargoNome = "Gerente";
	            reajuste = 0.10f;
	            break;
	        case 2:
	            cargoNome = "Vendedor";
	            reajuste = 0.07f;
	            break;
	        case 3:
	            cargoNome = "Supervisor";
	            reajuste = 0.09f;
	            break;
	        case 4:
	            cargoNome = "Motorista";
	            reajuste = 0.06f;
	            break;
	        case 5:
	            cargoNome = "Estoquista";
	            reajuste = 0.05f;
	            break;
	        case 6:
	            cargoNome = "Técnico de TI";
	            reajuste = 0.08f;
	            break;
	        default:
	            System.out.println("Cargo inválido!");
	    }

	    if (cargoCodigo >= 1 && cargoCodigo <= 6) {
	        novoSalario = salario + (reajuste * salario);

	        System.out.println("\nNome do colaborador: " + nome);
	        System.out.println("Cargo: " + cargoNome);
	        System.out.printf("Salário: R$ %.2f", novoSalario);
	    }

	}

}

package exerciciosLacoConSwitch;

import java.util.Scanner;

public class Exercicio1 {

		public static void main(String[] args) {
		    Scanner leia = new Scanner(System.in);
		    
		    int codigo, quantidade;
		    float preco = 0, valorTotal;
		    String produto = "";
		    
		    System.out.print("Código do Produto (1 a 6): ");
		    codigo = leia.nextInt();
		    
		    System.out.print("Quantidade: ");
		    quantidade = leia.nextInt();
		    
		    switch (codigo) {
		        case 1:
		            produto = "Cachorro Quente";
		            preco = 10.00f;
		            break;
		        case 2:
		            produto = "X-Salada";
		            preco = 15.00f;
		            break;
		        case 3:
		            produto = "X-Bacon";
		            preco = 18.00f;
		            break;
		        case 4:
		            produto = "Bauru";
		            preco = 12.00f;
		            break;
		        case 5:
		            produto = "Refrigerante";
		            preco = 8.00f;
		            break;
		        case 6:
		            produto = "Suco de laranja";
		            preco = 13.00f;
		            break;
		        default:
		            System.out.println("Código inválido!");
		    }
		    
		    if (codigo >= 1 && codigo <= 6) {
		        valorTotal = quantidade * preco;
		        System.out.println("\nProduto: " + produto);
		        System.out.printf("Valor total: R$ %.2f", valorTotal);
		    }

	}

}

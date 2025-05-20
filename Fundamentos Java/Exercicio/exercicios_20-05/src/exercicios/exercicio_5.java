package exercicios;


import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis
		double valorProduto, valorFinal = 0;
		int codPagmento;
		

		// Entrada de dados
		System.out.println("Tipo de pagamento;\n"+" 1 - À vista em dinheiro ou cheque \n"+" 2 - À vista no cartão de crédito \n" + " 3 - 2 x \n" + " 4 - 3 x\n");
		System.out.print("Qual o codígo da forma de pagamento ? ");
		codPagmento = sc.nextInt();

		System.out.print("Qual o valor do produto ? ");
		valorProduto = sc.nextDouble();

		// testar cargo e aplicar cálculos para o valor novo do produto
		switch (codPagmento) {
		case 1:
			valorFinal = valorProduto - (valorProduto * 0.10);
			break;
			
		case 2:
			valorFinal = valorProduto - (valorProduto * 0.15);
			break;
			
		case 3:
			valorFinal = valorProduto ;
			break;
			
		case 4:
			valorFinal = valorProduto - (valorProduto * 1.10);
			break;
			
		default: System.out.println("Valor fora dos padrões! Programa Cancelado!!");
				 System.exit(0);
		
		}
		
		//imprimir valor produto  e o valor a ser pago baseado no metodo de pagamento 
		System.out.println("Valor produto.....: "+valorProduto);
		System.out.println("Valor a ser pago..: "+valorFinal);
		System.out.println("** Obrigado por usar nosso programa. Tchau !!");
		
		
		sc.close();

	}

}

package exercicios;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 4. Calcular o aumento de salário de acordo com o cargo. Ler salário e o
		 * código do cargo. Calcular o aumento salarial de acordo com o cargo da pessoa
		 * conforme a tabela abaixo. Imprimir o nome do cargo, o valor do aumento e o
		 * novo salário.
		 */

		// Declaração de variáveis
		double salarioPessoa, salarioNovo = 0, valorAumento = 0;
		int cargoPessoa;
		String descCargo = "";

		// Entrada de dados
		System.out.println("Cargo\n"+" 1 - Serviços Gerais \n"+" 2 - Vigia \n" + " 3 - Recepcionista \n" + " 4 - Vendedor\n");
		System.out.print("Qual o codígo do cargo ? ");
		cargoPessoa = sc.nextInt();

		System.out.print("Qual o salário atual ? ");
		salarioPessoa = sc.nextDouble();

		// testar cargo e aplicar cálculos para o novo salário
		switch (cargoPessoa) {
		case 1:
			valorAumento = salarioPessoa * 0.50;
			descCargo = "Serviços Gerais";
			break;
			
		case 2:
			valorAumento = salarioPessoa * 0.30;
			descCargo = "Vigia";
			break;
			
		case 3:
			valorAumento = salarioPessoa * 0.25;
			descCargo = "Recepcionista";
			break;
			
		case 4:
			valorAumento = salarioPessoa * 0.15;
			descCargo = "Vendedor";
			break;

		}
		salarioNovo = salarioPessoa + valorAumento;
		//imprimir cargo, valor abono e salárial novo
		System.out.println("Cargo.........: "+descCargo);
		System.out.println("Valor Bonus...: "+valorAumento);
		System.out.println("Novo salário..: "+salarioNovo);
		
		
		sc.close();

	}

}

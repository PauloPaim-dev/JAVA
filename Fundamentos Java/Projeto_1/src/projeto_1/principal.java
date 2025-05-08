package projeto_1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primeiro programa em Java");
		//declaração de variavel
		String nomePessoa;
		int idadePessoa;
		float horasTrabalhadas, valorHora;
		double salarioTotal;
		boolean demitido = false;
		
		/*entrada de dados
		 * usando scanner pela primeira vez
		 */
		Scanner sc = new Scanner(System.in);
		//println: mostra a expressão e pula linha
		System.out.print("Informe seu nome: ");
		/*next(): se limita a 1 palavra
		 * nomePessoa = sc.next();
		 */
		//nextLine(): Aceita Espaçamento entre as palavras e uma quantidade de caracter maior
		nomePessoa = sc.nextLine();
		//replicando conhecimento com a entrada de um inteiro e concatenando com informações coletadas anteriomente
		System.out.print(nomePessoa+ " qual a sua idade: ");
		idadePessoa = sc.nextInt();
		System.out.print("Quantas horas trabalhadas: ");
		horasTrabalhadas = sc.nextFloat();
		System.out.print(nomePessoa+" quanto você ganha por hora: ");
		valorHora = sc.nextFloat();
	
		
		
		//processamento
		salarioTotal = valorHora * horasTrabalhadas;
		
		
		
		//saida de dados
		System.out.println("Seu nome é "+nomePessoa);
		System.out.println(nomePessoa+" sua idade é "+idadePessoa+ " anos");
		System.out.println(nomePessoa+" horas trabalhadas "+horasTrabalhadas+ "h");
		System.out.println("Você receberá R$ "+salarioTotal);
				
		//fechamento do sr com o sc.close()
		sc.close();

	}

}

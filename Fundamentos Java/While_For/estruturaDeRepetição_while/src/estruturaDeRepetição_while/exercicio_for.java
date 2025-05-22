package estruturaDeRepetição_while;

import java.util.Scanner;

public class exercicio_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, numAluno = 2;
		String nomeAluno = "";
		
		/*System.out.print("Qual o nome do aluno: ");
		nomeAluno = sc.next(); 
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble(); 
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a tereira nota: ");
		nota3 = sc.nextDouble();*/
		
		for (int contador = 1; contador <= numAluno; contador++) {
			System.out.print("Qual o nome do aluno: ");
			nomeAluno = sc.next(); 
			
			System.out.print("Digite a primeira nota: ");
			nota1 = sc.nextDouble(); 
			System.out.print("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			System.out.print("Digite a tereira nota: ");
			nota3 = sc.nextDouble();
				
			System.out.println("Aluno....:" +nomeAluno);
			System.out.println("Nota_1...:"+nota1);
			System.out.println("Nota_2....:"+nota2);
			System.out.println("Nota_3....:"+nota3);
		}
		System.out.println("Foram feitos 2 registros");
		System.out.println("Fim do programa");
				
		
		sc.close();
		

	}

}

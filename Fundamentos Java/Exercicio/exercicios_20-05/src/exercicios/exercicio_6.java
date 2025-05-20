package exercicios;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		/*
		 * **** Aprendizado do dia ***** 
		 * atalhos do Eclipse
		 * criação de variável genérica
		 * usando estrutura de repetição if com o switch, case
		*/
		Scanner sc = new Scanner(System.in);
		//declaração de variável 
		
		double notaInf1, notaInf2, notaInf3, mediaAluno;
		
		//entrada de dados
		System.out.println("Informe a nota 1: ");
		notaInf1 = sc.nextDouble();
		System.out.println("Informe a nota 2: ");
		notaInf2 = sc.nextDouble();
		System.out.println("Informe a nota 3: ");
		notaInf3 = sc.nextDouble();
		
		//procesamento
		mediaAluno = (notaInf1 + notaInf2 + notaInf3)/3;
		
		
		//criando variável genérica
		var conceitoAluno = 'A';
		
		
		//testando as condições
		if (mediaAluno >= 8) {
			conceitoAluno = 'A';
		}else if(mediaAluno >= 6.0 && mediaAluno <= 7.99){
			conceitoAluno = 'B';
		}else {
			conceitoAluno = 'C';
		}
		
		switch (conceitoAluno) {
		case 'A': 
			System.out.println("Aprovado");
			break;
			
		case 'B': 
			System.out.println("Aprovado");
			break;
		
		case 'C': 
			System.out.println("Aprovado");
			break;
		}
		sc.close();
	}

}

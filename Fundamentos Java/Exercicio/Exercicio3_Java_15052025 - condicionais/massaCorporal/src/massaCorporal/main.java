package massaCorporal;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// Exercício calculo de índice corporal
		// declaração de variaveis 
		double pesoPessoa, alturaPessoa, imcCalculo;
		Scanner sc = new Scanner(System.in);
		
		//Pede peso da pessoa
		System.out.print("Digite o seu peso: ");
		pesoPessoa = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		alturaPessoa = sc.nextDouble();
				
		//Calcula o IMC
		imcCalculo = pesoPessoa / (alturaPessoa * alturaPessoa);
		
		//testar o valor do IMC e mostrar a mensagem 
		System.out.printf("O IMC calculado foi: %.2f%n",imcCalculo );
		if (imcCalculo >= 16.0 && imcCalculo <= 15.9) {
			System.out.println("Muito abaixo do peso");
		} else if (imcCalculo >= 17.0 && imcCalculo <= 18.4){
			System.out.println("Abaixo do peso");
		} else if (imcCalculo >= 18.5 && imcCalculo <= 24.9){
			System.out.println("Peso normal");
		} else if (imcCalculo >= 25.0 && imcCalculo <= 29.9){
			System.out.println("Acima do peso");
		} else if (imcCalculo >= 30.0 && imcCalculo <= 34.9){
			System.out.println("Obesidade grau I");
		} else if (imcCalculo >= 35.0 && imcCalculo <= 40.0){
			System.out.println("Obesidade grau II");
		} else if (imcCalculo > 40.0){
			System.out.println("Obesidade grau III");
		} else {
			System.out.println(" Valor invalido!");
		}
		
		sc.close();
	}

}

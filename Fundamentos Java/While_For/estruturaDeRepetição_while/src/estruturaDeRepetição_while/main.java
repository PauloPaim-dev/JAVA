package estruturaDeRepetição_while;

public class main {

	public static void main(String[] args) {
		
		
		int contaVezes = 1, somaValor = 0;
		
		while (contaVezes <= 100000000) {
			somaValor = somaValor + 1;
			contaVezes ++;
		}
		System.out.println("O valor total é "+somaValor );
	}

}

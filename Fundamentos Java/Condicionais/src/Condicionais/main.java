package Condicionais;

//importando a biblioteca "javax.swing.JOptionPane;" para implementação de recurso gráfico.
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
				
		int idadePessoa;
				
		//entrada de dados atraves de uma tela
		idadePessoa =  Integer.parseInt(JOptionPane.showInputDialog("Informe  sua idade: "));
		//processamento de dados
		if (idadePessoa >= 18) {
			JOptionPane.showMessageDialog(null, "Entrada liberada!");//saída de dados
					
		}
		else {
			JOptionPane.showMessageDialog(null, "Entrada não liberada!");//saída de dados
		}
		

	}

}

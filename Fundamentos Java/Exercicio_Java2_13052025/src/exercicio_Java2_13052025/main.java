package exercicio_Java2_13052025;

import java.util.OptionalInt;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		 
		int idadePessoa;
		//entrada de dados 
		idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: ")); 
		
		//teste de condições
		if(idadePessoa <= 16) {
			JOptionPane.showMessageDialog(null, "Eleitor não obrigatorio");
		} else if (idadePessoa >= 18 && idadePessoa <= 65 ) {
			JOptionPane.showMessageDialog(null, "Eleitor obrigatório ");
		} else {
			JOptionPane.showMessageDialog(null, "Eleitor facultativo ");
		}
		

	}

}

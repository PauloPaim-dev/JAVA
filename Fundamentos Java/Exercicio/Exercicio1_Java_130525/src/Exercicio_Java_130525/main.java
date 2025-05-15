package Exercicio_Java_130525;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int idadePessoa;
		String nomePessoa;

		nomePessoa = JOptionPane.showInputDialog("Qual a seu nome: ");
		idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(nomePessoa + " qual a sua idade: "));

		if (idadePessoa < 18) {
			JOptionPane.showConfirmDialog(null, "Menor idade!");
		} else if (idadePessoa >= 18 && idadePessoa <= 64) {
			JOptionPane.showConfirmDialog(null, "Maior idade!");
		} else {
			JOptionPane.showConfirmDialog(null, " Idoso!");
		}

	}

}

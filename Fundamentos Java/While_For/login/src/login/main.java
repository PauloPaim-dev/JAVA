package login;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuarioCorreto = "admin";
		String senhaCorreta = "1234";

		System.out.print("Usuário.: ");
		String usuarioDigitado = sc.next();
		System.out.println();
		System.out.print("Senha...: ");
		String senhaDigitada = sc.next();

		
		// uso do equals para comparação entre strings e equalsIgnoreCase para ignorar letras maiúsculas 
		if (usuarioDigitado.equalsIgnoreCase(usuarioCorreto) && senhaDigitada.equals(senhaDigitada)) {
			System.out.println("Login efetuado com sucesso");
		} else {
			System.out.println("Credenciais inválidas. Verifique");
		}

		System.out.println("Programa finalizado");
		sc.close();
	}
}

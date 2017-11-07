package entidades;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Agenda agenda = new Agenda();
		String operacao = new String();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(menu.listaOperacoes());
			operacao = input.nextLine();
			switch(operacao) {
			case "C":
				System.out.print(menu.posicao());
				int pos = input.nextInt();
				System.out.print(menu.nome());
				String nome = input.nextLine();
				System.out.print(menu.sobrenome());
				String sobrenome = input.nextLine();
				System.out.print(menu.telefone());
				String telefone = input.nextLine();
				agenda.cadastraContato(nome, sobrenome, pos, telefone);
			case "L":
				agenda.listaContatos();
			}
		} while (!operacao.equals("S"));
	
		input.close();
	}
}

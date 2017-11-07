package entidades;

public class Main {

	static Menu menu = new Menu();
	static Agenda agenda = new Agenda();

	public static void main(String[] args) {

		String operacao = new String();
		do {
			System.out.print(menu.listaOperacoes());
			operacao = Util.leString();
			switch (operacao) {
			case "C":
				cadastro();
				break;

			case "L":
				System.out.println(agenda.listaContatos());
				break;

			case "E":
				int pos = Util.leInt();
				System.out.println(agenda.pesquisaContato(pos));
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA!" + Util.NL);
				break;
			}
		} while (!operacao.equals("S"));
	}

	private static void cadastro() {
		System.out.print(menu.posicao());
		int pos = Util.leInt();
		Util.leString();

		System.out.print(menu.nome());
		String nome = Util.leString();

		System.out.print(menu.sobrenome());
		String sobrenome = Util.leString();

		System.out.print(menu.telefone());
		String telefone = Util.leString();

		agenda.cadastraContato(nome, sobrenome, pos, telefone);
	}
}

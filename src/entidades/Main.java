package entidades;

/**
 * Classe principal do sistema
 * 
 * Lab03 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
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
				if (pos >= 1 || pos <= 100) {
					if (agenda.contatoExiste(pos)) {
						System.out.println(agenda.pesquisaContato(pos));
					} else {
						System.out.println("Contato não existe!");
					}
				} else {
					System.out.println("Posição Inválida!");
				}
				break;

			default:
				if (!operacao.equals("S")) {
					System.out.println("OPÇÃO INVÁLIDA!" + Util.NL);
				}
				break;
			}
		} while (!operacao.equals("S"));
	}

	/**
	 * Lê os dados de entrada, cria e cadastra um contato na agenda a partir deles,
	 * caso sejam válidos.
	 */
	private static void cadastro() {
		System.out.print(menu.posicao());
		int pos = Util.leInt();

		System.out.print(menu.nome());
		String nome = Util.leString();

		System.out.print(menu.sobrenome());
		String sobrenome = Util.leString();

		System.out.print(menu.telefone());
		String telefone = Util.leString();

		try {
			System.out.println(agenda.cadastraContato(nome, sobrenome, pos, telefone));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

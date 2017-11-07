package entidades;

public class Menu {

	public String listaOperacoes() {
		return "(C)adastrar Contato" + Util.NL + "(L)istar Contatos" + Util.NL + "(E)xibir Contato" + Util.NL + "(S)air"
				+ Util.NL + Util.NL + "Opção> ";
	}

	public String posicao() {
		return "Posição: ";
	}

	public String nome() {
		return "Nome: ";
	}

	public String sobrenome() {
		return "Sobrenome: ";
	}

	public String telefone() {
		return "Telefone: ";
	}

}

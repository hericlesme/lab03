package entidades;

public class Menu {
	private final String NL = System.lineSeparator();
	
	public String listaOperacoes() {
		return "(C)adastrar Contato" + NL + "(L)istar Contatos" + NL + "(E)xibir Contato" + NL + "(S)air";
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

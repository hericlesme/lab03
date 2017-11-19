package entidades;

/**
 * Classe Menu do sistema
 * 
 * Lab03 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
public class Menu {

	/**
	 * Lista as possíveis operações a serem realizadas.
	 * 
	 * @return uma string com as operações.
	 */
	public String listaOperacoes() {
		return "(C)adastrar Contato" + Util.NL + "(L)istar Contatos" + Util.NL + "(E)xibir Contato" + Util.NL + "(S)air"
				+ Util.NL + Util.NL + "Opção> ";
	}

	/**
	 * Retorna uma String que precede a posição.
	 * 
	 * @return string "Posição: "
	 */
	public String posicao() {
		return "Posição: ";
	}

	/**
	 * Retorna uma String que precede o nome.
	 * 
	 * @return string "Nome: "
	 */
	public String nome() {
		return "Nome: ";
	}

	/**
	 * Retorna uma String que precede o sobrenome.
	 * 
	 * @return string "Sobrenome: "
	 */
	public String sobrenome() {
		return "Sobrenome: ";
	}

	/**
	 * Retorna uma String que precede o telefone.
	 * 
	 * @return string "Telefone: "
	 */
	public String telefone() {
		return "Telefone: ";
	}

}

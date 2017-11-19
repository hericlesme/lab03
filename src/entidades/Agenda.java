package entidades;

import java.util.Arrays;

/**
 * Representação de uma Agenda. A agenda pode ter até 100 objetos do tipo
 * Contato, podendo operar sobre eles.
 * 
 * @author Héricles Emanuel - 117110647
 */
public class Agenda {

	private Contato[] contatos = new Contato[100];

	/**
	 * Invoca o construtor de um Contato que o constrói a partir de seu nome,
	 * sobrenome e telefone. E o aloca a uma posição na agenda.
	 * 
	 * @param nome
	 *            O nome do contato.
	 * @param sobrenome
	 *            O sobrenome do contato.
	 * @param pos
	 *            A posição que o contato será alocado.
	 * @param telefone
	 *            O telefone do contato.
	 * @return uma string que confirma a realização do cadastro se possível.
	 */
	public String cadastraContato(String nome, String sobrenome, int pos, String telefone) {
		if (pos < 1 || pos > 100) {
			return ("Posição Inválida!");
		} else {
			contatos[pos - 1] = new Contato(nome, sobrenome, telefone);
			return ("Cadastro Realizado!" + Util.NL);
		}
	}

	/**
	 * Verifica se algum contato existem em determinada posição.
	 * 
	 * @param pos
	 *            A posição do contato a ser verificado.
	 * @return um boolean que indica se o contato existe ou não.
	 */
	public boolean contatoExiste(int pos) {
		if (this.contatos[pos - 1] != null) {
			return true;
		}
		return false;
	}

	/**
	 * Pesquisa um contato pela sua posição, e retorna sua representação em String.
	 * 
	 * @param pos
	 *            A posição do contato a ser pesquisado.
	 * @return a representação em string de um contato..
	 */
	public String pesquisaContato(int pos) {
		return contatos[pos - 1].toString();
	}

	/**
	 * Lista todos os contatos existentes na agenda, a representação segue o
	 * formato: Posição - Nome - Sobrenome.
	 * 
	 * @return uma string com todos os contatos existentes.
	 */
	public String listaContatos() {
		String listaDeContatos = new String();
		for (int i = 0; i < 100; i++) {
			if (contatoExiste(i + 1)) {
				listaDeContatos += (i + 1) + " - " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + Util.NL;
			}
		}
		return listaDeContatos;
	}

	/**
	 * Gera um inteiro que representa hashCode do objeto a partir de seu Array de
	 * contatos.
	 *
	 * @return o inteiro representando o hashCode do objeto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contatos);
		return result;
	}

	/**
	 * Metodo equals, que compara o objeto com outro a partir de seu Array de
	 * contatos.
	 * 
	 * @param obj
	 *            Objeto a ser comparado.
	 * @return um valor booleano que indica se os objetos tem o mesmo Array de
	 *         contatos.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contatos, other.contatos))
			return false;
		return true;
	}

}

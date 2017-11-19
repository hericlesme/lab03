package entidades;

/**
 * Representação de um Contato. O Contato pode ter um nome, sobrenome, e um
 * telefone.
 * 
 * @author Héricles Emanuel - 117110647
 */
public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	/**
	 * Constrói um Contato a partir de seu nome, sobrenome e telefone.
	 * 
	 * @param nome
	 *            O nome do contato.
	 * @param sobrenome
	 *            O sobrenome do contato.
	 * @param telefone
	 *            O telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {

		if (nome == null || sobrenome == null) {
			throw new NullPointerException("Nome Inválido!");
		}

		if (nome.trim().equals("") || sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("Nome Inválido!");
		}

		if (telefone == null) {
			throw new NullPointerException("Telefone Nulo!");
		}

		if (telefone.trim().equals("")) {
			throw new IllegalArgumentException("Telefone Inválido!");
		}

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	/**
	 * Gera um inteiro que representa hashCode do objeto a partir de seu nome.
	 *
	 * @return o inteiro representando o hashCode do objeto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/**
	 * Metodo equals, que compara o objeto com outro a partir de seu nome.
	 * 
	 * @param obj
	 *            Objeto a ser comparado.
	 * @return um valor booleano que indica se os objetos tem o mesmo nome ou não.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	/**
	 * Retorna a String que representa o Contato. A representação segue o formato:
	 * “Nome do contato - Sobrenome do contato - Número de telefone”.
	 *
	 * @return a representação em String de um Contato.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}

	/**
	 * Método get para o nome do contato
	 * 
	 * @return String que representa o nome do contato.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método get para o sobrenome do contato
	 * 
	 * @return String que representa o sobrenome do contato.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

}

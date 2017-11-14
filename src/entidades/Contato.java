package entidades;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

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

	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}

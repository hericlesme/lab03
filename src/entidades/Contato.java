package entidades;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato(String nome, String sobrenome, String telefone) {

		if (nome == null || sobrenome == null || nome.trim().equals("") || sobrenome.trim().equals("")) {
			throw new NullPointerException("Nome Inválido!");
		}

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
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

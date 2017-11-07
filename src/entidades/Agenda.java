package entidades;

public class Agenda {
	private Contato[] contatos = new Contato[100];
	private final String NL = System.lineSeparator();

	public void cadastraContato(String nome, String sobrenome, int pos, String telefone) {
		contatos[pos - 1] = new Contato(nome, sobrenome, telefone);
	}

	public String pesquisaContato(int pos) {
		return contatos[pos - 1].toString();
	}

	public String listaContatos() {
		String listaDeContatos = new String();
		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				listaDeContatos += (i + 1) + " - " + contatos[i].getNome() + contatos[i].getSobrenome() + NL;
			}
		}
		return listaDeContatos;
	}
}

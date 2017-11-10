package entidades;

public class Agenda {

	private Contato[] contatos = new Contato[100];

	public String cadastraContato(String nome, String sobrenome, int pos, String telefone){
		if (indiceValido(pos)) {
			contatos[pos - 1] = new Contato(nome, sobrenome, telefone);
			return ("Cadastro Realizado!" + Util.NL);
		} else {
			throw new NullPointerException("Posição Inválida!");
		}

	}

	private boolean indiceValido(int pos) {
		return !(pos < 1 || pos > 100);
	}

	public String pesquisaContato(int pos) throws Exception {

		if (indiceValido(pos)) {
			if (contatos[pos - 1] != null) {
				return contatos[pos - 1].toString();
			}
			return "Contato não existe!";
		} else {
			throw new NullPointerException("Posição Inválida!");
		}
	}

	public String listaContatos() {
		String listaDeContatos = new String();
		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				listaDeContatos += (i + 1) + " - " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + Util.NL;
			}
		}
		return listaDeContatos;
	}

}

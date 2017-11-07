package entidades;

public class Agenda {

	private Contato[] contatos = new Contato[100];

	public void cadastraContato(String nome, String sobrenome, int pos, String telefone) {
		if (indiceValido(pos)) {
			contatos[pos - 1] = new Contato(nome, sobrenome, telefone);
			System.out.println("CADASTRO REALIZADO!" + Util.NL);
		} else {
			System.out.println("POSIÇÃO INVÁLIDA!");
		}

	}

	public String pesquisaContato(int pos) {
		if (indiceValido(pos)) {
			if (contatos[pos - 1] != null) {
				return contatos[pos - 1].toString();
			}
			return "CONTATO NÃO EXISTE!";
		} else {
			return "POSIÇÃO INVÁLIDA!";
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

	private boolean indiceValido(int pos) {
		return !(pos < 1 || pos > 100);
	}

}

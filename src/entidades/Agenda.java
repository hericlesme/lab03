package entidades;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos = new Contato[100];

	public String cadastraContato(String nome, String sobrenome, int pos, String telefone){
		if (indiceValido(pos)) {
			contatos[pos - 1] = new Contato(nome, sobrenome, telefone);
			return ("Cadastro Realizado!" + Util.NL);
		} else {
			return "Posição Inválida!";
		}

	}

	private boolean indiceValido(int pos) {
		return !(pos < 1 || pos > 100);
	}

	public String pesquisaContato(int pos) {

		if (indiceValido(pos)) {
			if (contatos[pos - 1] != null) {
				return contatos[pos - 1].toString();
			}
			return "Contato não existe!";
		} else {
			return "Posição Inválida!";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contatos);
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
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contatos, other.contatos))
			return false;
		return true;
	}
	
	

}

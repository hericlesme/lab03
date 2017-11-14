package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AgendaTest {

	Agenda agenda, outraAgenda;

	@Test
	public void testPesquisaContatoPosicaoInvalida() {
		assertEquals("Posição Inválida!", agenda.pesquisaContato(1000));
		assertEquals("Posição Inválida!", agenda.pesquisaContato(0));
		assertEquals("Posição Inválida!", agenda.pesquisaContato(-3));
	}

	@Test
	public void testAchaContato() {
		assertEquals(("GAUDS Matheus - 0800 777 7000"), agenda.pesquisaContato(2));
	}

	@Test
	public void testContatoInexistente() {
		assertEquals("Contato não existe!", agenda.pesquisaContato(3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNomeInvalido() {
		agenda.cadastraContato("", "gauds", 1, "4002-8922");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSobrenomeInvalido() {
		agenda.cadastraContato("matheus", "   ", 1, "4002-8922");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTelefoneInvalido() {
		agenda.cadastraContato("Matheus", "Gaudêncio", 1, "  ");
	}

	@Test(expected = NullPointerException.class)
	public void testNomeNulo() {
		agenda.cadastraContato(null, "gauds", 1, "4002-8922");
	}

	@Test(expected = NullPointerException.class)
	public void testSobrenomeNulo() {
		agenda.cadastraContato("matheus", null, 1, "4002-8922");
	}

	@Test(expected = NullPointerException.class)
	public void testTelefoneNulo() {
		agenda.cadastraContato("Matheus", "Gaudêncio", 1, null);
	}

	@Test
	public void testCadastroValido() {
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 1, "4002-8922"));
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 100, "4002-8922"));
	}

	@Test
	public void testCadastraPosiçãoInvalida() {
		assertEquals("Posição Inválida!", agenda.cadastraContato("matheus", "gauds", -50, "4002-8922"));
		assertEquals("Posição Inválida!", agenda.cadastraContato("matheus", "gauds", 500, "4002-8922"));
	}

	@Test
	public void testListaContatos() {
		assertEquals("2 - GAUDS Matheus" + Util.NL, agenda.listaContatos());
		agenda.cadastraContato("Livia", "Nao Sei", 3, "9 9999-9999");
		assertEquals("2 - GAUDS Matheus" + Util.NL + "3 - Livia Nao Sei" + Util.NL, agenda.listaContatos());
	}

	@Test
	public void testAgendasIguais() {
		agenda.cadastraContato("GAUDS", "Meu herói", 2, "0800 777 7000");
		outraAgenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		assertTrue(agenda.equals(outraAgenda));
	}

	@Test
	public void testAgendasDiferentes() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		outraAgenda.cadastraContato("Gaudêncio", "Matheus Meu Idolo", 2, "0800 777 7000");
		assertFalse(agenda.equals(outraAgenda));
	}

	@Test
	public void testHashCodeIgual() {
		agenda.cadastraContato("GAUDS", "Best Melhor Professor Br", 2, "0800 777 7000");
		outraAgenda.cadastraContato("GAUDS", "Matheus", 2, "0800 888 7000");
		assertEquals(agenda.hashCode(), outraAgenda.hashCode());
	}

	@Test
	public void testHashCodeDiferente() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		outraAgenda.cadastraContato("Gaudêncio", "Maths", 2, "0800 321 7000");
		assertNotEquals(agenda.hashCode(), outraAgenda.hashCode());
	}
}

package entidades;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgendaTest {

	Agenda agenda;
	Agenda outraAgenda;
	Agenda maisUmaAgenda;

	@Before
	public void defineAgenda() {

		agenda = new Agenda();
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");

		outraAgenda = new Agenda();
		outraAgenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");

		maisUmaAgenda = new Agenda();
		maisUmaAgenda.cadastraContato("Gaudêncio", "Matheus", 2, "0800 777 7000");
	}

	@Test
	public void testPesquisaContato() {
		assertEquals("Posição Inválida!", agenda.pesquisaContato(1000));
		assertEquals("Posição Inválida!", agenda.pesquisaContato(0));
		assertEquals("Posição Inválida!", agenda.pesquisaContato(-3));
		assertEquals(("GAUDS Matheus - 0800 777 7000"), agenda.pesquisaContato(2));
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
	public void testCadastraContato() {
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 1, "4002-8922"));
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 100, "4002-8922"));
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
	public void testEquals() {
		assertTrue(agenda.equals(outraAgenda));
		assertFalse(agenda.equals(maisUmaAgenda));
	}

	@Test
	public void testHashCode() {
		assertEquals(agenda.hashCode(), outraAgenda.hashCode());
		assertNotEquals(agenda.hashCode(), maisUmaAgenda.hashCode());
	}

}

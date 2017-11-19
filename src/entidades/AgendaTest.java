package entidades;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Teste da classe Agenda.
 * 
 * Lab03 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
public class AgendaTest {
	Agenda agenda, outraAgenda;

	/**
	 * Inicializa as Agendas.
	 */
	@Before
	public void criaAgenda() {
		agenda = new Agenda();
		outraAgenda = new Agenda();
	}

	/**
	 * Testa o achaContato para um contato cadastrado.
	 */
	@Test
	public void testAchaContato() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		assertEquals(("GAUDS Matheus - 0800 777 7000"), agenda.pesquisaContato(2));
	}

	/**
	 * Testa o cadastraContato, quando o cadastro é válido.
	 */
	@Test
	public void testCadastroValido() {
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 1, "4002-8922"));
		assertEquals("Cadastro Realizado!" + Util.NL, agenda.cadastraContato("matheus", "gauds", 100, "4002-8922"));
	}

	/**
	 * Testa o cadastraContato quando a posição passada for inválida.
	 */
	@Test
	public void testCadastraPosiçãoInvalida() {
		assertEquals("Posição Inválida!", agenda.cadastraContato("matheus", "gauds", -50, "4002-8922"));
		assertEquals("Posição Inválida!", agenda.cadastraContato("matheus", "gauds", 500, "4002-8922"));
	}

	/**
	 * Testa o listaContatos à medida que são adicionados contatos.
	 */
	@Test
	public void testListaContatos() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		assertEquals("2 - GAUDS Matheus" + Util.NL, agenda.listaContatos());
		agenda.cadastraContato("Livia", "Nao Sei", 3, "9 9999-9999");
		assertEquals("2 - GAUDS Matheus" + Util.NL + "3 - Livia Nao Sei" + Util.NL, agenda.listaContatos());
	}

	/**
	 * Testa o método equals, quando as agendas são iguais.
	 */
	@Test
	public void testAgendasIguais() {
		agenda.cadastraContato("GAUDS", "Meu herói", 2, "0800 777 7000");
		outraAgenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		assertTrue(agenda.equals(outraAgenda));
	}

	/**
	 * Testa o método equals, quando as agendas são diferentes.
	 */
	@Test
	public void testAgendasDiferentes() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		outraAgenda.cadastraContato("Gaudêncio", "Matheus Meu Idolo", 2, "0800 777 7000");
		assertFalse(agenda.equals(outraAgenda));
	}

	/**
	 * Testa o método hashCode, quando hashCodes das agendas são iguais.
	 */
	@Test
	public void testHashCodeIgual() {
		agenda.cadastraContato("GAUDS", "Best Melhor Professor Br", 2, "0800 777 7000");
		outraAgenda.cadastraContato("GAUDS", "Matheus", 2, "0800 888 7000");
		assertEquals(agenda.hashCode(), outraAgenda.hashCode());
	}

	/**
	 * Testa o método hashCode, quando os hashCodes das agendas são diferentes.
	 */
	@Test
	public void testHashCodeDiferente() {
		agenda.cadastraContato("GAUDS", "Matheus", 2, "0800 777 7000");
		outraAgenda.cadastraContato("Gaudêncio", "Maths", 2, "0800 321 7000");
		assertNotEquals(agenda.hashCode(), outraAgenda.hashCode());
	}
}
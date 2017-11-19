package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Teste da classe Contato.
 * 
 * Lab03 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
public class ContatoTest {

	Contato contato, outroContato;

	/**
	 * Testa o construtor do contato, com nome vazio.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testNomeInvalido() {
		contato = new Contato("", "gauds", "4002-8922");
	}

	/**
	 * Testa o construtor do contato, com sobrenome vazio.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSobrenomeInvalido() {
		contato = new Contato("matheus", "   ", "4002-8922");
	}

	/**
	 * Testa o construtor do contato, com telefone vazio.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testTelefoneInvalido() {
		contato = new Contato("Matheus", "Gaudêncio", "  ");
	}

	/**
	 * Testa o construtor do contato, com nome nulo.
	 */
	@Test(expected = NullPointerException.class)
	public void testNomeNulo() {
		contato = new Contato(null, "gauds", "4002-8922");
	}

	/**
	 * Testa o construtor do contato, com sobrenome nulo.
	 */
	@Test(expected = NullPointerException.class)
	public void testSobrenomeNulo() {
		contato = new Contato("matheus", null, "4002-8922");
	}

	/**
	 * Testa o construtor do contato, com telefone nulo.
	 */
	@Test(expected = NullPointerException.class)
	public void testTelefoneNulo() {
		contato = new Contato("Matheus", "Gaudêncio", null);
	}

	/**
	 * Testa o método equals, quando os contatos tem nomes iguais.
	 */
	@Test
	public void testContatosIguais() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Matheus", "Gauds", "0800");
		assertTrue(contato.equals(outroContato));
	}

	/**
	 * Testa o método equals, quando os contatos tem nomes diferentes.
	 */
	@Test
	public void testContatosDiferentes() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Maths", "Gaudêncio", "0800 777 7000");
		assertFalse(contato.equals(outroContato));
	}

	/**
	 * Testa o método hashCode, quando os hashCodes gerados a partir do nome dos
	 * contatos são iguais.
	 */
	@Test
	public void testHashCodeIgual() {
		contato = new Contato("Matheus", "Gaudêncio", "40028922");
		outroContato = new Contato("Matheus", "Gauds", "0800");
		assertEquals(contato.hashCode(), outroContato.hashCode());
	}

	/**
	 * Testa o método hashCode, quando os hashCodes gerados a partir do nome dos
	 * contatos são diferentes.
	 */
	@Test
	public void testHashCodeDiferente() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Maths", "Gaudêncio", "0800");
		assertNotEquals(contato.hashCode(), outroContato.hashCode());
	}

	/**
	 * Testa o toString, que retorna a representação em string do contato.
	 */
	@Test
	public void testToString() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		assertEquals("Matheus Gaudêncio - 0800", contato.toString());
	}
}

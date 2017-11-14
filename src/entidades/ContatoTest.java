package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContatoTest {

	Contato contato, outroContato;

	@Test(expected = IllegalArgumentException.class)
	public void testNomeInvalido() {
		contato = new Contato("", "gauds", "4002-8922");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSobrenomeInvalido() {
		contato = new Contato("matheus", "   ", "4002-8922");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTelefoneInvalido() {
		contato = new Contato("Matheus", "Gaudêncio", "  ");
	}

	@Test(expected = NullPointerException.class)
	public void testNomeNulo() {
		contato = new Contato(null, "gauds", "4002-8922");
	}

	@Test(expected = NullPointerException.class)
	public void testSobrenomeNulo() {
		contato = new Contato("matheus", null, "4002-8922");
	}

	@Test(expected = NullPointerException.class)
	public void testTelefoneNulo() {
		contato = new Contato("Matheus", "Gaudêncio", null);
	}

	@Test
	public void testContatosIguais() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Matheus", "Gauds", "0800");
		assertTrue(contato.equals(outroContato));
	}

	@Test
	public void testContatosDiferentes() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Maths", "Gaudêncio", "0800 777 7000");
		assertFalse(contato.equals(outroContato));
	}

	@Test
	public void testHashCodeIgual() {
		contato = new Contato("Matheus", "Gaudêncio", "40028922");
		outroContato = new Contato("Matheus", "Gauds", "0800");
		assertEquals(contato.hashCode(), outroContato.hashCode());
	}

	@Test
	public void testHashCodeDiferente() {
		contato = new Contato("Matheus", "Gaudêncio", "0800");
		outroContato = new Contato("Maths", "Gaudêncio", "0800");
		assertNotEquals(contato.hashCode(), outroContato.hashCode());
	}
}

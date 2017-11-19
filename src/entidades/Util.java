package entidades;

import java.util.Scanner;

/**
 * Classe Utilitária do sistema.
 * 
 * Lab03 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
public class Util {

	public static Scanner input = new Scanner(System.in);

	public static final String NL = System.lineSeparator();

	/**
	 * Lê uma String e a retorna.
	 * 
	 * @return a string recebida.
	 */
	public static String leString() {
		return input.nextLine();
	}

	/**
	 * Lê um inteiro e o retorna.
	 * 
	 * @return o inteiro recebido.
	 */
	public static int leInt() {
		int retorno = input.nextInt();
		input.nextLine();
		return retorno;
	}
}
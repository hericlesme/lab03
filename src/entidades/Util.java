package entidades;

import java.util.Scanner;

public class Util {

	public static Scanner input = new Scanner(System.in);

	public static final String NL = System.lineSeparator();

	public static String leString() {
		return input.nextLine();
	}
	
	public static int leInt() {
		int retorno = input.nextInt();
		input.nextLine();
		return retorno;
	}
}
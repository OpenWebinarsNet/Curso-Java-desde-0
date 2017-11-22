package usodestringbuilder;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class PalindromosString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String palindromo = "Dabale arroz a la zorra el abad";
		int longitud = palindromo.length();
		char[] tempCharArray = new char[longitud];
		char[] charArray = new char[longitud];

		// transformamos el string en un array de char
		for (int i = 0; i < longitud; i++) {
			tempCharArray[i] = palindromo.charAt(i);
		}

		// lo invertimos
		for (int j = 0; j < longitud; j++) {
			charArray[j] = tempCharArray[longitud - 1 - j];
		}

		String palindromoInvertido = new String(charArray);
		System.out.println(palindromoInvertido);
		
		
	}

}

package conthrows;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class EjemploSinThrows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		writeList();
		System.out.println("Fichero escrito correctamente");
	}

	public static void writeList() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));

			for (int i = 0; i < 10; i++) {
				out.println("Mensaje nº " + i);
			}
		} catch (IOException ex) {
			System.err.println("Error al abrir o escribir en el fichero");
		} finally {
			out.close();
		}

	}

}

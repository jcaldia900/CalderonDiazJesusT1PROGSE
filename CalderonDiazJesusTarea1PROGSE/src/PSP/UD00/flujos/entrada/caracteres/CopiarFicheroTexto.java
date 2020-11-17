package PSP.UD00.flujos.entrada.caracteres;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarFicheroTexto extends Codificador {
	public static void main(String[] args) {

		String nombreFichero = "src/fichero_a_cifrar.txt";

		imprimirFicheroPorLineas(nombreFichero);
		codifica(nombreFichero);
		decodifica(nombreFichero);

	}

	private static void imprimirFicheroPorLineas(String nombreFichero) {
		String linea;
		String nombreFicheroCopia = "src/ficheroCodificado";
		try (BufferedReader bufferLectura = new BufferedReader(new FileReader(nombreFichero));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(nombreFicheroCopia + ".txt"));) {

			linea = bufferLectura.readLine();
			while (linea != null) {
				System.out.println(linea);
				if(linea.isEmpty()) {filtroEscritura.write(decodifica(linea));
				}else {filtroEscritura.write(codifica(linea));}
				filtroEscritura.newLine();

				linea = bufferLectura.readLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero " + nombreFichero);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
package ejerciciosCasa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicioTres {
	public static void main(String[] args) throws IOException {
		File dir = new File("/ejercicios/fichero.txt");
		String[] ficheros = dir.list();
		String linea;
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");}
			else { 
				BufferedWriter entrada= new BufferedWriter(new FileWriter ("ficheroGuardo.txt"));
				
			  for (int x=0;x<ficheros.length;x++)
			    entrada.write(ficheros[x]);
			    entrada.newLine();
			}
	}


}

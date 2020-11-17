package ejercicios;

import java.io.File;
import java.io.IOException;

public class ejercicioDos {
	public static void main(String[] args) throws IOException {
	File dir = new File("/ejercicios/fichero.txt");
	String[] ficheros = dir.list();
	if (ficheros == null) {
		  System.out.println("No hay ficheros en el directorio especificado");}
		else { 
		  for (int x=0;x<ficheros.length;x++)
		    System.out.println(ficheros[x]);
		}
}
}
	
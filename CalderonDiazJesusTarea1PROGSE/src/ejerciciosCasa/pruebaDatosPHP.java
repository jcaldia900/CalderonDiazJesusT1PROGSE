package ejerciciosCasa;

import java.io.*;
import java.net.*;

public class pruebaDatosPHP {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://psp2021site.000webhostapp.com/suma_parametros.php");
			URLConnection conexion = url.openConnection();
			conexion.setDoOutput(true);
			//se le pasa por la cadena los parametros
			
			String cadena = "PARAM_A=5&PARAM_B=6";
			
			PrintWriter output = new PrintWriter(conexion.getOutputStream());
			output.write(cadena);
			output.close(); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			while ((linea = reader.readLine()) != null) {
				//eliminamos la etiqueta HTML con replaceALL
				System.out.println(linea.replaceAll("\\<[^>]*>",""));

			}
			reader.close();
		} catch (MalformedURLException me) {
			System.err.println("MalformedURLException: " + me);
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe);
		}
	}
}

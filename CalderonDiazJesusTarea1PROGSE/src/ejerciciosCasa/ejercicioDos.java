package ejerciciosCasa;

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
	
	
	/*public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoWindows;
		Process p = null;
		BufferedReader br = null; 
		
		try {
			p = rt.exec(comando);		
		
			InputStream is = p.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while ((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
}
	
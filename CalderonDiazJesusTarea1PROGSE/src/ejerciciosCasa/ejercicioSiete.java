package ejerciciosCasa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ejercicioSiete {
	
public static void main(String[] args) {
	
	/*String comando= "C:\\Program Files\\Mozilla Firefox\\firefox.exe" ;
	ArrayList <String> listacomando = new ArrayList <String>() ;
	listacomando.add(comando);
	listacomando.add("iescristobaldemonroy.es");*/
	String[] listacomando= new String [1];
	listacomando[0]="C:\\Program Files\\Mozilla Firefox\\firefox.exe ";
		//ProcessBuilder proc=new ProcessBuilder(listacomando);
	Runtime rt= Runtime.getRuntime();
	
		try {
		//	proc.start();
			rt.exec(listacomando);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
}
/*public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "firefox";
		String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		
		String comando = comandoWindows;
		
		try {
			ProcessBuilder pb = new ProcessBuilder(comando, "iescristobaldemonroy.es");
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}


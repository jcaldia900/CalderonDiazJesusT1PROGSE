package ejerciciosCasa;

import java.io.IOException;

public class ejercicioUno {
	
public static void main(String[] args) {
	
	String comando= "C:\\Program Files\\Mozilla Firefox\\firefox.exe" ;
	
		ProcessBuilder proc=new ProcessBuilder(comando,"iescristobaldemonroy.es ");
		try {
			proc.start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
}
}

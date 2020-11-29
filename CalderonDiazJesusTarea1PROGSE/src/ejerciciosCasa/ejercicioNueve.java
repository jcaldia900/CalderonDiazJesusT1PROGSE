package ejerciciosCasa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ejercicioNueve {
	public static void main(String[] args) throws InterruptedException {
	List<String> lCommand=new ArrayList<String>();	
	lCommand.add("ls");
	lCommand.add("srrc");
	
	Process p = null;
	int resultado = -1;
	ProcessBuilder pb=new ProcessBuilder(lCommand);
	File fOut = new File(Cadenas.getCadenaFichero("salida_ejercicio.txt"));
	File fErr = new File(Cadenas.getCadenaFichero("log_ejercicio9.txt"));
	pb.redirectOutput(fOut);
	pb.redirectError(fErr);
	try {
		
		p=pb.start();
	}catch(IOException e) {e.printStackTrace();
	}
	if(resultado==0) {
		
		System.out.println("ok");
	}else {System.out.println("mal,consulta log");}
	
		
	}

}

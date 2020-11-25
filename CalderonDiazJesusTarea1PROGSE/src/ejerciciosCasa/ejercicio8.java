package ejerciciosCasa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ejercicio8 {
	public static void main(String[] args) {
		
		
			
			ProcessBuilder ab=new ProcessBuilder();
			//colección,parecido a un list
			Map<String,String> vbles=ab.environment();
			System.out.println(vbles);
			List<String> lCommand= new ArrayList<String>();
			lCommand.add("CMD");
			lCommand.add("/C");
			lCommand.add("DIRR");
			//linux
			/*lCommand.add("ls");
			lCommand.add("--help");*/
			
			ProcessBuilder proc=new ProcessBuilder(lCommand);
			System.out.println(proc.command());
			try {
				proc.start();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}

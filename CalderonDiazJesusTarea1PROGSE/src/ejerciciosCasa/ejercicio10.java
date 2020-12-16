package ejerciciosCasa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ejercicio10 {
	public static void main(String[] args) {
		List<String> lCmdLinux = new ArrayList<String>();		
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");
		
		List<String> lCmdWin = new ArrayList<String>();		
		lCmdWin.add("CMD");
		lCmdWin.add("/C");
		lCmdWin.add("echo");
		lCmdWin.add("%MI_NOMBRE%");
		
		List<String> lCommand = null;
		
		if (System.getProperty("os.name").contains("Windows")) {
			lCommand = lCmdWin;
		}else {
			lCommand = lCmdLinux;
		}
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		//n existe como en minombre en la linea 19, asi q lo hace aqui la  variable abajo con el valor jesus
		//put es como un add crea variable con el valor jesus
		Map<String, String> vEnt = pb.environment();		
		vEnt.put("MI_NOMBRE", "JESUS");
				//como un sysout
		pb.inheritIO();	
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

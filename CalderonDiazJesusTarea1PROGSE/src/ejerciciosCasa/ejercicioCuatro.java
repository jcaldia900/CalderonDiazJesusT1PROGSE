package ejerciciosCasa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejercicioCuatro {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls --help";
		String comandoWindows = "CMD /C DIRRRRRRRRRRR";
		String comando = comandoWindows;
		Process p = null;
		try {
			p = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int status;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha resultado " + status);
			if (status == 0) {
				System.out.println("el comando está ok ");
			} else {
				System.out.println("está mal");
			}
			InputStream errStream = p.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errStream));

			bw = new BufferedWriter(new FileWriter("src/ejerciciosCasa/ficheroError.txt"));
			String linea = "";
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				bw.write(linea);
				bw.newLine();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
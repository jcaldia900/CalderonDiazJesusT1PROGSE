package ejerciciosCasa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class managerCalculadora {
	Scanner teclado= new Scanner(System.in);
	private String protocolo;
	private String urlEndPoint;
	private static Integer apiKey=114;
	private boolean estaRegistrada=true;
	
	public static void main(String[] args) {
		//http://psp2021site.000webhostapp.com/realizaOperacion.php?
		//API_KEY=114&TIPO_OPERACION=SUMA&SUMANDO_A=5&SUMANDO_B=6

		/*try {
			
			URL urlEndPoint = new URL
	("https://psp2021site.000webhostapp.com/realizaOperacion.php");
			
			URLConnection conexion = urlEndPoint.openConnection();
			conexion.setDoOutput(true);
			;
			String cadena = "";
			
			PrintWriter output = new PrintWriter(conexion.getOutputStream());
			output.write(cadena);
			output.close(); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			while ((linea = reader.readLine()) != null) {
				//eliminamos la etiqueta HTML con replaceALL
				System.out.println(linea.replaceAll("\\<[^>]*>",""));
			}
			
			
		} catch (MalformedURLException me) {
			System.err.println("MalformedURLException: " + me);
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe);
		}*/
	}
		public void sumar(int a, int b) throws IOException {
			try {
				URL urlEndPoint = new URL
						("https://psp2021site.000webhostapp.com/realizaOperacion.php?API_KEY="+apiKey+"&TIPO_OPERACION=SUMA&"+"SUMANDO_A="+a+"&SUMANDO_B="+b);
			
				URLConnection conexion = urlEndPoint.openConnection();
				conexion.setDoOutput(true);
				;
				String cadena = "";
				
				PrintWriter output = new PrintWriter(conexion.getOutputStream());
				output.write(cadena);
				output.close(); 
				BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
				String linea;
				while ((linea = reader.readLine()) != null) {
					//eliminamos la etiqueta HTML con replaceALL
					System.out.println(linea.replaceAll("\\<[^>]*>",""));
			
			
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}; // a + b
		public void restar(int a, int b) throws IOException {
			try {
				URL urlEndPoint = new URL
						("https://psp2021site.000webhostapp.com/realizaOperacion.php?API_KEY="+apiKey+"&TIPO_OPERACION=RESTA&"+"MINUENDO="+a+"&SUSTRAENDO="+b);
			
				URLConnection conexion = urlEndPoint.openConnection();
				conexion.setDoOutput(true);
				;
				String cadena = "";
				
				PrintWriter output = new PrintWriter(conexion.getOutputStream());
				output.write(cadena);
				output.close(); 
				BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
				String linea;
				while ((linea = reader.readLine()) != null) {
					//eliminamos la etiqueta HTML con replaceALL
					System.out.println(linea.replaceAll("\\<[^>]*>",""));
			
			
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}; 
		public void multiplicar(int a, int b) throws IOException {
			try {
				URL urlEndPoint = new URL
						("https://psp2021site.000webhostapp.com/realizaOperacion.php?API_KEY="+apiKey+"&TIPO_OPERACION=MULTIPLICACION&"+"OPERADOR_1="+a+"&OPERADOR_2="+b);
			
				URLConnection conexion = urlEndPoint.openConnection();
				conexion.setDoOutput(true);
				;
				String cadena = "";
				
				PrintWriter output = new PrintWriter(conexion.getOutputStream());
				output.write(cadena);
				output.close(); 
				BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
				String linea;
				while ((linea = reader.readLine()) != null) {
					//eliminamos la etiqueta HTML con replaceALL
					System.out.println(linea.replaceAll("\\<[^>]*>",""));
			
			
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
	}
	
	
	




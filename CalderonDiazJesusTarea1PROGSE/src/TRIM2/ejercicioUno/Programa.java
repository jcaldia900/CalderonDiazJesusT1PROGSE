package TRIM2.ejercicioUno;

public class Programa {
	  public static void main(String args[]) {
	    Tarea tarea = new Tarea();
	    Thread hilo = new Thread(tarea);
	    tarea.start();
	    System.out.println("Yo soy el hilo principal y sigo haciendo mi trabajo");
	    System.out.println("Fin del hilo principal");
	  }
}

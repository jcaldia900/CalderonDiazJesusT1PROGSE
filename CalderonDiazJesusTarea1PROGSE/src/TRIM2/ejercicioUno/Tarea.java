package TRIM2.ejercicioUno;

public class Tarea implements Runnable {
	  @Override
	  public void run() {
	    for (int i = 0; i < 10; i++) {
	      System.out.println("Soy un hilo y esto es lo que hago");
	      try {
	        Thread.sleep(500);
	      } catch (InterruptedException ie) {
	        ie.printStackTrace();
	      }
	    }
	  }
	}
package TRIM2.ejercicioUno;

public class TestingDaemonThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new EjemploDaemonThread().start();

        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            // C�digo de interrupci�n.
        }
        System.out.println("Hilo principal (main) finalizado.") ;
	}
}

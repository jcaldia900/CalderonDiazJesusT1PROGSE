package TRIM2.ejercicioUno;

public class EjemploDaemonThread extends Thread {
	public EjemploDaemonThread() {
        // false -- No es un hilo de usuario, por tanto debe finalizarse explícitamente.
        // true  -- Es un hilo creado por y para el usuario y debe finalizar con la JVM, es decir, el main.
        setDaemon(false); 
    }

    private void setDaemon(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void run() {
        int count = 0;

        while (true) {
            System.out.println("Hilo " + ((isDaemon()==true)?"demonio. ":"sin fin. ") +count++);
 
            try {
                sleep(5000);
            } catch (InterruptedException e) {
               e.getMessage();
            }
        }
    }

	private boolean isDaemon() {
		// TODO Auto-generated method stub
		return false;
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}
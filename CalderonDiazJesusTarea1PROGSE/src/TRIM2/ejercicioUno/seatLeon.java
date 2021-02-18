package TRIM2.ejercicioUno;

public class seatLeon extends Coche{
	int velocidad;
	public seatLeon(String matricula, int kilometros,int velocidad) {
		super(matricula, kilometros);
		this.velocidad=velocidad;
	}
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			this.kilometros=kilometros+velocidad;
			System.out.println("Lleva recorrido Fiesta: "+this.kilometros+"km");
		}
	}
	@Override
	public String toString() {
		return super.toString()+"seatLeon [velocidad=" + velocidad + "]";
	}
	
}

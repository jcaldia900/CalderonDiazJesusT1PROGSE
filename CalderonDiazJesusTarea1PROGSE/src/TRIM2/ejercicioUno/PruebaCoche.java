package TRIM2.ejercicioUno;

public class PruebaCoche{
	public static void main(String[] args) {
	seatLeon seat= new seatLeon("2",0,2);
	fordFiesta cocheDos=new fordFiesta("2",1,2);
	
	seat.run();
	cocheDos.run();
	
	System.out.println(seat);
	System.out.println(cocheDos);
	}
}

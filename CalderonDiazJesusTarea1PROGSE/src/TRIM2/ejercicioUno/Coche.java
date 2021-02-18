package TRIM2.ejercicioUno;

public abstract class Coche {
String matricula;
int kilometros;

public Coche(String matricula, int kilometros) {
	
	this.matricula = matricula;
	this.kilometros = kilometros;
}
public void run() {
	
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public int getKilometros() {
	return kilometros;
}
public void setKilometros(int kilometros) {
	this.kilometros = kilometros;
}


}

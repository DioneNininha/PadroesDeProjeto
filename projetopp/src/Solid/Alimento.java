package Solid;
/**
 * 
 * @author Dione
 * */
public class Alimento {
	
private double peso = 0;
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	if(peso > 0) {
		this.peso= peso;
	}
}
}

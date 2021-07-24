package Solid;
/**
 * 
 * @author Dione
 * */
public class Individuo {
	
private double peso = 0;

public Individuo(double pesoComeco) {
	this.peso = pesoComeco;
}

public double getPeso() {
	return peso;
}
public void alimentar(Alimento alimento) {
	this.peso += alimento.getPeso();
	
}

}




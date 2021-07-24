package Solid;

public class Janta {
public static void main(String[] args) {
	
	Carne carne = new Carne();
	carne.setPeso(0.400);
	
	Arroz arroz = new Arroz();
	arroz.setPeso(0.200);
	
	Vinagrete vinagrete = new Vinagrete();
	vinagrete.setPeso(0.200);
	
	Doce doce = new Doce();
	doce.setPeso(0.300);
	
	Individuo individuo= new Individuo(70.6);
	individuo.alimentar(carne);
	individuo.alimentar(arroz);
	individuo.alimentar(vinagrete);
	individuo.alimentar(doce);
	
	System.out.println(individuo.getPeso());
	}
}


 
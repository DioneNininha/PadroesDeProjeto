package projetoisp;

/**
 * 
 * @author Dione
 * 
 */

import veiculos.Quadriciclo;

import veiculos.Diciclo;

public class Main {

	private static String tipo;

	public static void main(String[] args) {

		tipo = "Quadriciclo";

		if (tipo == "Quadriciclo") {

			Quadriciclo quadriciclo = new Quadriciclo(1.5, "Preta", "2021", 2);
		}

		else {
			Diciclo diciclo = new Diciclo(20, "Vermelha", "2021");
		}
	}
}
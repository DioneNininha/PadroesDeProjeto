package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public class CartaoCredito extends NubankCartao {

	@Override
	public void validate() throws Exception {

		// valida��o-cart�o-cr�dito

		System.out.println("Valida��o do limite em andamento...");
		System.out.println("Limite positivo!");
	}
}

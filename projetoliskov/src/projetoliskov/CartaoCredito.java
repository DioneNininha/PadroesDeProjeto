package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public class CartaoCredito extends NubankCartao {

	@Override
	public void validate() throws Exception {

		// validação-cartão-crédito

		System.out.println("Validação do limite em andamento...");
		System.out.println("Limite positivo!");
	}
}

package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public class DebitoCartao extends NubankCartao {

	@Override
	public void validate() throws Exception {

		System.out.println("O Saldo está sendo verificado...");
		System.out.println("Saldo disponível!");
	}
}

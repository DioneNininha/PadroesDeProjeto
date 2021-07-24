package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public class PagamentoMain {

	public static void main(String[] args) throws Exception {

		// CartaoCredito cartao = new CartaoCredito();
		// DebitoCartao cartao = new DebitoCartao();
		NubankRewards cartao = new NubankRewards();

		cartao.validate();
		cartao.RecolherPagamento();
	}
}

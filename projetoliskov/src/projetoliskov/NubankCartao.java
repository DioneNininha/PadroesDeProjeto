package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
abstract public class NubankCartao implements InstrumentoPagamento {

	@Override
	public void validate() throws Exception {
		// Valida��o b�sica
	}

	@Override
	public void RecolherPagamento() {
		System.out.println("Pagamento Efetuado com sucesso.");
	}
}

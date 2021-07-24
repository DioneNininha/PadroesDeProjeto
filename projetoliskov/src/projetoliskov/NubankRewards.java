package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public class NubankRewards implements InstrumentoPagamento {

	@Override
	public void validate() throws Exception {

		System.out.println("<<<<<VALIDAÇÕES>>>>>");
		System.out.println("Limite  - Positivo!\nRewards - Positivo!");
	}

	@Override
	public void RecolherPagamento() {

		System.out.println("Pagamento efetuado com sucesso!");
		System.out.println("Pontos creditados no Programa Rewards!");
	}
}

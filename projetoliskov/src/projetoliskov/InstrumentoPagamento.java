package projetoliskov;

/**
 * 
 * @author Dione
 *
 */
public interface InstrumentoPagamento {

	void validate() throws Exception;

	void RecolherPagamento();

}

package tipo;

/**
 * 
 * @author Dione
 *
 */
public class ConsultaBdUm implements IDbArtigo {

	public String getArtigoDeId(String artigoID) {

		return "\n  Do <BancoDadosUm> : Artigo " + artigoID;
	}
}

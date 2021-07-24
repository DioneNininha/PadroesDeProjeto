package factory;

import tipo.ConsultaBdUm;
import tipo.IDbArtigo;

/**
 * 
 * @author Dione
 *
 */
public class DbArtigoFactory {

	public static IDbArtigo create() {

		return new ConsultaBdUm();
	}

}

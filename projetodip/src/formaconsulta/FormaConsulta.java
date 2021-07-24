package formaconsulta;

import factory.DbArtigoFactory;
import tipo.IDbArtigo;

/**
 * 
 * @author Dione
 *
 */
public class FormaConsulta {

	public void pay(String artigoID) {

		IDbArtigo dbArtigo = DbArtigoFactory.create();

		String artigo = dbArtigo.getArtigoDeId(artigoID);

		System.out.println(artigo);
	}
}

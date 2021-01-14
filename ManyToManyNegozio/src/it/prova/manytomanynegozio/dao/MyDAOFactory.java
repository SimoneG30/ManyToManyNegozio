package it.prova.manytomanynegozio.dao;

import it.prova.manytomanynegozio.dao.articolo.ArticoloDAO;
import it.prova.manytomanynegozio.dao.articolo.ArticoloDAOImpl;
import it.prova.manytomanynegozio.dao.categoria.CategoriaDAO;
import it.prova.manytomanynegozio.dao.categoria.CategoriaDAOImpl;
import it.prova.manytomanynegozio.dao.ordine.OrdineDAO;
import it.prova.manytomanynegozio.dao.ordine.OrdineDAOImpl;

public class MyDAOFactory {

	private static ArticoloDAO articoloDAOInstance = null;
	private static CategoriaDAO categoriaDAOInstance = null;
	private static OrdineDAO ordineDAOInstance = null;

	public static ArticoloDAO getArticoloDAOInstance() {
		if (articoloDAOInstance == null)
			articoloDAOInstance = new ArticoloDAOImpl();
		return articoloDAOInstance;
	}
	
	public static CategoriaDAO getCategoriaDAOInstance() {
		if (categoriaDAOInstance == null)
			categoriaDAOInstance = new CategoriaDAOImpl();
		return categoriaDAOInstance;
	}
	
	public static OrdineDAO getOrdineDAOInstance() {
		if (ordineDAOInstance == null)
			ordineDAOInstance = new OrdineDAOImpl();
		return ordineDAOInstance;
	}

}

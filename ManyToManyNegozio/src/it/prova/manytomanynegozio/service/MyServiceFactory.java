package it.prova.manytomanynegozio.service;

import it.prova.manytomanynegozio.dao.MyDAOFactory;
import it.prova.manytomanynegozio.service.articolo.ArticoloService;
import it.prova.manytomanynegozio.service.articolo.ArticoloServiceImpl;
import it.prova.manytomanynegozio.service.categoria.CategoriaService;
import it.prova.manytomanynegozio.service.categoria.CategoriaServiceImpl;
import it.prova.manytomanynegozio.service.ordine.OrdineService;
import it.prova.manytomanynegozio.service.ordine.OrdineServiceImpl;

public class MyServiceFactory {

	private static ArticoloService articoloServiceInstance;
	private static CategoriaService categoriaServiceInstance;
	private static OrdineService ordineServiceInstance;
	
	public static ArticoloService getArticoloServiceInstance() {
		if (articoloServiceInstance == null)
			articoloServiceInstance = new ArticoloServiceImpl();

		articoloServiceInstance.setArticoloDAO(MyDAOFactory.getArticoloDAOInstance());
		return articoloServiceInstance;
	}
	
	public static CategoriaService getCategoriaServiceInstance() {
		if (categoriaServiceInstance == null)
			categoriaServiceInstance = new CategoriaServiceImpl();
		
		categoriaServiceInstance.setCategoriaDAO(MyDAOFactory.getCategoriaDAOInstance());
		return categoriaServiceInstance;
	}
	
	public static OrdineService getOrdineServiceInstance() {
		if (ordineServiceInstance == null)
			ordineServiceInstance = new OrdineServiceImpl();
		
		ordineServiceInstance.setOrdineDAO(MyDAOFactory.getOrdineDAOInstance());
		return ordineServiceInstance;
	}
}

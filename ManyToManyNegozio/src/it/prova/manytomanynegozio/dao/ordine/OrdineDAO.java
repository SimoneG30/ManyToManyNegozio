package it.prova.manytomanynegozio.dao.ordine;

import java.util.List;

import it.prova.manytomanynegozio.dao.IBaseDAO;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public interface OrdineDAO extends IBaseDAO<Ordine>  {
	public List<Ordine> findAllOrdiniByCategoria(Categoria categoriaInput);
}

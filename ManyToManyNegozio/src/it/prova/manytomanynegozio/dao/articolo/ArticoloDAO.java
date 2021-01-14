package it.prova.manytomanynegozio.dao.articolo;

import java.util.List;

import it.prova.manytomanynegozio.dao.IBaseDAO;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public interface ArticoloDAO extends IBaseDAO<Articolo> {
	
	public List<Categoria> findAllByCategoria(Categoria categoriaInput);
	
	public List<Ordine> findAllByOrdine(Ordine ordineInput);

}

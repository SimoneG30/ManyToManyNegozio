package it.prova.manytomanynegozio.dao.categoria;

import java.util.List;

import it.prova.manytomanynegozio.dao.IBaseDAO;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public interface CategoriaDAO extends IBaseDAO<Categoria> {
	
	public List<Categoria> findAllByDescrizione(String descrizioneInput);
	
	public List<Categoria> findAllByArticolo(Articolo articoloInput);

	public List<Categoria> findAllByOrdine(Ordine ordineInput);
}

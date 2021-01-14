package it.prova.manytomanynegozio.service.categoria;

import java.util.List;

import it.prova.manytomanynegozio.dao.categoria.CategoriaDAO;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;

public interface CategoriaService {
	
	public List<Categoria> listAll() throws Exception;

	public Categoria caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Categoria categoriaInstance) throws Exception;

	public void inserisciNuovo(Categoria categoriaInstance) throws Exception;

	public void rimuovi(Categoria categoriaInstance) throws Exception;

	public void aggiungiArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception;
	
	public void nuovaCategoriaConArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception;
	
	public List<Categoria> cercaCategoriaPerArticolo(Articolo articoloInput);


	// per injection
	public void setCategoriaDAO(CategoriaDAO categoriaDAO);
}

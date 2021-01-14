package it.prova.manytomanynegozio.service.articolo;

import java.util.List;

import it.prova.manytomanynegozio.dao.articolo.ArticoloDAO;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;

public interface ArticoloService {

	public List<Articolo> listAll() throws Exception;

	public Articolo caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Articolo articoloInstance) throws Exception;

	public void inserisciNuovo(Articolo articoloInstance) throws Exception;

	public void rimuovi(Articolo articoloInstance) throws Exception;

	public void aggiungiCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;
	
	public void nuovoArticoloConCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;
	
	public List<Articolo> cercaArticoloPerCategoria(Categoria categoriaInput);


	// per injection
	public void setArticoloDAO(ArticoloDAO articoloDAO);
	
}

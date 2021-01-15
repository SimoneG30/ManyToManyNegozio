package it.prova.manytomanynegozio.service.ordine;

import java.util.List;

import it.prova.manytomanynegozio.dao.ordine.OrdineDAO;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public interface OrdineService {

	public List<Ordine> listAll() throws Exception;

	public Ordine caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Ordine ordineInstance) throws Exception;

	public void inserisciNuovo(Ordine ordineInstance) throws Exception;

	public void rimuovi(Ordine ordineInstance) throws Exception;
	
	public List<Ordine> findAllOrdiniByCategoria(Categoria categoriaInput) throws Exception;

	// per injection
	public void setOrdineDAO(OrdineDAO ordineDAO);
}

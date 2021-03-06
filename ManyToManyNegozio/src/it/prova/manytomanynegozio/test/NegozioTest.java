package it.prova.manytomanynegozio.test;

import java.util.List;

import it.prova.manytomanynegozio.dao.EntityManagerUtil;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;
import it.prova.manytomanynegozio.service.MyServiceFactory;
import it.prova.manytomanynegozio.service.articolo.ArticoloService;
import it.prova.manytomanynegozio.service.categoria.CategoriaService;
import it.prova.manytomanynegozio.service.ordine.OrdineService;

public class NegozioTest {

	public static void main(String[] args) {
		ArticoloService articoloServiceInstance = MyServiceFactory.getArticoloServiceInstance();
		CategoriaService categoriaServiceInstance = MyServiceFactory.getCategoriaServiceInstance();
		OrdineService ordineServiceInstance = MyServiceFactory.getOrdineServiceInstance();

		try {

			// ---------------------------------------------------------- ARTICOLO
			// ----------------------------------------------------------

			// INSERIMENTO ARTICOLO
//			System.out.println("\n INSERIMENTO ARTICOLO \n ");
//			Articolo nuovoArticolo = new Articolo("Processore AMD Ryzen 5 5600X", 389);
//			articoloServiceInstance.inserisciNuovo(nuovoArticolo);
//			if(articoloServiceInstance.caricaSingoloElemento(nuovoArticolo.getId()) != null)
//				System.out.println("Nuovo articolo inserito: "+nuovoArticolo);

			// AGGIUNGI CATEGORIA
//			Categoria categoriaDaDb = categoriaServiceInstance.caricaSingoloElemento(1L);;
//			Articolo articoloDaDb = articoloServiceInstance.caricaSingoloElemento(1L);
//			if (articoloDaDb != null) {
//				articoloServiceInstance.aggiungiCategoria(articoloDaDb, categoriaDaDb);
//			}

			// ARTICOLO CON CATEGORIA
//			System.out.println("\n NUOVO ARTICOLO CON CATEGORIA \n ");
//			Articolo articoloNuovo = new Articolo("Processore AMD Ryzen 7 5800X", 549);
//			articoloServiceInstance.inserisciNuovo(articoloNuovo);
//			Categoria categoriaPresaDaDb = categoriaServiceInstance.cercaCategoriePerDescrizione("Elettronica").get(0);
//			if (articoloNuovo != null) {
//				articoloServiceInstance.aggiungiCategoria(articoloNuovo, categoriaPresaDaDb);
//			}

			// LISTA ARTICOLI
//			System.out.println("\n LISTA ARTICOLI \n ");
//			for (Articolo articoloItem : articoloServiceInstance.listAll()) {
//				System.out.println(articoloItem);
//			}

			// UPDATE ARTICOLO
//			System.out.println("\n UPDATE ARTICOLO \n ");
//			Articolo articoloDaModificare = articoloServiceInstance.caricaSingoloElemento(2L);
//			if (articoloDaModificare != null) {
//				System.out.println("descrizione attuale dell'articolo: " + articoloDaModificare.getDescrizione());
//				String nuovaDescrizione = "Processore AMD Ryzen 5 5600X (6C/12T, 35MB di cache, fino a 4,6 GHz Max Boost)";
//				articoloDaModificare.setDescrizione(nuovaDescrizione);
//				articoloServiceInstance.aggiorna(articoloDaModificare);
//				System.out.println("descrizione aggiornata dell'articolo: " + articoloDaModificare.getDescrizione());
//			}

			// RIMOZIONE ARTICOLO
//			System.out.println("\n RIMOZIONE ARTICOLO \n ");
//			Articolo articoloPresoDaDb = articoloServiceInstance.caricaSingoloElemento(2L);
//			if (articoloPresoDaDb != null) {
//				articoloServiceInstance.rimuovi(articoloPresoDaDb);
//			}

			// ---------------------------------------------------------- CATEGORIA
			// ----------------------------------------------------------

			// INSERIMENTO CATEGORIA
//			System.out.println("\n INSERIMENTO CATEGORIA \n ");
//			Categoria nuovaCategoria = new Categoria("Elettronica");
//			categoriaServiceInstance.inserisciNuovo(nuovaCategoria);
//			if(categoriaServiceInstance.caricaSingoloElemento(nuovaCategoria.getId()) != null)
//				System.out.println("Nuova categoria inserita: "+nuovaCategoria);

			// LISTA CATEGORIE
//			System.out.println("\n LISTA CATEGORIE \n ");
//			for (Categoria categoriaItem : categoriaServiceInstance.listAll()) {
//				System.out.println(categoriaItem);
//			}

			// UPDATE CATEGORIA
//			System.out.println("\n UPDATE CATEGORIA \n ");
//			Categoria categoriaDaModificare = categoriaServiceInstance.caricaSingoloElemento(2L);
//			if (categoriaDaModificare != null) {
//				System.out.println("descrizione attuale della categoria: " + categoriaDaModificare.getDescrizione());
//				String nuovaDescrizione = "Informatica";
//				categoriaDaModificare.setDescrizione(nuovaDescrizione);
//				categoriaServiceInstance.aggiorna(categoriaDaModificare);
//				System.out.println("descrizione aggiornata della categoria: " + categoriaDaModificare.getDescrizione());
//			}

			// RIMOZIONE CATEGORIA
//			System.out.println("\n RIMOZIONE CATEGORIA \n ");
//			Categoria categoriaPresaDaDb = categoriaServiceInstance.caricaSingoloElemento(2L);
//			if (categoriaPresaDaDb != null) {
//				categoriaServiceInstance.rimuovi(categoriaPresaDaDb);
//			}

			// ---------------------------------------------------------- ORDINE
			// ----------------------------------------------------------

			// INSERIMENTO ORDINE
//			System.out.println("\n INSERIMENTO ORDINE \n ");
//			Ordine nuovoOrdine = new Ordine("Mario Rossi", "Via Roma 1");
//			ordineServiceInstance.inserisciNuovo(nuovoOrdine);
//			if(ordineServiceInstance.caricaSingoloElemento(nuovoOrdine.getId()) != null)
//				System.out.println("Nuovo ordine inserito: "+nuovoOrdine);

			// AGGIUNGI AD ARTICOLO
//			System.out.println("\n AGGIUNGI AD ARTICOLO \n ");

			// LISTA ORDINI
//			System.out.println("\n LISTA ORDINI \n ");
//			for (Ordine ordineItem : ordineServiceInstance.listAll()) {
//				System.out.println(ordineItem);
//			}

			// RIMOZIONE ORDINE
//			System.out.println("\n RIMOZIONE ORDINE \n ");
//			Ordine ordinePresoDaDb = ordineServiceInstance.caricaSingoloElemento(2L);
//			if (ordinePresoDaDb != null) {
//				ordineServiceInstance.rimuovi(ordinePresoDaDb);
//			}

			// ORDINI EFFETTUATI DATA UNA CATEGORIA
//			System.out.println("\n ORDINI EFFETTUATI DATA UNA CATEGORIA \n ");
//			List<Ordine> listaOrdini = ordineServiceInstance.findAllOrdiniByCategoria(categoriaServiceInstance.caricaSingoloElemento(1L));
//			for (Ordine ordineItem : listaOrdini) {
//				System.out.println(ordineItem);
//			}
			
			// CATEGORIE DEGLI ARTICOLI DI UN DATO ORDINE
//			System.out.println("\n CATEGORIE DEGLI ARTICOLI DI UN DATO ORDINE \n ");
//			List<Categoria> listaCategorie = categoriaServiceInstance
//					.trovaTutteLeCategorieDaOrdine(ordineServiceInstance.caricaSingoloElemento(1L));
//			for (Categoria categoriaItem : listaCategorie) {
//				System.out.println(categoriaItem);
//			}
			
			// SOMMA PREZZI DEGLI ARTICOLI DI UNA DATA CATEGORIA
			System.out.println("\n SOMMA PREZZI DEGLI ARTICOLI DI UNA DATA CATEGORIA \n ");
			Integer somma = articoloServiceInstance.sommaPrezziArticoliConCategoria(categoriaServiceInstance.caricaSingoloElemento(1L)).intValue();
			System.out.println("Somma prezzi articoli: " + somma);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			EntityManagerUtil.shutdown();
		}

	}

}

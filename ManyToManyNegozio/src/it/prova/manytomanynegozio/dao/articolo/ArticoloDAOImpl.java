package it.prova.manytomanynegozio.dao.articolo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public class ArticoloDAOImpl implements ArticoloDAO{
	
	private EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	public List<Articolo> list() throws Exception {
		return entityManager.createQuery("from Articolo", Articolo.class).getResultList();
	}

	@Override
	public Articolo get(Long id) throws Exception {
		return entityManager.find(Articolo.class, id);
	}

	@Override
	public void update(Articolo articoloInput) throws Exception {
		if (articoloInput == null) {
			throw new Exception("Problema valore in input");
		}
		articoloInput = entityManager.merge(articoloInput);
	}

	@Override
	public void insert(Articolo articoloInput) throws Exception {
		if (articoloInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(articoloInput);
	}


	@Override
	public void delete(Articolo articoloInput) throws Exception {
		if (articoloInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(articoloInput));
	}

	@Override
	public List<Articolo> findAllByCategoria(Categoria categoriaInput) {
		TypedQuery<Articolo> query = entityManager.createQuery("select a FROM Articolo a join a.categorie c where c = :categoria",Articolo.class);
		query.setParameter("categoria", categoriaInput);
		return query.getResultList();
	}

	@Override
	public List<Articolo> findAllByOrdine(Ordine ordineInput) {
		TypedQuery<Articolo> query = entityManager.createQuery("select a FROM Articolo a join a.ordini o where o = :ordine",Articolo.class);
		query.setParameter("ordine", ordineInput);
		return query.getResultList();
	}


	@Override
	public List<Articolo> findAllByDescrizione(String descrizioneInput) {
		TypedQuery<Articolo> query = entityManager.createQuery("from Articolo a where a.descrizione = ?1", Articolo.class);
		return query.setParameter(1, descrizioneInput).getResultList();
	}


	@Override
	public Long sumAllByCategoria(Categoria categoriaInput) {
		TypedQuery<Long> query = entityManager.createQuery("select sum(a.prezzoSingolo) FROM Articolo a join a.categorie c where c = :categoria",Long.class);
		query.setParameter("categoria", categoriaInput);
		return query.getSingleResult();
	}
	
	
	
	
	
	
	
}

package it.prova.manytomanynegozio.dao.ordine;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;
import it.prova.manytomanynegozio.model.Ordine;

public class OrdineDAOImpl implements OrdineDAO {

	private EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Ordine> list() throws Exception {
		return entityManager.createQuery("from Ordine", Ordine.class).getResultList();
	}

	@Override
	public Ordine get(Long id) throws Exception {
		return entityManager.find(Ordine.class, id);
	}

	@Override
	public void update(Ordine ordineInput) throws Exception {
		if (ordineInput == null) {
			throw new Exception("Problema valore in input");
		}
		ordineInput = entityManager.merge(ordineInput);
	}

	@Override
	public void insert(Ordine ordineInput) throws Exception {
		if (ordineInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(ordineInput);
	}

	@Override
	public void delete(Ordine ordineInput) throws Exception {
		if (ordineInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(ordineInput));
	}

	@Override
	public List<Ordine> findAllOrdiniByCategoria(Categoria categoriaInput) {
		TypedQuery<Ordine> query = entityManager.createQuery("select o FROM Ordine o left join fetch o.articoli a left join fetch a.categorie c where c = :categoria",Ordine.class);
		query.setParameter("categoria", categoriaInput);
		return query.getResultList();
	}

}

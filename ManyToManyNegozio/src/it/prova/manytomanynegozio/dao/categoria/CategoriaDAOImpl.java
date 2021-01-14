package it.prova.manytomanynegozio.dao.categoria;

import java.util.List;

import javax.persistence.EntityManager;
import it.prova.manytomanynegozio.model.Categoria;

public class CategoriaDAOImpl implements CategoriaDAO {

	private EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Categoria> list() throws Exception {
		return entityManager.createQuery("from Categoria", Categoria.class).getResultList();
	}

	@Override
	public Categoria get(Long id) throws Exception {
		return entityManager.find(Categoria.class, id);
	}

	@Override
	public void update(Categoria categoriaInput) throws Exception {
		if (categoriaInput == null) {
			throw new Exception("Problema valore in input");
		}
		categoriaInput = entityManager.merge(categoriaInput);
	}

	@Override
	public void insert(Categoria categoriaInput) throws Exception {
		if (categoriaInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(categoriaInput);
	}

	@Override
	public void delete(Categoria categoriaInput) throws Exception {
		if (categoriaInput == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(categoriaInput));
	}



}

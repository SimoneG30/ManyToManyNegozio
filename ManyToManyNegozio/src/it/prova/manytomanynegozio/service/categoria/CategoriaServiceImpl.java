package it.prova.manytomanynegozio.service.categoria;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.manytomanynegozio.dao.EntityManagerUtil;
import it.prova.manytomanynegozio.dao.categoria.CategoriaDAO;
import it.prova.manytomanynegozio.model.Articolo;
import it.prova.manytomanynegozio.model.Categoria;

public class CategoriaServiceImpl implements CategoriaService {

	private CategoriaDAO categoriaDAO;

	@Override
	public void setCategoriaDAO(CategoriaDAO categoriaDAO) {
		this.categoriaDAO = categoriaDAO;
	}

	@Override
	public List<Categoria> listAll() throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			categoriaDAO.setEntityManager(entityManager);
			return categoriaDAO.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Categoria caricaSingoloElemento(Long id) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			categoriaDAO.setEntityManager(entityManager);
			return categoriaDAO.get(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void aggiorna(Categoria categoriaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			categoriaDAO.setEntityManager(entityManager);
			categoriaDAO.update(categoriaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void inserisciNuovo(Categoria categoriaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			categoriaDAO.setEntityManager(entityManager);
			categoriaDAO.insert(categoriaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void rimuovi(Categoria categoriaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();
			categoriaDAO.setEntityManager(entityManager);
			categoriaDAO.delete(categoriaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void aggiungiArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void nuovaCategoriaConArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Categoria> cercaCategoriaPerArticolo(Articolo articoloInput) {
		// TODO Auto-generated method stub
		return null;
	}

}

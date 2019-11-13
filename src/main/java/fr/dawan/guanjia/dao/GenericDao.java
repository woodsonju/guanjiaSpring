package fr.dawan.guanjia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.dawan.guanjia.entities.DbObject;

/**
 * 
 * @author w.juste
 *	Create des méthodes simples create, delete, update, findById
 */
public class GenericDao {
	
	public static <T extends DbObject> T create(T entity) {
		if(entity.getId() == 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			try {
				entityTransaction.begin();
				entityManager.persist(entity);
				entityTransaction.commit();
			} catch (Exception e) {
				entityTransaction.rollback();
				e.printStackTrace();
			} finally {
				entityManager.close();
			}
		}
		return entity;
	}
	
	public static <T extends DbObject> T findById(Class<T> clazz, long id) {
		EntityManager entityManager = createEntityManager();
		T entity = null;
		try {
			entity = entityManager.find(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}
		return entity;
	}

	
	public static EntityManager createEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("guanjiajpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}

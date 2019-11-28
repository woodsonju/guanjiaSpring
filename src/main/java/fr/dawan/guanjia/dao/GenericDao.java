package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

	
	public static <T extends DbObject> void update(T entity) {
		//Controle : On fait un update sur un id existant
		if(entity.getId() > 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			try {
				//Début de la transaction
				entityTransaction.begin();
				entityManager.merge(entity);
				//On commit tout ce qui s'est fait dans la transaction
				entityTransaction.commit();
			} catch (Exception e) {
				//En cas D'erreur on effectue un rollback
				entityTransaction.rollback();
				e.printStackTrace();
			}  finally {
				entityManager.close();

			}
		}
	}


	public static <T extends DbObject> void delete(Class<T> clazz, long id) {
		EntityManager entityManager = createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			//Début de la transaction
			entityTransaction.begin();
			T entity = entityManager.find(clazz, id);
			entityManager.remove(entity);
			//On commit tout ce qui s'est fait dans la transaction
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			//En cas D'erreur on effectue un rollback
			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	
	public static<T extends DbObject> List<T> findAll(Class<T> clazz) {
		List<T> resultat = null;
		EntityManager em = createEntityManager();
		//On crée la requête
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);
		
		//On execute la requête et on récupèe le resultat
		resultat = query.getResultList();
		
		em.close();
		
		return resultat;
	}
	
	public static<T extends DbObject> void deleteAll(Class<T> clazz) {
		
		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Query query = em.createQuery("Delete FROM" + clazz.getName());
		query.executeUpdate();
		
		transaction.commit();
		em.close();
	}
	
	
	
	public static EntityManager createEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("guanjiajpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}

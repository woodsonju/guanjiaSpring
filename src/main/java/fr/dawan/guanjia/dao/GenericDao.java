package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.guanjia.entities.DbObject;

/**
 *
 * @author w.juste Create des méthodes simples create, delete, update, findById
 */
public class GenericDao {
	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public <T extends DbObject> T saveAndUpdate(T entity) {
		if (entity != null && entity.getId() == 0) {
			em.persist(entity);
		} else {
			em.merge(entity);
		}
		return entity;
	}

	@Transactional(readOnly = true)
	public <T extends DbObject> T find(long id, Class<T> clazz) {
		return em.find(clazz, id);
	}

	@Transactional(readOnly = true)
	public <T extends DbObject> List<T> findAll(Class<T> clazz) {
		TypedQuery<T> tq = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);
		return tq.getResultList();
	}

	@Transactional
	public <T extends DbObject> void delete(T entity) {
		em.remove(em.contains(entity) ? entity : em.merge(entity));
	}// public static <T extends DbObject> T create(T entity) {
//		if(entity != null && entity.getId() == 0) {
//			EntityManager entityManager = createEntityManager();
//			EntityTransaction entityTransaction = entityManager.getTransaction();
//			try {
//				entityTransaction.begin();
//				entityManager.persist(entity);
//				entityTransaction.commit();
//			} catch (Exception e) {
//				entityTransaction.rollback();
//				e.printStackTrace();
//			} finally {
//				entityManager.close();
//			}
//		}
//		return entity;
//	}
//	
//	public static <T extends DbObject> T findById(Class<T> clazz, long id) {
//		EntityManager entityManager = createEntityManager();
//		T entity = null;
//		try {
//			entity = entityManager.find(clazz, id);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			entityManager.close();
//
//		}
//		return entity;
//	}
//
//	
//	public static <T extends DbObject> void update(T entity) {
//		//Controle : On fait un update sur un id existant
//		if(entity.getId() > 0) {
//			EntityManager entityManager = createEntityManager();
//			EntityTransaction entityTransaction = entityManager.getTransaction();
//			try {
//				//Début de la transaction
//				entityTransaction.begin();
//				entityManager.merge(entity);
//				//On commit tout ce qui s'est fait dans la transaction
//				entityTransaction.commit();
//			} catch (Exception e) {
//				//En cas D'erreur on effectue un rollback
//				entityTransaction.rollback();
//				e.printStackTrace();
//			}  finally {
//				entityManager.close();
//
//			}
//		}
//	}
//
//
//	public static <T extends DbObject> void delete(Class<T> clazz, long id) {
//		EntityManager entityManager = createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		try {
//			//Début de la transaction
//			entityTransaction.begin();
//			T entity = entityManager.find(clazz, id);
//			entityManager.remove(entity);
//			//On commit tout ce qui s'est fait dans la transaction
//			entityTransaction.commit();
//			entityManager.close();
//		} catch (Exception e) {
//			//En cas D'erreur on effectue un rollback
//			entityTransaction.rollback();
//			e.printStackTrace();
//		} finally {
//			entityManager.close();
//		}
//	}
//
//	public static<T extends DbObject> void deleteAll(Class<T> clazz) {
//		EntityManager em = createEntityManager();
//		EntityTransaction transaction = em.getTransaction();
//		
//		transaction.begin();
//
//		//On crée la requête
//		Query query = em.createQuery("DELETE FROM " + clazz.getName());
//		
//		//On execute la requête et on récupèe le resultat
//		query.executeUpdate();
//		
//		transaction.commit();
//		em.close();
//	}
//	
//	public static<T extends DbObject> List<T> findAll(Class<T> clazz) {
//		List<T> resultat = null;
//		EntityManager em = createEntityManager();
//		//On crée la requête
//		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);
//		
//		//On execute la requête et on récupèe le resultat
//		resultat = query.getResultList();
//		
//		em.close();
//		
//		return resultat;
//	}
//	
//
//	public static EntityManager createEntityManager() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("guanjiajpa");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		return entityManager;
//	}
}
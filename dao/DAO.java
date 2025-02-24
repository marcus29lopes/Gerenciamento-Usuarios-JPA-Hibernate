package dao;

import Model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class DAO {
    private EntityManagerFactory entityManagerFactory;

    public DAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    // Adicionar (Create)
    public void saveUser(User user) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(user);  // Salvar usuário no banco
            transaction.commit();
            System.out.println("Usuário adicionado: " + user.getName());
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    // Alterar (Update)
    public void updateUser(User user) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(user);  // Atualiza o usuário no banco
            transaction.commit();
            System.out.println("Usuário atualizado: " + user.getName());
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    // Selecionar um usuário por ID
    public User getUserById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.find(User.class, id);  // Buscar usuário por ID
        } finally {
            em.close();
        }
    }

    // Selecionar todos os usuários
    public List<User> getAllUsers() {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.createQuery("from User", User.class).getResultList();  // Buscar todos os usuários
        } finally {
            em.close();
        }
    }
}

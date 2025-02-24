
import Model.User;
import dao.DAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("meu_persistence_unit");

        // Criando a implementação do DAO
        DAO userDao = new DAO(entityManagerFactory);

        // Adicionar um novo usuário
        User newUser = new User();
        newUser.setName("Marcus");
        newUser.setEmail("marcus@example.com");
        userDao.saveUser(newUser);

        // Alterar um usuário existente
        User existingUser = userDao.getUserById(1); // ID 1 como exemplo
        if (existingUser != null) {
            existingUser.setName("Marcus Alterado");
            userDao.updateUser(existingUser);
        }

        // Selecionar um usuário por ID
        User selectedUser = userDao.getUserById(1);
        if (selectedUser != null) {
            System.out.println("Usuário encontrado: " + selectedUser.getName());
        }

        // Selecionar todos os usuários
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println("Usuário: " + user.getName());
        }

        entityManagerFactory.close();
    }
}





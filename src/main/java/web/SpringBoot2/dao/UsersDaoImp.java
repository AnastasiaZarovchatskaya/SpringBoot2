package web.SpringBoot2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import web.SpringBoot2.model.User;

import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    @Override
    public List<User> index() {
        return entityManager.createQuery("select p from User p", User.class)
                .getResultList();
    }

    @Transactional
    @Override
    public User show(int id) {
        return entityManager.find(User.class,id);
    }

    @Transactional
    @Override
    public void save(User user) {
        entityManager.persist(user);

    }

    @Transactional
    @Override
    public void update(User updatedUsers) {
        entityManager.merge(updatedUsers);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
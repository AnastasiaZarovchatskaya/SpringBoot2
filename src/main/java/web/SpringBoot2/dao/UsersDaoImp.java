package web.SpringBoot2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.SpringBoot2.model.User;
import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> index() {
        return entityManager.createQuery("select p from User p", User.class)
                .getResultList();
    }

    @Override
    public User show(Long id) {
        return entityManager.find(User.class,id);
    }


    @Override
    public void save(User user) {
        entityManager.persist(user);

    }

    @Override
    public void update(User updatedUsers) {
        entityManager.merge(updatedUsers);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
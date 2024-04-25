package web.SpringBoot2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.SpringBoot2.dao.UsersDao;
import web.SpringBoot2.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UsersDao usersDao;
    @Autowired
    public UserServiceImp(UsersDao usersDao) {
        this.usersDao = usersDao;
    }
    @Transactional
    @Override
    public List<User> index(){
        return usersDao.index();
    }
    @Transactional
    @Override
    public User show(Long id){
        return usersDao.show(id);
    }

    @Transactional
    @Override
    public void save(User user){
        usersDao.save(user);
    }

    @Transactional
    @Override
    public void update(User updatedUsers){
        usersDao.update(updatedUsers);
    }

    @Transactional
    @Override
    public void delete(Long id){
        usersDao.delete(id);
    }
}

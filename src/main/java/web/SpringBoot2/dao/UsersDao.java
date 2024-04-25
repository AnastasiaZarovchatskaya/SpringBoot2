package web.SpringBoot2.dao;



import web.SpringBoot2.model.User;

import java.util.List;

public interface UsersDao {
     List<User> index();
     User show(int id);
     void save(User user);
     void update(User updatedUsers);
     void delete(int id);




}

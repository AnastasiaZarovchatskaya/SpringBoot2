package web.SpringBoot2.service;



import web.SpringBoot2.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(Long id);
    void save(User user);
    void update(User updatedUsers);
    void delete(Long id);
}

package com.service;

import com.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/*import com.model.User;*/

/**
 * Created by gjy on 2016/1/11.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private JdbcTemplate jdbcTemplate;
/*    public User addUser(User user){
       jdbcTemplate.update("insert into user VALUES (NULL,?,?)",user.getName(),user.getPassword());
        userDAO.addEntity(user);
        return  user;
    }*/
}

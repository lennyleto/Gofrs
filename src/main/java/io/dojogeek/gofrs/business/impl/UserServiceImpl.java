package io.dojogeek.gofrs.business.impl;

import io.dojogeek.gofrs.business.UserService;
import io.dojogeek.gofrs.business.mapper.UserMapper;
import io.dojogeek.gofrs.dao.UserDao;
import io.dojogeek.gofrs.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Irene on 4/13/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    @Qualifier("user-mapper")
    private UserMapper userMapper;

    public User createUser(User user) {
        return userMapper.mapToOuter(userDao.createUser(userMapper.mapToInner(user)));
    }

    public List<User> getUserById(String id) {
        return userMapper.mapUserList(userDao.getUserById(id));
    }

    public User updateUser(String id, User user) {
        user.setId(Integer.parseInt(id));
        return userMapper.mapToOuter(userDao.updateUser(userMapper.mapToInner(user)));
    }
}

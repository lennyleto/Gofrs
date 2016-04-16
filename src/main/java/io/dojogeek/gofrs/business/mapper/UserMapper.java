package io.dojogeek.gofrs.business.mapper;

import io.dojogeek.gofrs.dao.models.UserModel;
import io.dojogeek.gofrs.rest.entities.User;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irene on 4/14/16.
 */
@Component("user-mapper")
public class UserMapper {

    public UserModel mapToInner(User user) {
        Mapper mapper = new DozerBeanMapper();
        UserModel userModel = mapper.map(user, UserModel.class);
        return userModel;
    }

    public User mapToOuter(UserModel userModel) {
        Mapper mapper = new DozerBeanMapper();
        User user = mapper.map(userModel, User.class);
        return user;
    }

    public List<User> mapUserList(List<UserModel> userModels) {
        List<User> userList = new ArrayList<User>();
        for (UserModel userModel : userModels) {
            userList.add(mapToOuter(userModel));
        }
        return userList;
    }
}

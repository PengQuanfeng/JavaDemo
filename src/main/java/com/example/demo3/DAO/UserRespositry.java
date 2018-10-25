package com.example.demo3.DAO;

import com.example.demo3.Domain.IUserRespositry;
import com.example.demo3.Domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRespositry implements IUserRespositry {
    private static Map<String, User> map = new HashMap<>();

    @Override
    public User AddUser(User user) {
        map.put(user.getId().toString(), user);
        return user;
    }

    @Override
    public User FindUserById(Long id) {
        User user = map.get(id.toString());
        return user;
    }

    @Override
    public User UpdateUser(Long id, String name) throws Exception {
        User user = map.get(id.toString());
        if (user == null) {
            throw new Exception("出现错误.");
        }

        user.setName(name);

        return user;
    }

    @Override
    public User DeleteUser(Long id) throws Exception {
        User user = map.get(id.toString());
        if (user == null) {
            throw new Exception("出现错误.");
        }
        map.remove(id.toString());

        return user;
    }
}

package com.example.demo3.Services;

import com.example.demo3.DAO.UserMapper;
import com.example.demo3.Domain.IUserRespositry;
import com.example.demo3.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements  IUserService {
    @Autowired
    private UserMapper userRespositry;

    @Override
    public Integer AddUser(User user)
    {
         return this .userRespositry.AddUser(user);
    }

    @Override
    public  User FindUserById(Long id)
    {
        return  this .userRespositry.FindUserById(id);
    }

    @Override
    public void UpdateUser(Long id,String name)throws Exception
    {
        User user=new User();
        user.setId(id);
        user.setName(name);

         this .userRespositry.UpdateUser(user);
    }

    @Override
    public  void DeleteUser(Long id)throws Exception
    {
        this .userRespositry.DeleteUser(id);
    }
}

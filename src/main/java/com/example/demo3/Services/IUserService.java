package com.example.demo3.Services;

import com.example.demo3.Domain.User;

public interface IUserService {
    Integer AddUser(User user);

    User FindUserById(Long id);

    void UpdateUser(Long id,String name)throws Exception;

    void DeleteUser(Long id)throws Exception;
}

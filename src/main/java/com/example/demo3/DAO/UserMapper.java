package com.example.demo3.DAO;

import com.example.demo3.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper  {
    Integer AddUser(@Param("user") User user);

    User FindUserById(@Param("id") Long id);

    void UpdateUser(@Param("user") User user) throws Exception;

    void DeleteUser(@Param("id") Long id) throws Exception;
}

package com.example.demo3.Domain;

import org.mapstruct.Mapper;

@Mapper
public interface IUserRespositry {

    User AddUser(User user);

    User FindUserById(Long id);

    User UpdateUser(Long id,String name) throws Exception;

    User DeleteUser(Long id)throws Exception;
}

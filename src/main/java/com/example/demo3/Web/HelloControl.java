package com.example.demo3.Web;

import com.example.demo3.Domain.User;
import com.example.demo3.Services.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("HelloControl相关的api")
public class HelloControl {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/Users",method = RequestMethod.POST)
    @ApiOperation(value = "AddUser", notes = "添加用户")
    public User AddUser(@RequestBody User user)
    {
        userService.AddUser(user);
        return  user;
    }

    @RequestMapping(value = "/Users/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "DeleteUser", notes = "删除用户")
    public void DeleteUser(@PathVariable Long id)throws Exception
    {
        userService.DeleteUser(id);
    }

    @RequestMapping(value = "/Users/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "FindUserById", notes = "查找用户")
    public User FindUserById(@PathVariable Long id)
    {
        return  userService.FindUserById(id);
    }

    @RequestMapping(value = "/Users/{id}/{name}",method = RequestMethod.PUT)
    @ApiOperation(value = "UpdateUser", notes = "更新用户")
    public void UpdateUser(@PathVariable Long id,@PathVariable String name)throws Exception
    {
        userService.UpdateUser(id,name);
    }
}

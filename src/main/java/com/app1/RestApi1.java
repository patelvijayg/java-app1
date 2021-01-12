package com.app1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class RestApi1
{

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getdata()
    {
        System.out.println("find all user");
        return  userService.getallUsers();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Users getOneUser(@PathVariable Integer id)
    {
        System.out.println("find one user");
        return  userService.findOneUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public Users adduser(@RequestBody Users user)
    {
        System.out.println("added user ("+user+")");
        return  userService.addUser(user);
    }    

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteuser(@PathVariable Integer id)
    {
        System.out.println("deleting user ("+ id +")");
         userService.deletUsers(id);
    }    

    @RequestMapping(value = "/users/fakedata", method = RequestMethod.GET)
    public List<Users> fakeData()
    {
        System.out.println("Fake data is creating");
        
        return userService.createFakeData();

    }    

    

}
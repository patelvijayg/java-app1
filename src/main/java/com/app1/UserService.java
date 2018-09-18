package com.app1;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class UserService
{
 List<Users> data=Arrays.asList(new Users(1,"a",10),new Users(2,"b",20));

 public List<Users> getUsers()
 {
     return data;
 }
}
package com.app1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public Users findOneUser(Integer id){
     
        return userRepository.findById(id).get();
 }
    
    public List<Users> getallUsers(){
     
        return (List<Users>) userRepository.findAll();
 }

 public Users addUser(Users user){
    Users u=userRepository.save(user);
    return u;
 }

 public void deletUsers(Integer id) {
    Optional<Users> user=userRepository.findById(id);
    userRepository.delete(user.get());
    System.out.println("user has been deleted");
 }

 public List<Users> createFakeData()
 {
    List<Users> data=Arrays.asList(new Users(101,"aa",11),new Users(102,"bb",12),new Users(103,"cc",13)) ;
    data.forEach(this::addUser);
    return data;
 }
}
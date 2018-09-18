package com.app1;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect (fieldVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
public class Users implements java.io.Serializable 
{

    private static final long serialVersionUID = 1866149547838935366L;

    @Getter @Setter @Id
    private Integer id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer age;

    public Users(){
        
    }
    public Users(Integer id,String name, Integer age ) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

   
    public String toString(){
        return "" + id + " " + name + " "  + age;
    }

}
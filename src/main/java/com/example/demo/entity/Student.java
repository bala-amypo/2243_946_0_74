package com.example.demo.entity;
import jakarta.persistence.*; 

@Entity
public class Student {
    private long id;
    private String name;
    private String email;
    private float cgpa;

public long getId(){
    return id;
} 
public void setId(Long id){
    this.id = id;

}
public String getname(){
    return name ;

}
public void getname(String name){
    this.name = name ;
}
public String getemal(){
    return email;

}
public void getemail(String email){
    this.email=email;
}


public float getcgpa(){
    return cgpa;
}
public void getcgpa(float cgpa ){
    this.cgpa=cgpa;
}

public Student (Long id,String name,String email,float cgpa){
    this.id=id;
    this.name =name;
    this.email=email;
    this.cgpa=cgpa;
}

public Student(){}
}
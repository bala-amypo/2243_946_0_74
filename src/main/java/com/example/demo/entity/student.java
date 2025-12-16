impory jakarta.persistance.*; 

public class Student {
    private long id;
    private String name;
    private String email;
    private float cgpa;
}


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

public student ()

package org.example;

public class Author {
    public String name, sex, email;

    public Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getAuthorname(){
        return this.name;
    }
    public String getAuthorsex(){
        return this.sex;
    }
    public String getAuthoremail(){
        return this.email;
    }

    public void setAuthorname(String name){
        this.name = name;
    }
    public void setAuthorsex(String sex){
        this.sex = sex;
    }
    public void setAuthoremail(String email){
        this.email = email;
    }


}

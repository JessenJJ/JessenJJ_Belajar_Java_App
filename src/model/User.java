package model;

import java.time.LocalDateTime;

import javax.management.RuntimeErrorException;

public class User {
    //attribute: public, protected, default, private
    public String username = "jessnpm";
    //protected: bisa diakses oleh package yang sama atau turunan kelasnya
    protected String fname = "jessen";
    //default / def  / tanpa modif
    String lname = "verogonisa";
    LocalDateTime timestamp = LocalDateTime.now();
    //private modifier: hanya dapat diakses class sendiri
    private String email;

    public void setEmail(String email){
        if(email == null || email == ""){
            throw new RuntimeException("runtime error karena email anda kosong");
        }
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    protected void greeting(){
        System.out.println("hehehe");
    }

    public static void main(String[] args) {

    }
}


//default / tanpa modifier: bisa diakses dari package yang sama
class Detailuser{

}
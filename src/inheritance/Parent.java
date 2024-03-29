package inheritance;

/*
 * inhertanca: suatu class bisa mewariskan 
 * attribut dan method ke class yang baru
 * 
 * 1. Sesama jenis, antar class atau antar interface:extends
 * 2. interface ke class: implements
 */
public class Parent {
    //attr class
    private String fname;
    private String lname;
    private String kname;
    private static final String _VERSION = "versi1.233";

    public Parent(String namaDepan,String namaBelakang){
        this.fname = namaDepan;
        this.lname = namaBelakang;
  
    }
    public Parent(){
        
    };


    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getKname() {
        return kname;
    }
    public void setKname(Object kname) {
        this.kname = (String)kname;
    }
    
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFullname(){
        return this.fname + " " + lname;
    }

public static void getVersion(){
    System.out.println("ini versi: " + _VERSION);

    

    }

}


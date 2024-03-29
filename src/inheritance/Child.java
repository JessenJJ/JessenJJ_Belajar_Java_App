package inheritance;

public class Child extends Parent {
    private String gelar;

    /*
     * polymorphism:
     * 1. overload: di dalam kelas yang sama bisa diduplicate method, dengan dibedakan dari params
     * 2. override: menggunakan kembali method dari super class
     */

    public Child(){

    }
    

    public String getGelar() {
        return gelar;
    }

    public Child(String gelar,String namaDepan,String namaBelakang) {
        super(namaDepan,namaBelakang);
        this.gelar = gelar;
    }


    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    //contoh override
    @Override
    public String getFullname(){
        return super.getFullname() + ", " + this.gelar;
    }

}

package inheritance;

public class Main {
    /*
     * 1. statick: attribut/method dipanggil dari class
     * 2. non static: attribut/method dipanggil dari object
     */
    public static void main(String[] args) {
        //instance object dari parent class
        //Class object = new constructor
        //method khusus untuk assign attribut saat instance object
        Parent parent = new Parent();
        parent.setFname("jess");
        parent.setLname("jie");
        System.out.println(parent);
        System.out.println(parent.getFullname());

        parent = new Parent("alter","jesssss");
        System.out.println(parent);
        System.out.println(parent.getFullname());

        Child child = new Child("sarjana", "jess", "belakang");
        // child.setFname("gg sekarang");
        child.setKname("gg belakang");
        System.out.println(child.getFullname());
        System.out.println(child.getGelar());

        GrandChild grandChild = new GrandChild();
    }
}

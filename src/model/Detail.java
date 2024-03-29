package model;

public class Detail {
    public static void main(String[] args) {
        User user = new User();
        user.fname = "ajnegn jess";
        // System.out.println(user.fname);
        user.setEmail("jess@gmail.com");
        System.out.println(user.getEmail());
        String email = user.getEmail();
        System.out.println(email);
        System.out.println(user.fname + " tambah "+ user.lname);
        System.out.println(user.timestamp);



    }

}

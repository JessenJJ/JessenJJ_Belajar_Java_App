import model.User;

import java.util.Scanner;

import inheritance.Child;

import model.Detail;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User user = new User();
        Detail detail = new Detail();

        user.username = "jessnpmjj";
        System.out.println(user.username);

        // tipe data
        int angka = 123;
        String hello = "hello world";
        System.out.println(angka + " adalah value dari variable angka");

        Scanner scannersScanner = new Scanner(System.in);
        try{
            
            String opsi = scannersScanner.nextLine();
    
            System.out.println("Input opsi: ");
            switch (opsi) {
                case "A":
                    System.out.println("anda pilih opsi 1");
                    break;
                case "B":
                    System.out.println("anda pilih opsi 2");
                    break;
                case "C":
                    System.out.println("anda pilih opsi 3");
                    break;
                
            
                default:
                    break;
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally{
            scannersScanner.close();
        }




    }
}

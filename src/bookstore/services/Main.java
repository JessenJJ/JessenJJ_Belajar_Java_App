package bookstore.services;

import java.util.List;
import java.util.Scanner;

import abstraction.Lingkaran;
import abstraction.PersegiPanjang;
import abstraction.interfaces.BangunDatar;
import bookstore.dao.BookDao;
import bookstore.models.Book;
import bookstore.services.book.BookService;
import bookstore.services.book.BookServiceImpl;

public class Main {
    static BookDao bookRepo = new BookDao();
    static BookService bookService = new BookServiceImpl(bookRepo);




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        Boolean retry = true;
        try {
            while(retry){
                System.out.println("""
                        ==== Shape Menu ====
                        1. CREATE BOOK
                        2. SEE ALL YOUR BOOOOKS
                        3. BESAR PP
                        """);
                        System.out.println("Input pilihan : ");

                        selected = scanner.nextLine();

                        switch(selected){

                            case "1":
                                System.out.println("===  CREATE BUKU ===");
                                System.out.println("Input Title : ");
                                String title = scanner.nextLine(); 
                                
                                System.out.println("Input Description : ");
                                String desc = String.valueOf(scanner.nextLine());
                                System.out.println("Input Author : ");
                                String author = String.valueOf(scanner.nextLine());

                                Book b = new Book(title,desc,author);

                                //createbook

                                bookService.createBook(b);
                                
                                System.out.println("Books added !!!!");

                               
                                
                                break;
                            case "2":
                                System.out.println("=== ALL BOOKS IS HERE ===");
                                System.out.println(bookService.showBooks());
                                List<Book>results = bookService.showBooks();
                                int index = 1;
                                for(Book item : results){
                                    System.out.println(index + ". " + item);
                                    index++;
                                }
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("error maybe?");
                                break;

                        }

                        while(true){
                            System.out.println("ingin keluar program ga lu cok? (y/n)");
                            String ans = scanner.nextLine();
                            if(ans.equalsIgnoreCase("y")){
                                retry = false;
                                break;
                            }else if(ans.equalsIgnoreCase("n")){
                                break;
                            }else{
                                System.out.println("Input salah cok");
                                continue;
                            }
                        }
            
            }
            while(retry){
                System.out.println("""
                        ==== Shape Menu ====
                        1. PERSEGI PANJANG
                        """);
                        System.out.println("Input pilihan : ");

                        selected = scanner.nextLine();

                        switch(selected){
                            case "1":
                                System.out.println("===  Persegi panjang ===");
                                System.out.println("Input panjang : ");
                                String panjang = String.valueOf(scanner.nextLine());
                                String lebar = String.valueOf(scanner.nextLine());

                                break;
                            case "2":

                                break;
                            case "3":
                                break;

                        }
            }
            System.out.println("Program Selesai...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally{
            scanner.close();
        }
    }
}

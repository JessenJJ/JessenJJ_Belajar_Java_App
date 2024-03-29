package abstraction;

import java.util.Scanner;

import abstraction.interfaces.BangunDatar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        Boolean retry = true;

        try {
            while(retry){
                System.out.println("""
                        ==== Shape Menu ====
                        1. PERSEGI PANJANG
                        2. LINGKARAN
                        3. LUAS PP
                        """);
                        System.out.println("Input pilihan : ");

                        selected = scanner.nextLine();

                        switch(selected){

                            case "1":
                                System.out.println("===  Persegi panjang ===");
                                System.out.println("Input panjang : ");
                                Double panjang = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Input lebar : ");
                                Double lebar = Double.valueOf(scanner.nextLine());

                                PersegiPanjang pp =  new PersegiPanjang(panjang, lebar);
                                BangunDatar persegip = new PersegiPanjang();
                                pp.drawShape();
                                

                                System.out.println("panjang anda : "+ pp.getPanjang());
                                System.out.println("lebar anda : " + pp.getLebar());
                                System.out.println("keliling anda : " + pp.getKeliling()); 
                                System.out.println("luas anda : " +  pp.getLuas());

                               
                                
                                break;
                            case "2":
                            System.out.println("===  Menu Lingkaran ===");
                            System.out.println("Input r atau radius : ");
                            Double r = scanner.nextDouble();
                            scanner.nextLine();

                            Lingkaran LL =  new Lingkaran(r);
                            LL.drawShape();

                            System.out.println("Radius anda : "+ LL.getR());
                            System.out.println("Keliling anda : " + LL.getKeliling()); 
                            System.out.println("Luas anda : " +  LL.getLuas());
                                break;
                            case "3":
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
           
            System.out.println("Program Selesai...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally{
            scanner.close();
        }
    }
}

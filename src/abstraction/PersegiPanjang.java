package abstraction;

import abstraction.interfaces.BangunDatar;

public class PersegiPanjang implements BangunDatar {
    //attribut
    private Double panjang;
    private Double lebar;

    //constructor
    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    

    public PersegiPanjang() {
    }

    //generate setter dan getter
    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }


    @Override
    public void characterShape() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void drawShape() {
        System.out.println("======== Bangun Persegi Panjang =======");
        for(int i = 0; i< this.panjang;i++){
            for(int j = 0;j<this.lebar;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    @Override
    public Double getKeliling() {
        // TODO Auto-generated method stub
        return (2 * this.panjang)+(2* this.lebar);
    }

    @Override
    public Double getLuas() {
        // TODO Auto-generated method stub
        return (this.panjang * this.lebar);
        
        
    }

    
    
}

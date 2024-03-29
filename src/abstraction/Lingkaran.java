package abstraction;

import abstraction.interfaces.BangunDatar;

public class Lingkaran implements BangunDatar{
    private double r;


    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void characterShape() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void drawShape() {
        // TODO Auto-generated method stub
        System.out.println("Ini adalah gambar lingakaran");
        System.out.println(" ** ");
        System.out.println("****");
        System.out.println(" **");

        
    }

    @Override
    public Double getKeliling() {
        // TODO Auto-generated method stub

        return 2*(Math.PI * r);
    }

    @Override
    public Double getLuas() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(this.r,2);
        }
    
}

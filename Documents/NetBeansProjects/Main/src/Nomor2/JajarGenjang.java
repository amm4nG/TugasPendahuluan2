/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author ARMAN
 */
public class JajarGenjang {

    //state 
    double alas, tinggi, sisiMiring;

    void printState(double alas, double tinggi, double sisiMiring) throws InterruptedException {

        //set value variable
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : alas   = " + this.alas);
        System.out.println("             tinggi = " + this.tinggi);
        System.out.println("             sisi miring = " + this.sisiMiring);
        System.out.println("===========================");
    }

    void hitungLuas(double alas, double tinggi) {

        //set value variable
        this.alas = alas;
        this.tinggi = tinggi;

        System.out.println("Luas Jajar Genjang = " + this.alas * this.tinggi);
    }

    void hitungKeliling(double alas, double sisiMiring) {

        //set value variable
        this.alas = alas;
        this.sisiMiring = sisiMiring;

        System.out.println("Keliling Jajar Genjang = " + 2 * (this.alas + this.sisiMiring));
    }
}

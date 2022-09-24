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
public class PersegiPanjang {

    //state
    double panjang, lebar;

    void printState(double panjang, double lebar) throws InterruptedException {

        //set value variable
        this.panjang = panjang;
        this.lebar = lebar;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : panjang = " + this.panjang);
        System.out.println("             lebar   = " + this.lebar);
        System.out.println("===========================");
    }

    void hitungLuas(double panjang, double lebar) {

        //set value variable
        this.panjang = panjang;
        this.lebar = lebar;

        System.out.println("Luas Persegi Panjang     = " + (this.panjang * this.lebar));
    }

    void hitungKeliling(double panjang, double lebar) {

        //set value variable
        this.panjang = panjang;
        this.lebar = lebar;

        System.out.println("Keliling Persegi Panjang = " + (2 * this.panjang + 2 * this.lebar));
    }
}

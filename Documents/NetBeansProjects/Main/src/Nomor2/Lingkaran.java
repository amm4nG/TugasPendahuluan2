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
public class Lingkaran {

    //state
    double r;
    double phi = 3.14;

    void printState(double r) throws InterruptedException {

        //set value variable
        this.r = r;
        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : Jari jari = " + this.r);
        System.out.println("           : Phi       = " + this.phi);
        System.out.println("===========================");
    }

    void hitungLuas(double r) {

        //set value variable
        this.r = r;

        System.out.println("Luas Lingkaran         = " + this.phi * Math.pow(this.r, 2));
    }

    void hitungKeliling(double r) {

        //set value variable
        this.r = r;

        System.out.println("Keliling Lingkaran     = " + 2 * this.phi * this.r);
    }
}

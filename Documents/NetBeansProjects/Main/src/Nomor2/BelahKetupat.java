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
public class BelahKetupat {

    double diagonal1, diagonal2, sisi;

    void printState(double diagonal1, double diagonal2, double sisi) throws InterruptedException {

        //set value variable
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : diagonal1 = " + this.diagonal1);
        System.out.println("             diagonal2 = " + this.diagonal2);
        System.out.println("             sisi      = " + this.sisi);
        System.out.println("===========================");
    }

    void hitungLuas(double diagonal1, double diagonal2) {

        //set value variable
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

        System.out.println("Luas Belah Ketupat = " + this.diagonal1 * this.diagonal2 / 2);
    }

    void hitungKeliling(double sisi) {

        //set value variable
        this.sisi = sisi;

        System.out.println("Keliling Belah Ketupat = " + 4 * this.sisi);
    }
}

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
public class Persegi {

    //state
    double sisi;

    void printState(double sisi) throws InterruptedException {

        //set value variable
        this.sisi = sisi;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : Panjang Sisi = " + this.sisi);
        System.out.println("===========================");
    }

    void hitungLuas(double panjangSisi) {

        //set value variable
        sisi = panjangSisi;

        System.out.println("Luas Persegi = " + (Math.pow(sisi, 2)));
    }

    void hitungKeliling(double sisi) {

        //set value variable
        this.sisi = sisi;

        System.out.println("Keliling Persegi = " + this.sisi * 4);
    }
}

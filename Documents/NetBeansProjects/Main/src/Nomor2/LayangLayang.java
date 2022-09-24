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
public class LayangLayang {

    double diagonal1, diagonal2, s1, s2, s3, s4;

    void printState(double diagonal1, double diagonal2, double s1, double s2, double s3, double s4) throws InterruptedException {

        //set value variable
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : diagonal1 = " + this.diagonal1);
        System.out.println("             diagonal2 = " + this.diagonal2);
        System.out.println("             sisi 1    = " + this.s1);
        System.out.println("             sisi 2    = " + this.s2);
        System.out.println("             sisi 3    = " + this.s3);
        System.out.println("             sisi 4    = " + this.s4);
        System.out.println("===========================");
    }

    void hitungLuas(double diagonal1, double diagonal2) {

        //set value variable
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

        System.out.println("Luas Layang Layang = " + this.diagonal1 * this.diagonal2 / 2);
    }

    void hitungKeliling(double s1, double s2, double s3, double s4) {

        //set value variable
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;

        System.out.println("Keliling Layang Layang = " + (this.s1 + this.s2 + this.s3 + this.s4));
    }
}

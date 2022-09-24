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
public class Trapesium {

    /*Catatan
    Jika sebuah trapesium memiliki tinggi "t" dan panjang sisi yang sejajar "a" dan "b", 
    maka luas trapesium (t) adalah L = 1/2 × t ( a + b ).*/
    //state
    double t, a, b, c, d;

    void printState(double t, double a, double b) throws InterruptedException {

        //set value variable
        this.t = t;
        this.a = a;
        this.b = b;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : Tinggi = " + this.t);
        System.out.println("           : Sisi sejajar a dan b = " + this.a + "dan " + this.b);
        System.out.println("===========================");
    }

    void hitungLuas(double t, double a, double b) {

        //set value variable
        this.t = t;
        this.a = a;
        this.b = b;
        
        System.out.println("Luas Trapesium = " + this.t / 2 * (this.a + this.b));
    }

    void hitungKeliling() {

        //untuk menghitung keliling trapesium, dan jika semua panjang sisinya diketahui seperti dibawah
        this.a = 4;
        this.b = 3;
        this.c = 5;
        this.d = 6;

        System.out.println("===========================");
        System.out.println("Untuk menghitung keliling trapesium ternyata sama saja dengan segi empat lainnya.");
        System.out.println("Yaitu menghitung semua kempat sisinya. Jadi rumus keliling trapesium ialah K = a + b + c + d.");
        
        System.out.println("Contohnya, jika terdapat trapesium ABCD dengan panjang sisinya adalah 6 cm, 5 cm, 4 cm, dan 3 cm, maka :");
        
        System.out.println("===========================");
        System.out.println("Keliling Trapesium = " + (this.a + this.b + this.c + this.d));
    }

}

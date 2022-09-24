/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author ARMAN
 */
public class Mobil {

    //state or field
    String warna;

    //behavior or method
    void maju(String warna) {
        this.warna = warna;
        System.out.println("Mobil Warna " + this.warna + " Silahkan Maju");
    }
}

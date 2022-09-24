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
public class Sapi {

    //state or field
    String jenis, warna;

    //behavior or method
    void tidur(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
        System.out.println("Sapi " + this.jenis + ", Warna " + this.warna + " Sedang Tidur");
    }
}

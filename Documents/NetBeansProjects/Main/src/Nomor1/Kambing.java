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
public class Kambing {

    //state or field
    String jenis, warna;

    //behavior or method
    void menangis(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
        System.out.println("Kambing " + this.jenis + ", Warna " + this.warna + " Sedang Menangis");
    }
}

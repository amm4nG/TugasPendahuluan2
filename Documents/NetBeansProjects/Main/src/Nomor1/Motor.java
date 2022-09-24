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
public class Motor {

    //state or field
    String warna;

    //behavior or method
    void mundur(String warna) {
        this.warna = warna;
        System.out.println("Motor Warna " + this.warna + " Silahkan Mundur");
    }
}

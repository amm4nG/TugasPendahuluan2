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
public class KipasAngin {

    //state or field
    String merek;

    //behavior or method
    void berputar(String merek) {
        this.merek = merek;
        System.out.println("Kipas " + this.merek + " Sedang Berputar");
    }
}

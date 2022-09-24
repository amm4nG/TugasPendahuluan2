package Nomor2;

public class Segitiga {

    //state
    double alas, tinggi;

    void printState(double alas, double tinggi) throws InterruptedException {

        //set value variable
        this.alas = alas;
        this.tinggi = tinggi;

        System.out.println("===========================");
        System.out.print("Processed...");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Diketahui  : alas   = " + this.alas);
        System.out.println("             tinggi = " + this.tinggi);
        System.out.println("===========================");
    }

    void hitungLuas(double alas, double tinggi) {

        //set value variable
        this.alas = alas;
        this.tinggi = tinggi;
        System.out.println("Luas Segitiga     : " + this.alas * this.tinggi / 2);
    }

    void hitungKeliling(double alas, double tinggi) {

        //set value variable
        this.alas = alas;
        this.tinggi = tinggi;

        //karena disini yang diketahui cuma alas dan tingginya maka kita harus mencari panjang sisinya
        double sisi = Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
        System.out.println("Keliling Segitiga : " + (this.alas + this.tinggi + sisi));
    }

}

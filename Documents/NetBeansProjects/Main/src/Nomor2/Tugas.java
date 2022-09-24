package Nomor2;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pengolahan Object Geometri");
        System.out.println("===========================");
        System.out.println("[1]. Segitiga");
        System.out.println("[2]. Persegi Panjang");
        System.out.println("[3]. Persegi");
        System.out.println("[4]. Lingkaran");
        System.out.println("[5]. Trapesium");
        System.out.println("[6]. Jajar Genjang");
        System.out.println("[7]. Belah Ketupat");
        System.out.println("[8]. Layang Layang");

        System.out.println("===========================");
        System.out.print("Pilih Menu : ");
        int opsi = scan.nextInt();

        //segitiga
        if (opsi == 1) {

            System.out.println("===========================");

            //enter your alas and tinggi segitiga
            System.out.print("alas   = ");
            double alas = scan.nextDouble();
            System.out.print("tinggi = ");
            double tinggi = scan.nextDouble();

            //create object
            Segitiga segitiga = new Segitiga();

            //call method in object
            segitiga.printState(alas, tinggi);
            segitiga.hitungLuas(alas, tinggi);
            segitiga.hitungKeliling(alas, tinggi);
        } //persegi panjang
        else if (opsi == 2) {

            System.out.println("===========================");

            //enter your long and wide persegi panjang
            System.out.print("panjang = ");
            double panjang = scan.nextDouble();
            System.out.print("lebar   = ");
            double lebar = scan.nextDouble();

            //create object
            PersegiPanjang persegiPanjang = new PersegiPanjang();

            //call method in object
            persegiPanjang.printState(panjang, lebar);
            persegiPanjang.hitungLuas(panjang, lebar);
            persegiPanjang.hitungKeliling(panjang, lebar);
        } //persegi
        else if (opsi == 3) {

            System.out.println("===========================");

            //enter your sisi persegi
            System.out.print("panjang sisi = ");
            double sisi = scan.nextDouble();

            //create object
            Persegi persegi = new Persegi();
            persegi.printState(sisi);
            persegi.hitungLuas(sisi);
            persegi.hitungKeliling(sisi);
        } //lingkaran
        else if (opsi == 4) {

            System.out.println("===========================");

            //enter your r lingkaran
            System.out.print("panjang jari jari = ");
            double r = scan.nextDouble();

            //create object
            Lingkaran lingkaran = new Lingkaran();

            //call object
            lingkaran.printState(r);
            lingkaran.hitungLuas(r);
            lingkaran.hitungKeliling(r);
        } //trapesium
        else if (opsi == 5) {

            System.out.println("===========================");

            //enter your t, a, b trapesium
            System.out.print("t = ");
            double t = scan.nextDouble();
            System.out.print("a = ");
            double a = scan.nextDouble();
            System.out.print("b = ");
            double b = scan.nextDouble();

            //create object
            Trapesium trapesium = new Trapesium();

            //call object
            trapesium.printState(t, a, b);
            trapesium.hitungLuas(t, a, b);
            trapesium.hitungKeliling();
        } //jajar genjang
        else if (opsi == 6) {

            System.out.println("===========================");

            //enter your alas and tinggi segitiga
            System.out.print("alas   = ");
            double alas = scan.nextDouble();
            System.out.print("tinggi = ");
            double tinggi = scan.nextDouble();
            System.out.print("sisi miring = ");
            double sisiMiring = scan.nextDouble();

            //create object 
            JajarGenjang jajarGenjang = new JajarGenjang();
            jajarGenjang.printState(alas, tinggi, sisiMiring);
            jajarGenjang.hitungLuas(alas, tinggi);
            jajarGenjang.hitungKeliling(alas, sisiMiring);
        } //belah ketupat
        else if (opsi == 7) {

            System.out.println("===========================");

            //enter your alas and tinggi segitiga
            System.out.print("diagonal 1 = ");
            double d1 = scan.nextDouble();
            System.out.print("diagonal 2 = ");
            double d2 = scan.nextDouble();
            System.out.print("sisi       = ");
            double sisi = scan.nextDouble();

            //create object
            BelahKetupat belahKetupat = new BelahKetupat();
            belahKetupat.printState(d1, d2, sisi);
            belahKetupat.hitungLuas(d1, d2);
            belahKetupat.hitungKeliling(sisi);
        } //layang layang
        else if (opsi == 8) {
            
            System.out.println("===========================");

            //enter your alas and tinggi segitiga
            System.out.print("diagonal 1 = ");
            double d1 = scan.nextDouble();
            System.out.print("diagonal 2 = ");
            double d2 = scan.nextDouble();
            System.out.print("sisi 1     = ");
            double s1 = scan.nextDouble();
            System.out.print("sisi 2     = ");
            double s2 = scan.nextDouble();
            System.out.print("sisi 3     = ");
            double s3 = scan.nextDouble();
            System.out.print("sisi 4     = ");
            double s4 = scan.nextDouble();
            
            //create object
            LayangLayang layangLayang = new LayangLayang();
            layangLayang.printState(d1, d2, s1, s2, s3, s4);
            layangLayang.hitungLuas(d1, d2);
            layangLayang.hitungKeliling(s1, s2, s3, s4);
        }
    }
}

package tugaspendahuluan;

import java.util.Scanner;

public class Nomor10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Size : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        boolean status = false;
        while (status == false) {
            for (int i = 0; i < size; i++) {

                System.out.print("Elemen " + i + " : ");
                int elemen = scan.nextInt();

                if (elemen == 1 || elemen == 0) {
                    status = true;
                    array[i] = elemen;
                } else {
                    status = false;
                    System.out.println("============================");
                    System.out.println("Inputan Hanya Boleh 1 atau 0");
                    System.out.println(" Masukkan Lagi Dengan Benar");
                    System.out.println("============================");
                    break;
                }
            }
        }
        if (status == true) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("+--");
            }
            System.out.println("+");

            for (int i = 0; i < array.length; i++) {
                System.out.print("|");
                if (array[i] == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println("|");

            for (int i = 0; i < array.length; i++) {
                System.out.print("+--");
            }
            System.out.println("+");
        }
    }
}

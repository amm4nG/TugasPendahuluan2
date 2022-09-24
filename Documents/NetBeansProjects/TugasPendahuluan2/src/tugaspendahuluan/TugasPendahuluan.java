package tugaspendahuluan;

import java.util.ArrayList;

public class TugasPendahuluan {

    public static void main(String[] args) {
        //array bertipe string
        String[] arrayString = new String[5];
        arrayString[0] = "Arman";
        arrayString[1] = "Taslim";
        arrayString[2] = "Hendri";
        arrayString[3] = "Aco";
        arrayString[4] = "Azzam";

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Elemen " + i + " : " + arrayString[i]);
        }
        
        System.out.println("");
        
        //array bertipe double
        double[] arrayDouble = new double[5];
        arrayDouble[0] = 2.1;
        arrayDouble[1] = 2.2;
        arrayDouble[2] = 2.3;
        arrayDouble[3] = 2.4;
        arrayDouble[4] = 2.5;
        
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("Elemen " + i + " : " + arrayDouble[i]);
        }
        
        System.out.println("");
        
        //arraylist bertipe bilangan bulat
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        
        //ccetak elemen
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Elemen " + i + " : " + arrayList.get(i));
        }
    }

}

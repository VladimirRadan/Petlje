package main;

public class Main {

    public static void main(String[] ime) {

        int [] mojNiz = {5,10,15,20};// kroz niz prolazimo po indexima
        String [] nizS = {};

        int [] niz = new int[2];
        niz[0] = 5;
        niz[1] = 10;
        System.out.println(niz[0]);
        System.out.println(niz[1]);
//        niz[2] = 15;
//        niz[3] = 40;
        System.out.println("Duzina niza: "  + niz.length);

        int [][] niz2 = new int[5][5];


        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }


//
//        for (int i = 0; i<10; i++){
//            for (int j = 0;j<20;j++){
//                System.out.println("Iterator i:" + i + " a brojac j je: " + j);
//            }
//        }

//        int a = 0;
//        while (a<20){
//            a++;
//            if (a == 10){
//                continue;
//            }else {
//                System.out.println(a);
//            }
//            System.out.println("Cao");
//        }


//        spoljasnja:
//        while (b<10){
//            b++;
//            unutrasnja:
//            while (c<10){
//                System.out.println("Druga while petlja");
//                continue unutrasnja;
//            }
//            System.out.println("Prva while petlja");
//        }








    }




}

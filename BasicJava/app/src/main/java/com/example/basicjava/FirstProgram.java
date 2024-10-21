package com.example.basicjava;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//    System.out.print("Baris ke");
//    System.out.print("-1");
//        System.out.println("Baris ke 1");
//        System.out.printf("Baris ke-%f", 3);


//        Scanner scan1 = new Scanner(System.in);
//
        // tipe data, variabel
        int A = 12;
        float B = 12.3f;
        System.out.println(A);
        System.out.println(B);
        boolean C = true;
        boolean F = false;

        System.out.println(C);
        char ppppppp = '?';
        System.out.println(ppppppp);
//        System.out.print(pppppp);

        Scanner oy = new Scanner(System.in);
//        int coy;
//        coy = oy.nextInt();
//        float woy;
//        System.out.println(coy);
//        woy = oy.nextFloat();
//        System.out.println(woy);

        String haduh;
        haduh = "anjay dah malem";
//        haduh = oy.nextLine(); // satu line
//        haduh = oy.next(); // satu kata
//        System.out.println(haduh);
//        float A = 8f + 3f;
//    ===
//    !==
        // "1" === 1
//        System.out.print("Kursi" + "Meja");

        // mau ngeprint angka 1 -> 10
        int itr = 1;
        while(itr <= 10){
            System.out.print(itr + " ");
            itr++;
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}

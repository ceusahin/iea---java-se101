package com.works;

import java.util.Scanner;

public class UseWhile {
    public static void main(String[] args) {
        //  while

        /*  String data = "Satir\nSatir2\nSatir3\n";
            Scanner read = new Scanner(data);
            System.out.println(read.nextLine());
            System.out.println(read.nextLine());
            System.out.println(read.nextLine());
        */

        Scanner read = new Scanner("hakan\naleyna\nayse");
        while (read.hasNext()){
            System.out.println(read.next());
        }

        System.out.println("- - - - - - - - - - - - - - - - - - -");

        while (read.hasNext()){
            System.out.println(read.nextLine());
        }

        int i = 0;
        while (i < 10){
            System.out.println("while: " + i);
            i++;
        }

        System.out.println("- - - - - - - - - - - - - - - - - - -");

        //  do / while
        //  runs once before checking condition
        int j = 0;
        do{
            System.out.println("do/while : " + j);
            j++;
        }
        while (j < 10);
    }
}

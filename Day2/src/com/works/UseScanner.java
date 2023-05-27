package com.works;

import javax.swing.plaf.synth.SynthSliderUI;
import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        /*
        System.out.print("your name --> ");
        String name = input1.nextLine();
        System.out.println(name);
        */

        System.out.print("enter 1. number --> ");
        int n1 = input1.nextInt();
        System.out.print("enter 2. number --> ");
        int n2 = input1.nextInt();
        System.out.println("1.number --> " + n1 + " / " + "2.number --> " + n2);

        // int scannerlarindan sonra aldigimiz ilk stringi atlar. bunu cozmek icin cozumler vardir.
        // solution 1 --> int'ten sonra string'den once tekrar scanner olusturmak (onerilmez).
        // solution 2 --> atlayacagi ilk string'i kendimiz bos atlatiriz.(onerilir).

        input1.nextLine();

        System.out.print("your name --> ");
        String name = input1.nextLine();
        System.out.println(name);

        System.out.print("your surname --> ");
        String surname = input1.nextLine();
        System.out.println(surname);

        System.out.print("your age --> ");
        int age = input1.nextInt();
        System.out.println(age);

    }
}

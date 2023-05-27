package com.works;

import java.util.Objects;
import java.util.Scanner;

public class UseArrays {
    public static void main(String[] args) {
        //  simple arrays
        String[] arrName = new String[5];
        arrName[0] = "Hakan";

        String[] cities = {"Istanbul", "Ankara", "Izmir", "Kocaeli"};

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("- - - - - - - - - - -");

        //  find index
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        //  System.out.println(cities[4]); // error because array has 4 index not 5

        System.out.println("- - - - - - - - - - -");

        //  length
        int arrSize = cities.length;
        System.out.println(arrSize);

        System.out.println("- - - - - - - - - - -");

        //  kullanicidan bir index(sayi) al, bu sayi "cities" dizisinde gecerli mi kontrol et.
        Scanner read = new Scanner(System.in);
        System.out.print("index degerini giriniz --> ");
        int indexInput = read.nextInt();

        if (indexInput < arrSize){
            System.out.println("gecerli index.");
            System.out.println(cities[indexInput]);
        }
        else {
            System.out.println("gecersiz index, lutfen gecerli bir index giriniz.");
        }

        System.out.println("- - - - - - - - - - -");

        //  object arrays --> her turlu veriyi icinde tutabilir.
        //  fazla maliyetli olacagindan gerekmedikce kullanilmaz.
        Object obj = "Ali";
        obj = 10;
        obj = true;

        Object[] objArr = {"Ali", 15, true, 35.60};
    }
}










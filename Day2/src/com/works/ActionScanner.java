package com.works;

import java.util.Scanner;

public class ActionScanner {
    public static void main(String[] args) {
        // vize(%40) ve final(%60) ortalamasi hesaplayan program

        Scanner read = new Scanner(System.in);
        System.out.print("vize notunuzu girin --> ");
        int vizeNotu = read.nextInt();

        System.out.print("final notunuzu girin --> ");
        int finalNotu = read.nextInt();

        double avg = ((vizeNotu * 40) / 100) + ((finalNotu * 60) / 100);
        System.out.println("vize notunuz = " + vizeNotu);
        System.out.println("final notunuz = " + finalNotu);
        System.out.println("ortalamaniz = " + avg);
    }
}

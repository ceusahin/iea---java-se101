package com.works;

import java.util.Scanner;

public class ActScanner {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("adiniz --> ");
        String name = read.nextLine();
        System.out.print("soyadiniz --> ");
        String surname = read.nextLine();

        System.out.print("tam isminiz --> " + name + " " + surname);
    }
}

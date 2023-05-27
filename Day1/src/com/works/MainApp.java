package com.works;

public class MainApp {
    public static void main(String[] args){
        // one line comment
        /*
            multi-line comment
         */
        int num = 10;
        System.out.println(num);

        String name = "Hakan";
        String surname = "Sahin";
        System.out.println(name + " " + surname);

        String stNum = "10";
        String stNum2 = "20";
        System.out.println(stNum + stNum2);

        String city1 = "Istanbul";
        String city2 = "Istanbul";

        // int --> +2,147,483,848 ~ -2,147,483,848
        // long --> +9,223,372,036,854,775,808 ~ -9,223,372,036,854,775,808
        // byte --> -128 ~ +128
        // short --> -32000 ~ +32000

        // string to int
        String stNum3 = "10";
        int sNum = Integer.parseInt(stNum3);
        System.out.println(sNum);

        // string to float
        String stFloat = "10";
        float sFloat = Float.parseFloat(stFloat);
        System.out.println(sFloat);

        // ilkel turlerin kendi aralarinda donusumu
        int num5 = 150;
        float fNumber5 = (float) num5;
        System.out.println(fNumber5);

        // char to int
        char c = '9';
        int charC = (int) c;
        System.out.println(charC);

        char c2 = '3';
        String cSt = String.valueOf(c2);
        int cInt = Integer.parseInt(cSt);
        System.out.println(cInt);


    }
}

package com.works;

public class ifConditions {
    public static void main(String[] args) {
        /*
            if (boolean) {
                kosul saglaniyorsa calistir..
            }
            else{
                kosul saglanmadiysa calistir.
            }
         */

        int n1 = 55;
        int n2 = 40;

        if(n1 > n2){
            System.out.println("kosul saglandi!!");
        }
        else{
            System.out.println("kosul saglanmadi!!");
        }

        /*
            else if --> 2'den fazla senaryo karsisinda kullanilabilir.
         */

        int n3 = 0;

        if(n3 > 0){
            System.out.println(n3 + " pozitif bir sayidir.");
        } else if (n3 < 0) {
            System.out.println(n3 + " negatif bir sayidir.");
        }
        else {
            System.out.println("sayiniz 0'dir.");
        }

    }
}

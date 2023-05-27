package com.works;

public class UseSwitch {
    public static void main(String[] args) {
        int swt = 10;

        switch (swt){
            case 10:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
            case 8:
                System.out.println("8");
                break;
            default:
                // hic bir case uymaz ise default calisir.
                System.out.println("default call");
        }
    }
}

package com.works;

public class mainMethod {
    public static void main(String[] args) {
        //  nesne uretimi
        Action action = new Action();
        System.out.println(action.age);
        action.noParameter();

        action.parameter("hakan");

        action.parameterDb("hakan", 22);

        int sumAct = action.sum();
        System.out.println("with return, without parameter: " + sumAct);

        int sumAct2 = action.sum2(15, 20);
        System.out.println("with return and parameter: " + sumAct2);

        int size = action.size("learning java");
        System.out.println(size);

        if (action.size("AyseAli") > 5){
            System.out.println("completed.");
        }

        Object[] arr = {10, "Ali", true, "Ayse", "Kardelen", 10.5, "Hakan"};
        String data = action.arrFunc(arr);
        System.out.println(data);

        String address = action.addressLine("Istanbul", "Kayseri", "Izmir", "Ankara");
        System.out.println(address);

        User user = new User();
        String name = action.userProfile(user);
        System.out.println(name);
    }
}

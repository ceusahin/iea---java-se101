package com.works;

public class UseObjArr {
    public static void main(String[] args) {
        Object obj = "Hakan";

        //  instanceof
        if (obj instanceof String){
            System.out.println("String tipindedir.");
            String st = String.valueOf(obj);
            System.out.println(st);
            System.out.println(st.getClass());
        }

        if (obj instanceof Integer){
            System.out.println("Integer tipindedir.");
            int num = (int) obj;
            System.out.println(num*2);
        }

        System.out.println("****************************************************");

        //  in arrays
        Object[] objArr = {100, "Hakan", 15, true};
        for (Object item : objArr){
            System.out.println(item);

            if (item instanceof String){
                System.out.println(((String) item).length());
            } else if (item instanceof Integer){
                int num = (int) item;
                System.out.println(num*2);
            }
            else {
                System.out.println(item);
            }
        }



    }
}

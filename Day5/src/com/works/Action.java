package com.works;

public class Action {
    int age = 22;

    //  without return and parameter
    public void noParameter() {
        System.out.println("without return and parameter");
    }

    //  without return / with parameter
    public void parameter(String data){
        System.out.println("parameter method: " + data);
    }

    public void parameterDb(String name, int age){
        System.out.println("db parameter method: " + name + " " + age);
    }

    //  with return and without parameter
    public int sum(){
        int sum = 10 + 5;
        return sum;
    }

    //  with return and parameter
    public int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int size(String data){
        return data.length();
    }

    //  array parameter in method
    public String arrFunc(Object[] objects){
        String data = "";
        for (Object item : objects){
            if (item instanceof String){
                String str = String.valueOf(item);
                data += str + " ";
            }
        }
        return data;
    }

    //  all parameter
    public String addressLine(String... arr){
        String data = "";
        for (String item : arr){
            data += item + " ";
        }
        return data;
    }

    //  object func
    public String userProfile(User user){
        String name = user.profileName(10);
        return name;
    }
}

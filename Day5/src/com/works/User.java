package com.works;

public class User {
    public String profileName(int userID){
        String data = "";
        if (userID == 10){
            data = "Hakan";
        } else if (userID == 20) {
            data = "Mahmut";
        } else if (userID == 30) {
            data = "Ayhan";
        }
        return data;
    }
}

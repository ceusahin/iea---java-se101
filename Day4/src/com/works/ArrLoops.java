package com.works;

public class ArrLoops {
    public static void main(String[] args) {
        String[] cities = {"Kocaeli", "Istanbul", "Izmir", "Mugla", "Antalya"};

        //  for
        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }

        System.out.println("- - - - - - - - - - - - -");

        //  foreach
        for (String item : cities)
        {
            System.out.println(item);
        }

        System.out.println("- - - - - - - - - - - - -");

        // 2d arrays
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        String[][] months = {{"December", "January", "February"},
                {"March", "April", "May"},
                {"June", "July", "August"},
                {"September", "October", "November"}};

        String month = "June";

        for (int j = 0; j < months.length; j++){
            String[] newArr = months[j];

            for (int k = 0; k < newArr.length; k++){
                String item = newArr[k];
                if (month.equals(item)){
                    System.out.println(seasons[j]);
                }
            }
        }

        //  == vs equals
        String name = "Hakan";
        String nameX = "Hakan";
        System.out.println(name.hashCode());
        System.out.println(nameX.hashCode());

        //  break
        for (int x = 0; x < 5; x++){
            if (x == 3){
                break;
            }
            System.out.println("Break = " + x);
        }

        //  label
        label: for (int z = 0; z < 10; z++){
            for (int a = 0; a < 10; a++){
                if (a == 5){
                    break label;
                }
                //  a = 5
                System.out.println(z + " " + a);
            }
        }

        //  continue
        for (int i = 0; i < 10; i++){
            if  (i == 2){
                continue;
            }
            if (i == 6){
                break;
            }
            System.out.println("Loop: " + i);
        }
    }
}

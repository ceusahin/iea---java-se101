package com.works;

public class AccessModifiers {

    //  erisim belirtecleri (public, private, protected, default)
    int age = 50; // default erisim belirteci -->  sadece kendi package

    public String name = "Ayse"; // her yerden erisilebilir

    protected int year = 2023; // sadece kendi paketi icinde ulasilabilir

    private String tcNo = "45698777545"; // sadece kendi class'i icinde ulasilabilir

    public int count(){
        int length = tcNo.length();
        return length;
    }

    private void call(){
        System.out.println("Call");
    }

    //  public --> tum paket ve siniflardan erisilebilir.
    //  protected --> sadece kendi paketi icinde erisilebilir.
    //  default --> sadece kendi paketi icinde erisilebilir.
    //  private --> sadece kendi sinifi icinde erisilebilir.

}

package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone(123456,"iPhone X","Sprint", "123456789","Courtney Johnson");
//
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("phoneNumber: " + myPhone.getPhoneNumber());
        System.out.println("owner: " +myPhone.getOwner());


    }
}

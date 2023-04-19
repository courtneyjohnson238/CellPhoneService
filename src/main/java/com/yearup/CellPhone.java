package com.yearup;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String Carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(int serialNumber, String model, String Carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.Carrier = Carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;

    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getCarrier() {
        return Carrier;

}
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


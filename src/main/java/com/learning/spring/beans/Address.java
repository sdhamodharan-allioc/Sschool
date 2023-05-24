package com.learning.spring.beans;

public class Address {
    private String building;
    private String city;
    private int pincode;

  //  public Address { super(); }
    public Address(String building,String city,int pincode)
    {
    super();
    this.building = building;
    this.city = city;
    this.pincode = pincode;
    }

    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "building='" + building + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

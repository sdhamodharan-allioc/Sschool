package com.learning.spring.beans;

public class School {
    private int schoolcode;
    private String schoolName;
    private Address address;
    public School()
    {
        super();
    }
    public School( int schoolcode,String schoolName,Address address)
    {
        super();
        this.schoolcode = schoolcode;
        this.schoolName = schoolName;
        this.address = address;
    }

    public int getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(int schoolcode) {
        this.schoolcode = schoolcode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolcode=" + schoolcode +
                ", schoolName='" + schoolName + '\'' +
                ", address=" + address +
                '}';
    }
    public String WelcomeMessage()
    {
        System.out.println("Welcome msg...");
        return this.toString();
    }
}


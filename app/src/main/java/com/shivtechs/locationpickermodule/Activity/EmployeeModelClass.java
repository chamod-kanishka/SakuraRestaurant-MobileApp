package com.shivtechs.locationpickermodule.Activity;

public class EmployeeModelClass {

    Integer id;
    String name;
    String email;
    String price;
    String location;

    public EmployeeModelClass(String name, String email,String price,String location) {
        this.name = name;
        this.email = email;
        this.price = price;
        this.location = location;
    }

    public EmployeeModelClass(Integer id, String name, String email,String price,String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.price = price;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}

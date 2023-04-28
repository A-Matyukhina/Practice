package com.tasks.task2;

public class House {
    private String nameOwner;
    private String address;

    public House() {
    }

    public House(String nameOwner, String address) {
        this.nameOwner = nameOwner;
        this.address = address;
    }


    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameOwner='" + nameOwner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package com.example.practice14.entity;

import java.util.Objects;

public class Manufacture {
    private String address;
    private String name;

    public Manufacture() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacture that = (Manufacture) o;
        return Objects.equals(address, that.address) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name);
    }
}

package com.example.practice14.entity;

import java.util.Objects;

public class Phone {
    private String name;
    private int creationYear;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", creationYear=" + creationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return creationYear == phone.creationYear && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public Phone() {
    }
}

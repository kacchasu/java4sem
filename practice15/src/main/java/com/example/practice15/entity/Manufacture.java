package com.example.practice15.entity;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String address;
    @Column
    private String name;
    @OneToMany(mappedBy = "manufacture", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Phone> phones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Manufacture() {
    }

    public Manufacture(int id, String address, String name, Set<Phone> phones) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.phones = phones;
    }
}

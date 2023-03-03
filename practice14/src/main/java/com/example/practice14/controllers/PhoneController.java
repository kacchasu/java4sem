package com.example.practice14.controllers;

import com.example.practice14.entity.Manufacture;
import com.example.practice14.entity.Phone;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PhoneController {
    ArrayList<Phone> phones = new ArrayList<>();

    @GetMapping("/phone")
    public List<Phone> getPhones(){
        return phones;
    }

    @PostMapping("/phone")
    public Phone addPhone(@RequestBody Phone phone) {
        phones.add(phone);
        return phone;
    }

    @DeleteMapping("/phone")
    public String deletePhone(@RequestBody Phone phone) {
        phones.remove(phone);
        return phone + " was deleted";
    }
}

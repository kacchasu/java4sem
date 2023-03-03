package com.example.practice14.controllers;

import com.example.practice14.entity.Manufacture;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManufactureController {
    ArrayList<Manufacture> manufactures = new ArrayList<>();

    @GetMapping("/manufacture")
    public List<Manufacture> getAllManufactures(){
        return manufactures;
    }

    @PostMapping("/manufacture")
    public Manufacture addManufacture(@RequestBody Manufacture manufacture) {
        manufactures.add(manufacture);
        return manufacture;
    }

    @DeleteMapping("/manufacture")
    public Manufacture deleteManufacture(@RequestBody Manufacture manufacture) {
        manufactures.remove(manufacture);
        return manufacture;
    }
}

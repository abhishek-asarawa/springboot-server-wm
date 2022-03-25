package com.service.servicewalmart.controller;

import java.util.ArrayList;

import com.service.servicewalmart.model.Prescriber;
import com.service.servicewalmart.service.PrescriberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PrescriberController {
    @Autowired
    private PrescriberService service;

    @GetMapping("/prescribers")
    public ResponseEntity<ArrayList<Prescriber>> getAllPrescribers() {
        return ResponseEntity.ok(this.service.getPrescribers());
    }

    @PostMapping("/prescriber")
    public ResponseEntity<Prescriber> addPrescriber(@RequestBody Prescriber prescriber) {
        return ResponseEntity.ok(this.service.addPrescriber(prescriber));
    }

    @GetMapping("/prescriber/{id}")
    public ResponseEntity<Prescriber> getPrescriberById(@PathVariable int id) {
        return ResponseEntity.ok(this.service.getPrescriber(id));
    }

}

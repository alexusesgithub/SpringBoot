package com.ngp.projectspring;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/track")
public class tracker {
    @GetMapping("/id/{id}")
    String trackById(@PathVariable String id) {
        return "trackById"+id;
    }

    @GetMapping("/name/{name}")
    String trackByName(@PathVariable String name) {
        return "name da boii" + name;


    }
}

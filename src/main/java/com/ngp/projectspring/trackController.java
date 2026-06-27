package com.ngp.projectspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/track")
public class trackController {
    @Autowired
    private trackerService ts;
    @GetMapping("/get")
    String tracker(){
        ts.printOf();
        return "tracking";
    }
}

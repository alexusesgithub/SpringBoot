package com.ngp.projectspring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class create {
    @PostMapping("/print")
    String print(@RequestBody String body)
    {
        return body;
    }
}

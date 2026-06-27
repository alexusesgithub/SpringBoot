package com.ngp.projectspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requestparam {  //http://localhost:8080/pass?user=alex&password=1234
    @GetMapping("/pass")
    String pass(@RequestParam String user,@RequestParam String password){
        return user+" "+password;
    }

}

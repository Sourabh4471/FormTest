package com.example.test.Controller;


import com.example.test.beans.PersonalDetails;
import com.example.test.service.IPersonalDetailsServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
public class Controller {

    private final IPersonalDetailsServiceInterface personalDetailsServiceInterface;

    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }

    @PostMapping("/get-user-details")
    public ResponseEntity getUserDetails(@RequestBody PersonalDetails details) {
       return ResponseEntity.ok(personalDetailsServiceInterface.checkPersonalDetails(details));
    }
}
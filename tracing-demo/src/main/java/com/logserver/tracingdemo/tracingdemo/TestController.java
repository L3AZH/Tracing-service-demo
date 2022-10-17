package com.logserver.tracingdemo.tracingdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/get")
    public ResponseEntity<String> testGetApi(){
        return ResponseEntity.ok("This is Test Api");
    }
}

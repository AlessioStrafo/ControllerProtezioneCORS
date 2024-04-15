package com.example3.demo6;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/v1")
public class UserController {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{name}")
    public String getName(@PathVariable("name")String name){
        return name;
    }
    @PostMapping("/reverse")
    public String reverseName(@RequestParam String name){
        return new StringBuilder(name).reverse().toString();
    }
}

package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// This means URL's start with /demo (after Application path)
@RequestMapping(path = "/demo")
public class MainController {

    @GetMapping(path = "/all")
    public @ResponseBody String getAllUsers() {
        // This returns a JSON or XML with the users
        return "hello";
    }

}

package com.example.demotap;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HiController {

    private static String sendtmplt = "R: %s";
    private final AtomicLong counter = new AtomicLong();
    private final List<Details> detailsList = new ArrayList<>();

    @RequestMapping("/")
    public string index(){
        return "Hello from Spring Boot";
    }

    @RequestMapping("/add-det")
    @ResponseBody
    public Details addDetails(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
        Details detail = new Details(counter.incrementAndGet(), name);
        detailsList.add(detail);
        return detail;
    }
 
}
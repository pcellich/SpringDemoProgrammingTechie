package com.example.SpringbootDineshKrishnan.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}

/*
 {

         "customerId": 1,
         "customerFirstName": "Adam",
         "customerLastName": "Hackman",
         "customerEmail": "adam.hackman@gmail.com"
         },
         {
         "customerId": 2,
         "customerFirstName": "Pat",
         "customerLastName": "Lartery",
         "customerEmail": "patlartey@yahoo.com"
         },
         {
         "customerId": 3,
         "customerFirstName": "Patta",
         "customerLastName": "Dzide",
         "customerEmail": "patlartey@yahoo.co.uk"
         },
         {
         "customerId": 4,
         "customerFirstName": "Adam",
         "customerLastName": "Hackman",
         "customerEmail": "adam.hack@gmail.com"
         }

      */

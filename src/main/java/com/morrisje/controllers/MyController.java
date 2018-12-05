package com.morrisje.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jmorris on 12/5/18
 */

@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello");
        return "John";
    }
}

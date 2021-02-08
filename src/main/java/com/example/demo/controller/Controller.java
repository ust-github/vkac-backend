package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Controller")
@CrossOrigin("*")
@RestController
public class Controller {

    @ApiOperation("Greetings")
    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayQuote() {
        return "Your application has been deployed!";
    }

}

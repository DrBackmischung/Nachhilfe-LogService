package de.wi2020sebgroup1.nachhilfe.logger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/log")
public class LogController {

    @PostMapping(value = "/")
    public String helloWorld() {
        return "";
    }

}

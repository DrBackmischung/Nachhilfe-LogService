package de.wi2020sebgroup1.nachhilfe.logger.controller;

import java.util.Date;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.wi2020sebgroup1.nachhilfe.logger.service.LogService;
import de.wi2020sebgroup1.nachhilfe.logger.service.RESTService;

@RestController
@RequestMapping(value = "/log")
public class LogController {

    // Initializing instance of Logger for Controller
    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private final LogService service;

    @Autowired
    private final RESTService restService;
    
    public LogController(LogService service, RESTService restService) {
        this.service = service;
        this.restService = restService;
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        log.info("Inside Hello World Function");
        String response = "Hello World! " + new Date();
        log.info("Response => {}",response);
        return response;
    }

    @GetMapping(value = "/Food-Details")
    public JSONArray foodDetails() {
        log.info("Inside Food Detail Function");
        return service.getAllFoodDetails();
    }

}

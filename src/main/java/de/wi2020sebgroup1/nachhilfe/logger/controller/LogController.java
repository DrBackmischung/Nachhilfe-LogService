package de.wi2020sebgroup1.nachhilfe.logger.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.wi2020sebgroup1.nachhilfe.logger.entity.Log;
import de.wi2020sebgroup1.nachhilfe.logger.entity.LogRepository;

@Controller
@RestController
@RequestMapping(value = "/log")
public class LogController {
	
	@Autowired
	LogRepository repo;
	
	@GetMapping(value = "/")
	public ResponseEntity<Iterable<Log>> getAll() {
		return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
	}

    @PostMapping(value = "/")
    public ResponseEntity<Log> save() {
    	Log l = new Log(UUID.randomUUID().toString(), "Test", "Mathis", new Date(2), new Time(3));
    	return new ResponseEntity<>(repo.save(l), HttpStatus.CREATED);
    }

}

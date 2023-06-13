package com.example.Aspect.Oriented.Programming.route;

import org.springframework.web.bind.annotation.RestController;

import com.example.Aspect.Oriented.Programming.service.ProgramService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Api {

    @Autowired
    private ProgramService programService; 

    @GetMapping(value="start")
    public ResponseEntity<String> startProgram() {
        return ResponseEntity.ok(programService.startProgram());
    }
    
    
}

package com.reba.personascrud.controller.impl;

import com.reba.personascrud.controller.StatsController;
import com.reba.personascrud.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController("statusController")
public class StatsControllerImpl implements StatsController {

    @Autowired private StatusService statusService;

    @GetMapping(value = "/stats")
    public ResponseEntity<List<Map<String, String>>> getStats(){
        return new ResponseEntity<>(statusService.getStats(), HttpStatus.OK);
    }
}

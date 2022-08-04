package com.reba.personascrud.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface StatsController {

    ResponseEntity<List<Map<String, String>>> getStats();
}

package com.cyborg.controllerAdvice.resources;

import com.cyborg.controllerAdvice.model.ValidateTestRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class ValidateTest {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ValidateTestRequest> get(@Valid @RequestBody ValidateTestRequest body) {

        return ResponseEntity.ok().body(body);
    }



}

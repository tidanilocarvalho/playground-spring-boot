package com.example.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Calc;

@RestController
public class CalcController {

    @Autowired(required = false)
    private Optional<Calc> calc;
    
	@GetMapping(path = "/calc/sum/{valueA}/{valueB}")
	public ResponseEntity<String> calc(@PathVariable("valueA") double valueA, @PathVariable("valueB") double valueB) {
	    HttpHeaders headers = new HttpHeaders();

	    if (calc.isPresent())
        {
	        double value = calc.get().sum(valueA, valueB);
	        
	        headers.add("Custom-Header", String.valueOf(value));
	        
	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .body(String.valueOf(value));
        } else {
            headers.add("Custom-Header", "There is no impl for cal interface");
            
            return ResponseEntity
                    .notFound()
                    .headers(headers)
                    .build();
        }
	    
	}

}

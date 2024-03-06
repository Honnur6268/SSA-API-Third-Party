package com.honnur.ssa.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honnur.ssa.dto.SSACitizenDetialsRequest;
import com.honnur.ssa.dto.SSACitizenDetialsResponse;
import com.honnur.ssa.service.SSACitizenDetialsService;

@RestController
@RequestMapping("/api/v1")
public class SSACitizenDetialsRestController {

	@Autowired
	private SSACitizenDetialsService detialsService;

	@PostMapping("/ssn-api")
	public ResponseEntity<?> getSSNDetails(@RequestBody SSACitizenDetialsRequest request) {
		SSACitizenDetialsResponse ssnDetails = detialsService.checkSSN(request);
		Map<String, String> error = new HashMap<>();
		
		if (ssnDetails.getStateName() != null) {
			return ResponseEntity.ok(ssnDetails);
		} 
		else {
			
			error.put("errorMessage", "Invalid SSN: " + ssnDetails.getSsn());
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
	}
}

package com.honnur.ssa.restcontroller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String getSSNDetails(@RequestBody SSACitizenDetialsRequest request) {
		SSACitizenDetialsResponse ssnDetails = detialsService.checkSSN(request);
		Map<String, String> error = new HashMap<>();

		if (ssnDetails.getStateName() != null) {
			return ssnDetails.getStateName();
		} else {

			error.put("errorMessage", "Invalid SSN: " + ssnDetails.getSsn());
			return "Invalid SSN";
		}
	}
	
	@GetMapping("/cities")
	public List<String> getAllSSNDetails(){
		return Arrays.asList("New Jersey","Ohio","Texas","California","Rhode Island","Kentucky");
	}
}

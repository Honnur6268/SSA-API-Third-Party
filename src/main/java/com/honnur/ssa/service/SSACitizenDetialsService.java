package com.honnur.ssa.service;

import org.springframework.stereotype.Service;

import com.honnur.ssa.dto.SSACitizenDetialsRequest;
import com.honnur.ssa.dto.SSACitizenDetialsResponse;

@Service
public class SSACitizenDetialsService {

	public SSACitizenDetialsResponse checkSSN(SSACitizenDetialsRequest request) {
		SSACitizenDetialsResponse response = new SSACitizenDetialsResponse();

		Integer ssn = request.getSsn();

		response.setName(request.getName());
		response.setDob(request.getDob());
		response.setGender(request.getGender());
		response.setSsn(ssn);

		String s = ssn.toString();

		if (s.startsWith("1")) {
			response.setStateName("New Jersey");
		}

		else if (s.startsWith("2")) {
			response.setStateName("Ohio");
		}

		else if (s.startsWith("3")) {
			response.setStateName("Texas");
		}

		else if (s.startsWith("4")) {
			response.setStateName("California");
		}

		else if (s.startsWith("5")) {
			response.setStateName("Rhode Island");
		}

		else if (s.startsWith("6")) {
			response.setStateName("Kentucky");
		}
		return response;
	}
}

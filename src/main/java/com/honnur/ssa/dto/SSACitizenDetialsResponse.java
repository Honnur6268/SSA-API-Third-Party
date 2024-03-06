package com.honnur.ssa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class SSACitizenDetialsResponse {

	private String name;
	private String dob;
	private String gender;
	private Integer ssn;
	private String stateName;
}

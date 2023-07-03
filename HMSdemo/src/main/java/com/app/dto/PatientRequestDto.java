package com.app.dto;

import java.time.LocalDate;

import com.app.entities.BloodGroup;
import com.app.entities.Gender;
import com.app.entities.PaymentStatus;
import com.app.entities.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PatientRequestDto {

	private String firstName;
	private String lastName;
	private String email;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String confirmPassword;
	private Role role;
	private LocalDate dob;
	private Gender gender;
	private double contactNo;
	private LocalDate dateOfAdmission;
	private BloodGroup bloodGroup;
	private String disease;
	private PaymentStatus paymentStatus;
	private String prescription;
	private Integer doctorId;
	private Integer wardId;
}

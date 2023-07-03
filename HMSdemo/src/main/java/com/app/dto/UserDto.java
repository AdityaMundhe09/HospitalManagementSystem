package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Gender;
import com.app.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private Role role;
	private LocalDate dob;
	private Gender gender;
	private double contactNo;
}

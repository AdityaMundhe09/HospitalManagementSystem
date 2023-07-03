package com.app.service;

import java.util.List;

import com.app.dto.DoctorResponseDto;
import com.app.dto.PatientRequestDto;
import com.app.dto.PatientResponseDto;
import com.app.entities.Patient;

public interface PatientService {

	String addPatient(PatientRequestDto pt);
	
	PatientResponseDto getPatientById(Integer patientId);
	
	PatientResponseDto getPatientByName(String name);
	
	List<PatientResponseDto> getAllPatients();
	
	String removePatient(Integer patientId);
	
	
	String updatePatient(Integer patientId,PatientRequestDto pt);
	
	List<DoctorResponseDto> getAllDoctors(Integer patientId);
}

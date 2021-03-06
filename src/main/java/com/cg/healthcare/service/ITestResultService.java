package com.cg.healthcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.healthcare.entities.Patient;
import com.cg.healthcare.entities.TestResult;
import com.cg.healthcare.exception.DataAlreadyExists;
import com.cg.healthcare.exception.DataNotFoundInDataBase;
import com.cg.healthcare.exception.TestResultNotFoundException;


/*
 * TestResult Service Layer
 * Author:Achuth Bhaskar
 * date created:07/01/2022
 */

@Service
public interface ITestResultService {
	
	public TestResult addTestResult(TestResult tr)throws DataAlreadyExists;
	public TestResult updateResult(TestResult tr) throws DataNotFoundInDataBase;
	public List<TestResult> removeTestResult(int id)throws TestResultNotFoundException;
	public List<TestResult> viewResultsByPatient(Patient patient) throws DataNotFoundInDataBase, TestResultNotFoundException;
	public List<TestResult> getAll();
	public TestResult getById(int id) throws DataNotFoundInDataBase;
}

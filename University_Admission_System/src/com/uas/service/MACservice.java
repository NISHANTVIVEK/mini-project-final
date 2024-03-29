package com.uas.service;

/**
*
* University Admission System
* 
* MAC Service Interface
* This is the service layer for the MAC architecture,
* with methods for showing applicants details, updating their status or interview date, deleting applicant, and showing status.
* 
* 
*
* @version 1.0
* @since   2019-10-29
*/

import java.util.List;

import com.uas.beans.Application;

public interface MACservice {

	
	void showDetails();
	int updateStatus(int app_id,String status);
	void updateInterviewDate(int app_id,String date_of_interview); 
	int confirmationStatus(int idd,String status);
	void deleteApplicant(int app_id);
	String showStatus(int app_id);
}

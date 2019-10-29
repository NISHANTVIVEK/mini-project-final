package com.uas.junit;

/**
*
* University Admission System
* 
* TestCases Class
* This class has JUnit test cases for:
* Login
* Checking Status of the applicant
* Apply for Program
* List Of Applications
* 

*
* @version 1.0
* @since   2019-10-29
*/

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.uas.dao.ApplicationDAO;
import com.uas.service.AdminService;
import com.uas.service.AdminServiceImpl;
import com.uas.service.ApplicationService;
import com.uas.service.ApplicationServiceImpl;
import com.uas.service.LoginService;
import com.uas.service.LoginServiceImpl;
import com.uas.service.MACservice;
import com.uas.service.MACserviceImpl;
import com.uas.ui.ApplicantUI;

public class TestCases {
	static ApplicantUI app;
	static ApplicationService appServ ;
	static AdminService service;
	static  MACservice mac;
	@BeforeClass
	public static void beforeclass()
	{
		 app = new ApplicantUI();
		appServ= new ApplicationServiceImpl();
		 service=new AdminServiceImpl();
		   ApplicationDAO appDetails=null;
		mac  = new MACserviceImpl();
	}
	
	

   // Test for LOGIN
	@Test
	public void loginTest() {
		LoginService obj = new LoginServiceImpl();
		String user,pass,role;
		role =obj.authenticate("nishant","mac");
		assertEquals("MAC", role);
	}
	
	
	//List of Application Status 
	@Test
	public void checkStatusTest() {
		System.out.println("From Application UI class:");
		int id = 103;
		assertEquals("accepted", appServ.checkStatus(id));
	}
    @Test
	public void checkStatusTestforFail() {
		System.out.println("From Application UI class:");
		int id = 103;
        assertEquals("rejected", appServ.checkStatus(id));
	}
    @Test
	public void checkStatusTestforConfirmation() {
		System.out.println("From Application UI class:");
		int id = 42;
        assertEquals("confirmed", appServ.checkStatus(id));
	}
    
    
    @Test
    public void ApplyForProgramTest() {
//    Application app1= new Application();
//    	app1.setFull_name("Joy");
//    	app1.setDob("26/03/2000");
//    	app1.setHighest_qualification("B.tech");
//    	app1.setMarks(88);
//    	app1.setGoals("Topper");
//    	app1.setEmail("joy@gmail.com");
//    	app1.setSch_prog_id("CS101");
//    	appDetails.addApplicationDetails(app1);
    	int id = 102;
		assertEquals("applied", appServ.checkStatus(id));
    }
    
    
    @Test
    public void ListofApplicationsTest() {
    
    		mac.showDetails();
		
    	assertEquals("confirmed",mac.showStatus(42));
    }
    
    @AfterClass
    public static void afterClass()
    {
    	System.out.println("Test Cases ended");
    }

}

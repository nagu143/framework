package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tc_002 {

	//public static void main(String[] args) throws Exception {
	@Test
		public void tc_002()throws Exception {
			//testSteps
		DOMConfigurator.configure("log4j.xml");
				General obj =new General();
				obj.openApplication();
				obj.login();
				obj.enterFrame();
				obj.addEmp();
				obj.exitFrame();
				obj.logout();
				obj.closeApplication();


	}

}

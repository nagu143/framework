package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;
//Rule --TestData
public String url = "http://183.82.103.245/nareshit/index.php?menu_no_top=hr";
public String un = "nareshit";
public String pw = "nareshit";
public String EFN = "selenium";
public String ELN = "suresh";
//Rule2 --objects info:
     // DT       Var          vv                Login
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String link_login="Logout";
                                  //               AddEMPLOY
public String btn_Add="//input[@value='Add']";
public String txt_EFN="txtEmpLastName";
public String txt_ELN="txtEmpFirstName";
public String btn_save="btnEdit";
public String frm_AddEMP="rightMenu";
                  
		

	}



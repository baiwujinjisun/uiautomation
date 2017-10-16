package com.netease.com.testcase;

import org.testng.annotations.Test;

import com.netease.commom.impl.CreatePatientImpl;
import com.netease.commom.impl.LoginImpl;
import com.netease.commom.impl.LogoutImpl;
import com.netease.commom.impl.OpenUrlImpl;
import com.netease.common.ICreatePatient;
import com.netease.common.ILogin;
import com.netease.common.ILogout;
import com.netease.common.IOpenUrl;

public class CreatPatientTest {
	
  private static ICreatePatient createpatient= new CreatePatientImpl();
  private static ILogin login = new LoginImpl();
  private static IOpenUrl openurl=new OpenUrlImpl();
  private static ILogout logout = new LogoutImpl();
  
  @Test
  public void f() {
	  openurl.openUrl();
	  login.baseLogin("15902031512", "123456");
	  createpatient.createPatientNormal();
//	  try {
//		  createpatient.createPatientNormal();
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.print("新增失败");
//	}
	  
	  logout.logout();
  }
}

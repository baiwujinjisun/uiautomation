package com.netease.com.testcase;

import org.testng.annotations.Test;

import com.netease.commom.impl.LoginImpl;
import com.netease.commom.impl.LogoutImpl;
import com.netease.commom.impl.OpenUrlImpl;
import com.netease.commom.impl.OperatePatientImpl;
import com.netease.common.ILogin;
import com.netease.common.ILogout;
import com.netease.common.IOpenUrl;
import com.netease.common.IOperatePatient;

public class OperatePatientTest {
	
  private static IOperatePatient operatepatient= new OperatePatientImpl();
  private static ILogin login = new LoginImpl();
  private static IOpenUrl openurl=new OpenUrlImpl();
  private static ILogout logout = new LogoutImpl();
  
  
  
  @Test
  public void createpatientnormaltest() {
	  openurl.openUrl();
	  login.baseLogin("15902031512", "123456");
	  operatepatient.createPatientNormal();
  }
  
  @Test
  public void createpatientlessmessagetest(){
	  operatepatient.createPatientLessInformation();	  
  }
  
  @Test
  public void editpatientWetest(){
	  operatepatient.editPatient();	  
  }
  
  @Test
  public void deletepatientWetest(){
	  operatepatient.deletePatient();	  
  }
}

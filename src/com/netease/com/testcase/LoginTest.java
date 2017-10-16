package com.netease.com.testcase;

import org.testng.annotations.Test;

import com.netease.commom.impl.LoginImpl;
import com.netease.commom.impl.LogoutImpl;
import com.netease.commom.impl.OpenUrlImpl;
import com.netease.common.ILogin;
import com.netease.common.ILogout;
import com.netease.common.IOpenUrl;

public class LoginTest {
	
	private static ILogin  login= new LoginImpl();
	private static IOpenUrl openurl = new OpenUrlImpl();
	private static ILogout logout = new LogoutImpl();

	@Test
	public void open_urltest() {
		openurl.openUrl();
	}

	@Test
	public void logintest() {
		login.NoAccountLogin();
		login.NoPasswodtLogin("15902031512");
		login.WrongPassword("15902031512", "145374573");
		login.baseLogin("15902031512", "123456");
	}

	@Test
	public void logoutest() {
		logout.logout();
	}
   
//   @Test
//   public void f(){
//	   openurl.openurl();
//	   login.NoAccountLogin();
//	   login.NoPasswodtLogin("15902031512");
//	   login.WrongPassword("15902031512","145374573");
//	   login.baseLogin("15902031512", "123456");  
//	   logout.logout();
//   }
}

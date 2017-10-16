/**
 * 
 */
package com.netease.commom.impl;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.netease.common.IAction;
import com.netease.common.ILogin;
import com.netease.imagecheck.ImageProcess;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * @author Administrator
 */
public class LoginImpl implements ILogin {
	private static final Logger logger = Logger.getLogger(LoginImpl.class);
	private static IAction action=new ActionImpl();
	String accountxpath = "//html/body/div/div[2]/div/div/div[3]/form/div[1]/div/div/input";
	String passwordxpath = "//html/body/div/div[2]/div/div/div[3]/form/div[2]/div/div/input";
	String loginBtnxpath = "//html/body/div/div[2]/div/div/div[3]/form/button/span";
	String actualxpath = "//html/body/div/div[4]/div[2]/div/div/div/div[2]/ul/li[1]/div/p/span";

	/* (non-Javadoc)
	 * @see com.netease.common.ILogin#baseLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public void baseLogin(String account, String password) {
		action.pause(500);
		action.typeAction(accountxpath, account);
		action.typeAction(passwordxpath,password);
		action.clickAction(loginBtnxpath);
		action.pause(500);
        assertEquals(action.getTextAction(actualxpath), "数据异常");
        action.getImage("/screenshot", "登录成功");
	}

	/* (non-Javadoc)
	 * @see com.netease.common.ILogin#NoPasswodtLogin(java.lang.String)
	 */
	@Override
	public void NoPasswodtLogin(String account) {
		action.pause(500);
		action.typeAction(accountxpath, account);
		action.clickAction(loginBtnxpath);
		action.pause(500);
		action.isTestPresentAction("请输入6-12位密码");

	}

	/* (non-Javadoc)
	 * @see com.netease.common.ILogin#NoAccountLogin()
	 */
	@Override
	public void NoAccountLogin() {
		action.pause(500);
		action.clickAction(loginBtnxpath);
		action.pause(500);
		action.isTestPresentAction("请输入11位手机号码");

	}

	/* (non-Javadoc)
	 * @see com.netease.common.ILogin#WrongPassword(java.lang.String)
	 */
	@Override
	public void WrongPassword(String account,String password) {
		action.pause(500);
		action.typeAction(accountxpath,account);
		action.typeAction(passwordxpath,password);
		action.isTestPresentAction("输入的账号或密码错误");
		
	}

}

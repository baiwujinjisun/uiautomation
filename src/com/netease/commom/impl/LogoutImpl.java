/**
 * 
 */
package com.netease.commom.impl;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.netease.common.IAction;
import com.netease.common.ILogin;
import com.netease.common.ILogout;
import com.netease.imagecheck.ImageProcess;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * 
 * @author Administrator
 */
public class LogoutImpl implements ILogout {

	private IAction action = new ActionImpl();
	String logoutxpath = "//html/body/div/div[1]/form/div[1]/div/div[1]/div[2]/div[2]/div/div[3]";
	String logoutxpath0 = "//html/body/div/div[1]/form/div[1]/div/div[1]/div[2]/div[1]";
	String assertxpath = "//html/body/div/div[1]/div/div[1]";
	private static String screenshotPath = "/screenshot";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.ILogout#logout(java.lang.String)
	 */
	@Override
	public void logout() {
		action.pause(500);
		action.mouseOveraction(logoutxpath0);
		action.clickAction(logoutxpath);
		action.pause(500);
		assertEquals(action.getTextAction(assertxpath), "乐心健康管理平台");
		action.getImage(screenshotPath, "退出成功");
//		action.exit();

	}

}

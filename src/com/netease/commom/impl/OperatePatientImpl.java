/**
 * 
 */
package com.netease.commom.impl;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.jar.Attributes.Name;

import com.netease.common.IAction;
import com.netease.common.IOperatePatient;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * 
 * @author Administrator
 */
public class OperatePatientImpl implements IOperatePatient {

	private static IAction action = new ActionImpl();
	private static String screenshotPath = "/screenshot";
	String menuXpath = "//html/body/div/div[4]/div[1]/div/div/ul/li[2]/ul/li[1]";
	String creatBthXpath = "//html/body/div/div[4]/div[2]/div/div/div/div[2]/div/button";
	String nameXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/div/div/div/input";
	String brithdayXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[2]/div/div/div/input";
	String phoneXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div[2]/div/div/div/input";
	String saveXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[2]/button[1]";
	String editbuttonXpath = "//html/body/div/div[4]/div[2]/div/div/div/div[4]/div/div[3]/table/tbody/tr/td[11]/div/div/span[1]";
	String querynameXpaht = "//html/body/div/div[4]/div[2]/div/div/div/div[3]/div[1]/input";
	String querybtnXpath = "//html/body/div/div[4]/div[2]/div/div/div/div[3]/span[3]";
	String assertXpah = "//html/body/div/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/div/div/div[2]";
	String queryassertXpaht = "//html/body/div/div[4]/div[2]/div/div/div/div[4]/div/div[3]/table/tbody/tr/td[2]/div/div/div/div/span";
	String deleteXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[2]/button[3]";
	String confirmXpath = "//html/body/div[2]/div/div[3]/button[2]/span";
	String delectassretXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/div[4]/div/div[3]/div/span";

	Random rand = new Random();
	int randNum = rand.nextInt(9);
	String name = "测试" + String.valueOf(randNum);
	String namenew = name + "新";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.ICreatePatient#createPatientNormal()
	 */
	@Override
	public void createPatientNormal() {
		action.pause(2000);
		action.clickAction(menuXpath);
		action.pause(2000);
		action.clickAction(creatBthXpath);
		action.pause(2000);
		action.typeAction(nameXpath, name);
		action.pause(500);
		action.typeAction(brithdayXpath, "1990-06-29");
		action.clickAction("//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/div/div");
		action.pause(500);
		action.typeAction(phoneXpath, "13462352626");
		action.pause(1000);
		action.clickAction(saveXpath);
		action.pause(1000);
		action.typeAction(querynameXpaht, name);
		action.pause(500);
		action.clickAction(querybtnXpath);
		action.pause(500);
		assertEquals(action.getTextAction(queryassertXpaht), name);
		action.getImage(screenshotPath, "创建患者后搜索结果");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.ICreatePatient#createPatientLessInformation()
	 */
	@Override
	public void createPatientLessInformation() {

		action.pause(500);
		action.clickAction(creatBthXpath);
		action.pause(2000);
		action.clickAction(saveXpath);
		action.pause(500);
		assertEquals(action.getTextAction(assertXpah), "请输入正确的姓名！");
		action.pause(500);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.IOperatePatient#editPatient()
	 */
	@Override
	public void editPatient() {
		action.pause(500);
		action.clickAction(menuXpath);
		action.pause(500);
		System.out.println("sunqiaoyue_log++++" + name);
		action.typeAction(querynameXpaht, name);
		action.pause(500);
		action.clickAction(querybtnXpath);
		action.pause(500);

		// 获取当前页面句柄
		String current_handle = action.browser().getBrowserCore()
				.getWindowHandle();
		System.out.println("当前页面句柄++++++++" + current_handle);

		// 点击编辑链接
		action.clickAction(editbuttonXpath);
		action.pause(500);

		// 会有新窗口打开，获取所有链接
		Set<String> all_handles = action.browser().getBrowserCore()
				.getWindowHandles();
		action.switchToWindowAction(current_handle, all_handles);
		action.pause(500);
		action.typeAction(nameXpath, namenew);
		action.pause(500);
		action.clickAction(saveXpath);
		action.pause(500);
		action.typeAction(querynameXpaht, namenew);
		action.pause(500);
		action.clickAction(querybtnXpath);
		action.pause(500);
		assertEquals(action.getTextAction(queryassertXpaht), namenew);
		action.pause(500);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.IOperatePatient#deletePatient()
	 */
	@Override
	public void deletePatient() {
		action.pause(500);
		action.clickAction(menuXpath);
		action.pause(500);
		action.typeAction(querynameXpaht, namenew);
		action.pause(500);
		action.clickAction(querybtnXpath);
		action.pause(500);
		String current_handle = action.browser().getBrowserCore()
				.getWindowHandle();
		System.out.println("当前页面句柄++++++++" + current_handle);
		action.clickAction(editbuttonXpath);
		action.pause(500);
		// 会有新窗口打开，获取所有链接
		Set<String> all_handles = action.browser().getBrowserCore()
				.getWindowHandles();
		action.switchToWindowAction(current_handle, all_handles);
		action.pause(500);
		action.clickAction(deleteXpath);
		action.pause(500);
		action.clickAction(confirmXpath);
		action.pause(500);
		action.typeAction(querynameXpaht, namenew);
		action.pause(500);
		action.clickAction(querybtnXpath);
		action.pause(500);
		assertEquals(action.getTextAction(delectassretXpath), "暂无用户");
		action.pause(500);
	}

}

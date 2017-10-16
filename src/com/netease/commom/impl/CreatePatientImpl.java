/**
 * 
 */
package com.netease.commom.impl;

import com.netease.common.IAction;
import com.netease.common.ICreatePatient;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * @author Administrator
 */
public class CreatePatientImpl implements ICreatePatient {
	
	private static IAction action = new ActionImpl();
	String menuXpath = "//html/body/div/div[4]/div[1]/div/div/ul/li[2]/ul/li[1]";
	String creatBthXpath = "//html/body/div/div[4]/div[2]/div/div/div/div[2]/div/button";
	String nameXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/div/div/div/input";
    String brithdayXpath ="//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[2]/div/div/div/input";
    String phoneXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div[2]/div/div/div/input";
    String diseaseXpath  ="//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[10]/div/div/div[1]/input";
    String saveXpath = "//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[2]/button[1]";
    
    /* (non-Javadoc)
	 * @see com.netease.common.ICreatePatient#createPatientNormal()
	 */
	@Override
	public void createPatientNormal() {
		action.pause(500);
		action.clickAction(menuXpath);
		action.pause(500);
		action.clickAction(creatBthXpath);
		action.pause(1000);
		action.typeAction(nameXpath, "peterOne");
		action.pause(500);
		action.typeAction(brithdayXpath, "1990-06-29");
		action.clickAction("//html/body/div[1]/div[4]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/div/div");
		action.pause(500);
		action.typeAction(phoneXpath, "13462352626");
		action.pause(500);
//		action.typeAction(diseaseXpath, "高血压");
		action.pause(500);
		action.clickAction(saveXpath);
		action.pause(500);
//		action.assertEqualsAction("//html/body/script[4]", "创建用户成功");
	}

	/* (non-Javadoc)
	 * @see com.netease.common.ICreatePatient#createPatientLessInformation()
	 */
	@Override
	public void createPatientLessInformation() {
		// TODO Auto-generated method stub

	}

}

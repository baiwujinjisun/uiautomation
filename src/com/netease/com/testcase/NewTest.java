package com.netease.com.testcase;

import org.testng.annotations.Test;

import com.netease.commom.impl.ActionImpl;
import com.netease.common.IAction;



public class NewTest {
  IAction  action = new ActionImpl();
  @Test
  public void f() {
	 
	  action.openAction("https://static-qa.lifesense.com/eopen/index.html");
	  action.pause(500);
	  action.typeAction("//html/body/div[2]/div/div[2]/input[1]", "chengzhao.li@lifesense.com");
	  action.typeAction("//html/body/div[2]/div/div[2]/input[2]", "12345678");
	  action.clickAction("//html/body/div[2]/div/div[2]/div[4]");
	  action.pause(500);
	  action.clickAction("//html/body/div[1]/div/a[3]");
	  action.pause(500);
	  String test =  action.getTextAction("//html/body/div[2]/ul/li[3]/span");
	  System.out.println(test);
	
  }
}

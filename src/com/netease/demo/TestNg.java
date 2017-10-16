/*
 * Copyright (c) 2012-2013 NetEase, Inc. and other contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.netease.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.netease.dagger.BrowserEmulator;

/**
 * The demo to show TestNg's basic usage
 * @author ChenKan
 */
public class TestNg {

	String googleUrl = "https://static-qa.lifesense.com/eopen/index.html";
	 //String googleUrl = "http://www.google.com";
	 String searchBox = "//input[@name='q']";
	 String searchBtn = "//input[@name='btnK']";
	 BrowserEmulator be;
	 
	 String userName = "//html/body/div[2]/div/div[2]/input[1]";
	 String userPassword = "//html/body/div[2]/div/div[2]/input[2]";
	 String loginBtn = "//html/body/div[2]/div/div[2]/div[4]";
	 String enterpriseBtn = "//html/body/div[1]/div/a[3]";
	 //String text = ".//div[@class='wrap company_center' and contains(@style,'display: block')]//*span[text()='企业名称']/..";
	 String text = "//html/body/div[2]/ul/li[2]/span";
	 
	 //String editBtn = "//*[@id='J_editor_btn']";
	 

	 @BeforeClass
	 public void doBeforeClass() throws Exception {
	  be = new BrowserEmulator();
	 }

	 @Test
	 public void doTest(String keyword, String result) {
	  be.open(googleUrl);
	  //be.type(searchBox, keyword);
	  //be.click(searchBtn);
	  
	  be.type(userName, "chengzhao.li@lifesense.com");
	  be.type(userPassword, "12345678");
	  be.click(loginBtn);
	  be.click(enterpriseBtn);
	  
	  String infoName = be.getText(text);
	  System.out.print("info:"+infoName);
	  
	  //be.click(editBtn);

	  
	  be.expectTextExistOrNot(true, result, 5000);
	 }

}
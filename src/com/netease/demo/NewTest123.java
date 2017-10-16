package com.netease.demo;

import org.testng.annotations.Test;

import com.netease.dagger.BrowserEmulator;

public class NewTest123 {
	String googleUrl = "https://static-qa.lifesense.com/eopen/index.html";
	// String googleUrl = "http://www.google.com";
	String searchBox = "//input[@name='q']";
	String searchBtn = "//input[@name='btnK']";
	BrowserEmulator be;

	String userName = "//html/body/div[2]/div/div[2]/input[1]";
	String userPassword = "//html/body/div[2]/div/div[2]/input[2]";
	String loginBtn = "//html/body/div[2]/div/div[2]/div[4]";
	String enterpriseBtn = "//html/body/div[1]/div/a[3]";
	// String text =
	// ".//div[@class='wrap company_center' and contains(@style,'display: block')]//*span[text()='企业名称']/..";
	String text = "//html/body/div[2]/ul/li[2]/span";

	// String editBtn = "//*[@id='J_editor_btn']";

	@Test
	public void doTest() {
		be = new BrowserEmulator();
		be.open(googleUrl);
		// be.type(searchBox, keyword);
		// be.click(searchBtn);

		be.type(userName, "chengzhao.li@lifesense.com");
		be.type(userPassword, "12345678");
		be.click(loginBtn);
		be.click(enterpriseBtn);
		be.pause(500);
		String test = be.getText("//html/body/div[2]/ul/li[2]/span");
		be.pause(500);
//		String infoName = be.getText("");
		System.out.println("infoqwertyui:" + test);

		// be.click(editBtn);

	}
}

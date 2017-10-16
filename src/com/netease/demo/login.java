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

import static org.testng.Assert.assertEquals;

import com.netease.dagger.BrowserEmulator;

/**
 * The demo to show Dagger's basic usage
 * @author ChenKan
 */
public class login {

	public static void main(String[] args) {

		String googleUrl = "https://static-qa2.lifesense.com/healthpc/index.html#/";
		String usernampath = "//html/body/div/div[2]/div/div/div[3]/form/div[1]/div/div/input";
		String passwordpath = "//html/body/div/div[2]/div/div/div[3]/form/div[2]/div/div/input";
		String loginBtnpath = "//html/body/div/div[2]/div/div/div[3]/form/button";
		BrowserEmulator be = new BrowserEmulator();
		be.open(googleUrl);
		be.pause(2000);
		be.type(usernampath, "15902031512");
		be.type(passwordpath, "123456");
		be.click(loginBtnpath);
		be.pause(1000);
		assertEquals(be.getText("/html/body/div/div[4]/div[2]/div/div/div/div[2]/ul/li[1]/div/p/span"), "数据异常");
		be.quit();
	}
}

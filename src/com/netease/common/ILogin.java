/**
 * 
 */
package com.netease.common;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * @author Administrator
 */
public interface ILogin {
	
	/**
	 * 〈一句话功能简述〉登录<br>
	 * 〈功能详细描述>输入账号密码登录
	 */
	void baseLogin(String account,String password);
	
	/**
	 * 〈一句话功能简述〉登录<br>
	 * 〈功能详细描述> 只输入账号，没有输入密码登录
	 */
	void NoPasswodtLogin(String account);
	
	/**
	 * 〈一句话功能简述〉登录<br>
	 * 〈功能详细描述> 账号和密码都没有登录
	 */
	void NoAccountLogin();
	
	/**
	 * 〈一句话功能简述〉登录<br>
	 * 〈功能详细描述> 输入错误的密码
	 */
	void WrongPassword(String account, String password);

}

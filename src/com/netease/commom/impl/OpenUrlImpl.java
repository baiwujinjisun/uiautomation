package com.netease.commom.impl;

import com.netease.dagger.GlobalSettings;
import com.netease.common.IAction;
import com.netease.common.IOpenUrl;
import com.netease.commom.impl.ActionImpl;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述>
 * 
 * @author Administrator
 */
public class OpenUrlImpl implements IOpenUrl {

	/**
	 * 〈一句话功能简述〉打开健管平台页面<br>
	 * 〈功能详细描述> 打开健管平台页面
	 */
	private static IAction action = new ActionImpl();
	String url = GlobalSettings.url;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.common.IOpenUrl#OpenUrl()
	 */
	@Override
	public void openUrl() {
		action.openAction(url);
		action.pause(500);

	}

}

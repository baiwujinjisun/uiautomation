package com.netease.commom.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.netease.dagger.BrowserEmulator;
import com.netease.imagecheck.ImageProcess;
import com.netease.common.IAction;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * 
 * @author viking.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ActionImpl implements IAction{
	private static final Logger logger = Logger.getLogger(ActionImpl.class);
	
	private static BrowserEmulator be = new BrowserEmulator();

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#openAction(java.lang.String)
	 */
	public void openAction(String url) {
		be.open(url);
		be.getBrowserCore().manage().window().maximize();
		be.getBrowser().waitForPageToLoad("10000");
		be.pause(500);
	}
	
	public void closeAction() {
		if(be.getBrowserCore() != null){
			be.getBrowserCore().close();
		}
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#typeAction(java.lang.String, java.lang.String)
	 */
	public void typeAction(String xpath, String value) {
		be.type(xpath, value);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#typeAction(java.lang.String)
	 */
	public void typeAction(String xpath) {
		be.type(xpath, "suijishu");
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#clickAction(java.lang.String)
	 */
	public void clickAction(String xpath) {
		be.click(xpath);
		be.pause(500);
	}
	
	public void clickActionByID(String componenetID) {
		By by = By.id(componenetID);
		be.getBrowserCore().findElement(by).click();
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#expectElementExistOrNotAction(java.lang.String)
	 */
	public void expectElementExistOrNotAction(String xpath) {
		be.expectElementExistOrNot(true, xpath, 5000);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#expectTestExistOrNotAction(java.lang.String)
	 */
	public void expectTestExistOrNotAction(String xpath) {
		be.expectTextExistOrNot(true, xpath, 5000);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#getTextAction(java.lang.String)
	 */
	public String getTextAction(String xpath) {
		String s=be.getText(xpath);
		be.pause(500);
		return s;
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#inputKeyboardAction(java.lang.String)
	 */
	public void inputKeyboardAction(String text) {
		be.inputKeyboard(text);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#isElementPresentAction(java.lang.String)
	 */
	public boolean isElementPresentAction(String xpath) {
		boolean flag = be.isElementPresent(xpath, 5000);
		be.pause(500);
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#isTestPresentAction(java.lang.String)
	 */
	public boolean isTestPresentAction(String text) {
		boolean flag=be.isTextPresent(text, 5000);
		be.pause(500);
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#pressKeyboardAction(java.lang.String)
	 */
	public void pressKeyboardAction(String keyCode) {
		be.pressKeyboard(Integer.parseInt(keyCode));
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#selectAction(java.lang.String, java.lang.String)
	 */
	public void selectAction(String xpath, String text) {
		be.select(xpath, text);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#selectWindowAction(java.lang.String)
	 */
	public void selectWindowAction(String text) {
		be.selectWindow(text);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#pause(int)
	 */
	public void pause(int time) {
		be.pause(time);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#refresh()
	 */
	public void refresh() {
		be.refresh();
		be.pause(1500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#getJavaScript()
	 */
	public JavascriptExecutor getJavaScript() {
		JavascriptExecutor je = be.getJavaScriptExecutor();
		be.pause(500);
		return je;
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#elementSendValueAction(java.lang.String, org.openqa.selenium.By)
	 */
	public void elementSendValueAction(String value, By by) {
		be.getBrowserCore().findElement(by).sendKeys(value);
		be.pause(500);
	}
	
	public void elementSendValueActionByID(String inputValue, String componenetID) {
		By by = By.id(componenetID);
		be.getBrowserCore().findElement(by).sendKeys(inputValue);
		be.pause(500);
	}
	
	public void elementSendValueActionByXpath(String inputValue, String xPath) {
		be.getBrowserCore().findElementByXPath(xPath).sendKeys(inputValue);
	}
	
	public void clearValueActionByID(String componenetID) {
		By by = By.id(componenetID);
		be.getBrowserCore().findElement(by).clear();
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#executeScript(java.lang.String)
	 */
	public void executeScript(String js) {
		((JavascriptExecutor) be.getBrowserCore()).executeScript(js);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#switchToWindowAction(java.lang.String)
	 */
	public void switchToWindowAction(String text) {
		String currenthandle = be.getBrowserCore().getWindowHandle();
		Set<String> handles = be.getBrowserCore().getWindowHandles();
		for (String handle : handles) {
			if (text == "" || text == null) {//text为空默认显示当前页
				if (handle.equals(currenthandle)) {
					continue;
				} else {
					be.getBrowserCore().switchTo().window(handle);
				}
			} else {//text有值，显示指定页
				Object[] obj=handles.toArray();
				String s=obj[Integer.parseInt(text)].toString();
				be.getBrowserCore().switchTo().window(s);
			}
		}
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#switchToWindowAndCloseWindowAction(java.lang.String)
	 */
	public void switchToWindowAndCloseWindowAction(String text) {
		String currenthandle = be.getBrowserCore().getWindowHandle();
		Set<String> handles = be.getBrowserCore().getWindowHandles();
		for (String handle : handles) {
			if (text == "" || text == null) {//text为空默认显示当前页
				if (handle.equals(currenthandle)) {
					be.getBrowserCore().switchTo().window(currenthandle);
					be.getBrowserCore().close();
					continue;
				} else {
					be.getBrowserCore().switchTo().window(handle);
				}
			} else {//text有值，显示指定页
				Object[] obj=handles.toArray();
				be.getBrowser().selectWindow(obj[Integer.parseInt(text)].toString());
			}
		}
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#browser()
	 */
	public BrowserEmulator browser() {
		return be;
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#exit()
	 */
	public void exit() {
		be.quit();
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#assertEqualsAction(java.lang.String, java.lang.String)
	 */
	public void assertEqualsAction(String expect, String actual) {
		Assert.assertEquals(actual, expect);
		be.pause(300);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#assertTrueAction(boolean)
	 */
	public void assertTrueAction(boolean condition) {
		Assert.assertTrue(condition);
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#getImage(java.lang.String)
	 */
	public void getImage(String imagePath) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");// 设置日期格式
		String time = df.format(new Date());
		ImageProcess.screenShot(be.getBrowserCore(), imagePath, time.toString());
		logger.info("Get a image : "+time.toString());
		be.pause(500);
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#getImage(java.lang.String, java.lang.String)
	 */
	public void getImage(String imagePath, String imageName) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");// 设置日期格式
		String time = df.format(new Date());
		ImageProcess.screenShot(be.getBrowserCore(), imagePath, time.toString()+imageName);
		logger.info("Get a image : "+time.toString()+imageName);
		be.pause(500);
	}

	public void switchToFrame(String frame) {
		be.getBrowserCore().switchTo().frame(frame);
		be.pause(500);
	}

	public void switchToDefaultContent() {
		be.getBrowserCore().switchTo().defaultContent();
		be.pause(500);
	}

	public void pressKeyBoard(int keyCode) {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			logger.error("Robot initialize Fail : "+e.getMessage());
		}
		robot.keyPress(keyCode);
		robot.keyRelease(keyCode);
		be.pause(500);
	}
	
	/**
	 * 通过xpath定位光标
	 */
	public void focus(String xpath) {
		be.getBrowser().focus(xpath);
		be.pause(500);
	}

	public void alertClick() {
		Alert alert = be.getBrowserCore().switchTo().alert();
		alert.accept();
	}
	
	/* (non-Javadoc)
	 * @see com.netease.common.IAction#mouseOveraction()
	 */
	@Override
	public void mouseOveraction(String xpath) {
		be.mouseOver(xpath);
		be.pause(500);
		
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#mouseOverOtherAciton(java.lang.String, java.lang.String)
	 */
	@Override
	public void mouseOverOtherAciton(String xpath0, String xpath) {
		be.mouseOverOther(xpath0, xpath);
		be.pause(500);
		
	}

	/* (non-Javadoc)
	 * @see com.netease.common.IAction#switchToWindowAction(java.lang.String, java.lang.String)
	 */
	@Override
	public void switchToWindowAction(String current_handle, Set<String> all_handles) {
		// 循环判断将当前句柄从所有句柄中移除，剩下的就是你想要的句柄
		Iterator<String> it = all_handles.iterator();
		String handle = null;

		while (it.hasNext()) {
			handle = it.next();
			System.out.println("所有句柄——+++++++---" + handle);
			if (current_handle == handle)
				continue;
			be.getBrowserCore().switchTo().window(handle);
		}
		be.pause(500);
	}
}

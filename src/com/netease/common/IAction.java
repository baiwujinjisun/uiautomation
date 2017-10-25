package com.netease.common;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.netease.dagger.BrowserEmulator;

/**
 * 〈一句话功能简述〉动作关键字驱动接口<br>
 * 〈功能详细描述> 封装常用的selenium动作元素
 * @author Administrator
 */
public interface IAction {
	
	/**
	 * 〈一句话功能简述〉打开动作<br>
	 * 〈功能详细描述> 打开指定的url
	 * @param url 指定String类型url入参
	 */
	void openAction(String url);
	
	/**
	 * 〈一句话功能简述〉关闭动作<br>
	 * 〈功能详细描述> 关闭浏览器
	 */
	void closeAction();
	
	/**
	 * 〈一句话功能简述〉输入动作<br>
	 * 〈功能详细描述> 在指定的元素上输入指定的值
	 * @param xpath 入参String类型元素xpath
	 * @param value 入库String类型指定值
	 */
	void typeAction(String xpath,String value);
	
	/**
	 * 〈一句话功能简述〉输入动作<br>
	 * 〈功能详细描述> 在指定的元素上输入随机的值
	 * @param xpath 入参String类型元素xpath
	 */
	void typeAction(String xpath);
	
	/**
	 * 功能描述: 点击动作<br>
	 * 〈功能详细描述〉在指定的元素上进行点击操作
	 * @param xpath 入参String类型元素xpath
	 */
	void clickAction(String xpath);
	
	/**
	 * 功能描述: 通过组件ID执行点击动作<br>
	 * 〈功能详细描述〉
	 * @param componenetID
	 */
	void clickActionByID(String componenetID);
	
	/**
	 * 功能描述: 判断元素存在动作<br>
	 * 〈功能详细描述〉 判断指定xpath的元素是否存在
	 * @param xpath 入参String类型元素xpath
	 */
	void expectElementExistOrNotAction(String xpath);
	
	/**
	 * 功能描述: 判断文本值存在动作<br>
	 * 〈功能详细描述〉判断指定xpath的文本值是否存在
	 * @param xpath 入参String类型元素xpath
	 */
	void expectTestExistOrNotAction(String xpath);
	
	/**
	 * 功能描述: 获取值动作<br>
	 * 〈功能详细描述〉 获取指定位置的文本值
	 * @param xpath 入参String类型元素xpath
	 */
	String getTextAction(String xpath);
	
	/**
	 * 功能描述: 键盘输入动作<br>
	 * 〈功能详细描述〉模拟输入键盘上的值
	 * @param text 入参String类型值
	 */
	void inputKeyboardAction(String text);
	
	/**
	 * 功能描述: 判断元素可见动作<br>
	 * 〈功能详细描述〉对指定路径的元素判断是否存在或可见
	 * @param xpath 入参String类型元素xpath
	 * @return 返回true或false
	 */
	boolean isElementPresentAction(String xpath);
	
	/**
	 * 功能描述: 判断文本可见动作<br>
	 * 〈功能详细描述〉对指定路径的元素中文本值判断是否存在或可见
	 * @param text 入参String类型元素text
	 * @return 返回true或false
	 */
	boolean isTestPresentAction(String text);
	
	/**
	 * 功能描述: 键盘输入事件动作<br>
	 * 〈功能详细描述〉模拟键盘输入动作，只能输入为keyCode类型
	 * @param keyCode 如：KeyEvent.VK_TAB;KeyEvent.Enter
	 */
	void pressKeyboardAction(String keyCode);
	
	/**
	 * 功能描述: 选择框动作<br>
	 * 〈功能详细描述〉选择框操作，找到选择框中某个选
	 * @param xpath 入参String类型元素xpath
	 * @param text 入参String类型选项值
	 */
	void selectAction(String xpath,String text);
	
	/**
	 * 功能描述: 选择网页Tab动作<br>
	 * 〈功能详细描述〉根据网页标题选择网页窗口或者tab
	 * @param text 入参String类型网页标题值
	 */
	void selectWindowAction(String text);
	
	/**
	 * 功能描述: 暂停动作<br>
	 * 〈功能详细描述〉执行流程暂定一定时间
	 * @param time 指定暂停时间
	 */
	void pause(int time);
	
	/**
	 * 功能描述: 刷新动作<br>
	 * 〈功能详细描述〉 执行浏览器页面刷新
	 */
	void refresh();
	
	/**
	 * 功能描述: 获取JavaScrip动作<br>
	 * 〈功能详细描述〉获得页面JavaScript
	 * @return 返回JavaScript
	 */
	JavascriptExecutor getJavaScript();
	
	/**
	 * 功能描述: 赋值动作<br>
	 * 〈功能详细描述〉找到某一元素并且给予相应的值<br>
	 *一般用再对文本输入框的元素定位和输入相应值
	 * @param value 入参String类型相应的输入值
	 * @param by 入参By查找到元素
	 */
	void elementSendValueAction(String value,By by);
	
	/**
	 * 功能描述: 通过组件ID输入指定字符串<br>
	 * 〈功能详细描述〉
	 * @param inputValue
	 * @param xPath
	 */
	void elementSendValueActionByXpath(String inputValue,String xPath);
	
	/**
	 * 功能描述: 通过组件ID输入指定字符串<br>
	 * 〈功能详细描述〉
	 * @param inputValue 
	 * @param componenetID 组件ID
	 */
	void elementSendValueActionByID(String inputValue,String componenetID);
	
	/**
	 * 功能描述: 通过组件ID清空输入框里的内容<br>
	 * 〈功能详细描述〉
	 * @param inputValue 
	 * @param componenetID 组件ID
	 */
	void clearValueActionByID(String componenetID);
	
	/**
	 * 
	 * 功能描述: 执行Js动作<br>
	 * 〈功能详细描述〉在页面中执行指定的js
	 * @param js 入参String类型的脚本
	 */
	void executeScript(String js);
	
	/**
	 * 功能描述: 切换并关闭动作<br>
	 * 〈功能详细描述〉切换到新浏览器窗口, 并关闭原窗口
	 * @param text 入参String类型窗口名称
	 */
	void switchToWindowAndCloseWindowAction(String text);
	
	/**
	 * 功能描述: 预留原生selenium元素<br>
	 * 〈功能详细描述〉可使用原生selenium动作进行操作
	 * @return
	 */
	BrowserEmulator browser();
	
	/**
	 * 功能描述: 退出关闭<br>
	 * 〈功能详细描述〉 退出selenium
	 */
	void exit();
	
	/**
	 * 功能描述: 对比校验<br>
	 * 〈功能详细描述〉判断预期值与实际值是否一致
	 * @param expect 预期值
	 * @param actual 实际值
	 */
	void assertEqualsAction(String expect,String actual);
	
	/**
	 * 功能描述: 预期真校验<br>
	 * 〈功能详细描述〉判断预期或者boolean表达式是否为True
	 * @param condition
	 */
	void assertTrueAction(boolean condition);
	
	/**
	 * 功能描述: 网页截图<br>
	 * 〈功能详细描述〉页面截图后保存到指定路径
	 * @param imagePath 图片保存路径
	 */
	
	void getImage(String imagePath);
	/**
	 * 功能描述: 网页截图<br>
	 * 〈功能详细描述〉页面截图后保存为指定名称到指定路径
	 * @param imagePath 图片保存路径
	 * @param imageName 图片名称
	 */
	void getImage(String imagePath,String imageName);
	
	/**
	 * 功能描述: 切换到指定frame<br>
	 * 〈功能详细描述〉
	 * @param frame 传入的是id
	 */
	void switchToFrame(String frame);
	
	
	/**
	 * 功能描述: 切换回默认的frame<br>
	 * 〈功能详细描述〉
	 */
	void switchToDefaultContent();
	
	/**
	 * 功能描述: 通过robot点击键盘按钮<br>
	 * 〈功能详细描述〉
	 * @param keyCode int 如：KeyEvent.VK_ENTER
	 */
	void pressKeyBoard(int keyCode);
	
	/**
	 * 功能描述: 通过xpath定位光标<br>
	 * 〈功能详细描述〉
	 * @param xpath
	 */
	void focus(String xpath);
	
	/**
	 * 功能描述: 通过alert点击确定按钮<br>
	 * 〈功能详细描述〉
	 * 点击确定按钮
	 */
	void alertClick();
	
	/**
	 * 〈一句话功能简述〉移动鼠标<br>
	 * 〈功能详细描述> 移动鼠标到制定元素上
	 */
    void mouseOveraction(String xpath);
    
    
	/**
	 * 〈一句话功能简述〉移动鼠标<br>
	 * 〈功能详细描述> 就是鼠标移动到页面中某按钮或菜单，自动弹出二级菜单或下拉菜单，再自动点击其中的二级菜单或下拉列表
	 */
	void mouseOverOtherAciton(String xpath0,String xpath);

	/**
	 * 〈一句话功能简述〉动作关键字驱动接口<br>
	 * 〈功能详细描述> 封装常用的selenium动作元素
	 */
	void switchToWindowAction(String current_handle, Set<String> all_handles);
}

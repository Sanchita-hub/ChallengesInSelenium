package businesscomponents;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.framework.Status;
import com.utility.framework.Util;

import supportlibraries.ScriptHelper;

public class SeleniumActionClass extends GeneralComponents {
	
	protected String General_Sheet = "General";
	
	
	public SeleniumActionClass(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	public void accountQualificationPP(){

	}
	
	public void selCoveragePP(){
		
	}
	
	public void CompanyInfoPP(){
		
	}
	
	public void DNOPP() {
			
	}
	
	public void EPLPP() {
		}
	
	public void FIDPP(){
		
	}
	
	public void CRIPP(){
		}
	
	public void lossHistoryPP(){
		
	}
	
	public void createQuotePP(){
			}

	
	
	
	public  void click_it(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		find_element(element, strategy).click();
	}

	public  void click_it(String element) {
		jQueryAJAXCallsHaveCompleted();
		find_element(element).click();
	
	}

	public  By get_element(String element, String strategy) {
		By ele = null;
		switch (strategy) {
		case "id":
			ele = By.id(element);
			break;
		case "name":
			ele = By.name(element);
			break;
		case "class":
			ele = By.className(element);
			break;
		case "lnk_txt":
			ele = By.linkText(element);
			break;
		case "partial_lnk_txt":
			ele = By.partialLinkText(element);
			break;
		case "css":
			ele = By.cssSelector(element);
			break;
		case "xpath":
			ele = By.xpath(element);
			break;
		case "tagname":
			ele = By.tagName(element);
			break;
		}

		return ele;
	}

	public  By get_element(String element) {
		return By.xpath(element);
	}

	public  void wait_for_element_to_be_visible(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(get_element(element, strategy)));
	}

	public  void wait_for_element_to_be_visible(String element) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(get_element(element)));
	}

	public  void wait_for_element_to_be_invisible(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(get_element(element, strategy)));
	}

	public  void wait_for_element_to_be_invisible(String element) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(get_element(element)));
	}

	public  void wait_for_element_to_be_clickable(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(get_element(element, strategy)));
	}

	public  void wait_for_element_to_be_clickable(String element) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(get_element(element)));
	}

	public  void wait_for_element_to_be_clickable(WebElement element) {
		jQueryAJAXCallsHaveCompleted();
		WebDriverWait wait = new WebDriverWait((WebDriver) driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public  boolean check_if_available(WebElement element) {
		jQueryAJAXCallsHaveCompleted();
		boolean temp;
		try {
			if (element.isDisplayed()) {
				temp = true;
			} else {
				temp = false;
			}
		} catch (Exception E) {
			//report.updateTestLog("Exception in method: check_if_available: "+element, E.getMessage(), Status.DONE);
			temp = false;
		}
		return temp;

	}

	public  void type_text(String text, String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		WebElement ele = find_element(element, strategy);
		ele.clear();
		ele.sendKeys(text);
	}

	public  void type_text(String text, String element) {
		jQueryAJAXCallsHaveCompleted();
		WebElement ele = find_element(element);
		ele.clear();
		ele.sendKeys(text);
	}

	public  void text_clear(String element) {
		jQueryAJAXCallsHaveCompleted();
		WebElement ele = find_element(element);
		ele.clear();

	}

	public  void select_text(String text, String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element, strategy));
		sel.selectByVisibleText(text);
	}

	public  void select_text(String text, String element) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element));
		sel.selectByVisibleText(text);
	}

	public  void select_value(String text, String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element, strategy));
		sel.selectByValue(text);
	}

	public  void select_value(String text, String element) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element));
		sel.selectByValue(text);
	}

	public  void select_index(int index, String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element, strategy));
		sel.selectByIndex(index);
	}

	public  void select_index(int index, String element) {
		jQueryAJAXCallsHaveCompleted();
		Select sel = new Select(find_element(element));
		sel.selectByIndex(index);
	}

	public  String get_text(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		String temp;
		try {
			temp = find_element(element, strategy).getText();
		} catch (Exception E) {
			report.updateTestLog("Exception in method: get_text: "+element+" "+strategy, E.getMessage(), Status.FAIL);
			temp = "Error";
		}
		return temp;
	}

	public  String get_text(String element) {
		jQueryAJAXCallsHaveCompleted();
		String temp;
		try {
			return find_element(element).getText();
		} catch (Exception E) {
			//report.updateTestLog("Exception in method: get_text: "+element, E.getMessage(), Status.FAIL);
			temp = "Error";
		}
		return temp;
	}

	public  WebElement find_element(String element, String strategy) {
		jQueryAJAXCallsHaveCompleted();
		WebElement temp;
		try {
			By ele = get_element(element, strategy);
			temp = driver.findElement(ele);
		} catch (Exception E) {
			report.updateTestLog("Exception in method: find_element: "+element+" "+strategy, E.getMessage(), Status.DONE);
			temp = null;
		}
		return temp;
	}

	public  WebElement find_element(String element) {
		jQueryAJAXCallsHaveCompleted();
		WebElement temp;
		try {
			temp = driver.findElement(By.xpath(element));
		} catch (Exception E) {
			report.updateTestLog("Exception in method: find_element: "+element, E.getMessage(), Status.DONE);
			temp = null;
		}
		return temp;
	}

	public  void select_drop_down_value(String text, String ul_element) {
		jQueryAJAXCallsHaveCompleted();
		List<WebElement> li_elements = find_element(ul_element).findElements(By.tagName("a"));
		for (int i = 0; i < li_elements.size(); i++) {
			if (li_elements.get(i).getText().trim().equalsIgnoreCase(text.trim())) {
				confirm_click_ele(li_elements.get(i));
				break;
			}
		}
	}

	public  void select_drop_down_value_ele(String text, WebElement ul_element) {
		jQueryAJAXCallsHaveCompleted();
		List<WebElement> li_elements = ul_element.findElements(By.tagName("a"));
		for (int i = 0; i < li_elements.size(); i++) {
			if (li_elements.get(i).getText().trim().equalsIgnoreCase(text.trim())) {
				confirm_click_ele(li_elements.get(i));
				break;
			}
		}
	}

	public void waitForPageLoad(int s) throws InterruptedException
	{
		Thread.sleep(s);
	}
	
	public void leftClick() throws AWTException
	  {
		Robot robot = new Robot();
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	  }
	  
	public String getData(String sheetName, String fieldName){
		String value=dataTable.getData(sheetName, fieldName);
		return value;
	}
	public  void wait_and_click(String element) {
		wait_for_element_to_be_clickable(element);
		confirm_click(element);
	}

	public  void wait_and_type(String text, String element) {
		wait_for_element_to_be_visible(element);
		type_text(text, element);
	}

	public  boolean is_displayed(String element, String strategy) {
		boolean temp = true;
		try{
			temp= find_element(element, strategy).isDisplayed();
		}
		catch(Exception E){
			//report.updateTestLog("Exception in method: is_displayed: "+element+" "+strategy, E.getMessage(), Status.DONE);
			temp=false;
		}
		return temp;
	}

	public  boolean is_displayed(String element) {
		boolean temp = true;
		try{
			temp= find_element(element).isDisplayed();
		}
		catch(Exception E){
			//report.updateTestLog("Exception in method: is_displayed: "+element, E.getMessage(), Status.DONE);
			temp=false;
		}
		return temp;
	}
	
	public  void isDisplayed(String element, String fieldName) {
		try{
			if (find_element(element).isDisplayed()){
				report.updateTestLog("Verify "+fieldName+"Presence", fieldName+" is present on the UI", Status.PASS);	
			}else{
				report.updateTestLog("Verify "+fieldName+"Presence", fieldName+" is NOT present on the UI", Status.FAIL);
			}
			
		}
		catch(Exception E){
			report.updateTestLog("Verify "+fieldName+"Presence", fieldName+" is NOT present on the UI", Status.FAIL);
		}
	
	}
	
	
	public  void checkImage(String element, String imageName) {
		try{
			WebElement imageFile = find_element(element);
			//Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
			JavascriptExecutor executor = (JavascriptExecutor) driver.getWebDriver();
			Boolean imagePresent = (Boolean) executor.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
			if(!imagePresent){
				report.updateTestLog("Verify "+imageName+"Present", imageName+" is NOT present", Status.FAIL);
			}else{
				report.updateTestLog("Verify "+imageName+"Present", imageName+" is present", Status.PASS);
			}
		}
		catch(Exception E){
			report.updateTestLog("Verify "+imageName+"Present", imageName+" is NOT present", Status.FAIL);			
		}
	}
	
	public  boolean is_enabled(String element) {
		boolean temp = true;
		try{
			temp= find_element(element).isEnabled();
		}
		catch(Exception E){
			//report.updateTestLog("Exception in method: is_displayed: "+element, E.getMessage(), Status.DONE);
			temp=false;
		}
		return temp;
	}

	public  boolean list_contains(WebElement ul_element, String text) {
		boolean temp;
		try{
		List<WebElement> li_elements = ul_element.findElements(By.tagName("li"));
		boolean flag = true;
		for (int i = 0; i < li_elements.size(); i++) {
			if (!text.contains(li_elements.get(i).getText().replaceAll("\\s", ""))) {
				flag = false;
				break;
			}
		}
		temp= flag;
		}
		catch(Exception E){
			temp=false;
			//report.updateTestLog("Exception in method: list_contains: "+ text, E.getMessage(), Status.DONE);
		}
		return temp;
	}

	public  boolean is_available(String element) {
		try {
			driver.findElement(By.xpath(element));
			return true;
		} catch (Exception ix) {
			//report.updateTestLog("Exception in method: is_available: "+element, ix.getMessage(), Status.DONE);
			return false;
		}
	}

	public  WebElement get_visible_element(String ele) {
		WebElement x = null;
		try {
			List<WebElement> elements = find_elements(ele);
			for (WebElement e : elements) {
				if (e.isDisplayed()) {
					x = e;
					break;
				}
			}
		} catch (Exception e) {
			report.updateTestLog("Exception in method: get_visible_element: "+ele, e.getMessage(), Status.DONE);
		}
		return x;
	}

	public  boolean is_available_and_clickable(String element) {
		return ((find_elements(element).size() != 0) && (find_element(element).isDisplayed()));
	}

	public  boolean is_available_and_displayed(String element) {
		boolean temp;
		try {
			if (find_elements(element).size() != 0) {
				if (find_element(element).isDisplayed()) {
					temp = true;
				} else {
					temp = false;
				}
			} else {
				temp = false;
			}
		} catch (Exception E) {
			//report.updateTestLog("Exception in method: is_available_and_clickable: "+element, E.getMessage(), Status.DONE);
			temp = false;
		}
		return temp;

	}

	public  boolean is_available(String element, String strategy) {
		boolean temp;
		try{
			temp = find_elements(element, strategy).size() != 0;
		}
		catch(Exception E){
			temp=false;
			//report.updateTestLog("Exception in method: is_available", E.getMessage(), Status.DONE);
		}
		return temp;
	}

	public  void click_if_available(String element, String strategy) {
		if (is_available(element, strategy)) {
			click_it(element, strategy);
		}
	}

	public  void click_if_available(String element) {
		if (is_available(element)) {
			confirm_click(element);
		}
	}

	public void click_if_visible(String element, String strategy) {
		if (is_displayed(element, strategy)) {
			click_it(element, strategy);
		}
	}

	public  void click_if_visible(String element) {
		if (is_displayed(element)) {
			confirm_click(element);
		}
	}

	public  void click_and_wait(String element, String strategy) {
		click_it(element, strategy);
		wait_for_element_to_be_invisible(element, strategy);
	}

	public  void click_and_wait(String element) {
		confirm_click(element);
		wait_for_element_to_be_invisible(element);
	}

	public  void wait_click_wait(String element) {
		wait_for_element_to_be_clickable(element);
		confirm_click(element);
		wait_for_element_to_be_invisible(element);
	}

	public  void wait_click_wait(String element, String strategy) {
		wait_for_element_to_be_clickable(element, strategy);
		click_it(element, strategy);
		wait_for_element_to_be_invisible(element, strategy);
	}

	public  void js_click(String element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver.getWebDriver();
		executor.executeScript("arguments[0].click();", find_element(element));
	}

	public  void js_click(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver.getWebDriver();
		executor.executeScript("arguments[0].click();", element);
	}

	public  List<WebElement> find_elements(String element, String strategy) {
		return driver.findElements(get_element(element, strategy));
	}

	public  List<WebElement> find_elements(String element) {
		return driver.findElements(By.xpath(element));
	}

	public  void select_drop_down(String text, String button) throws InterruptedException {
		String ul_element = button + "/../ul";
		wait_and_click(button);
		Thread.sleep(1000L);
		select_drop_down_value(text, ul_element);
	}

	public  void js_select_drop_down(String text, String button) {
		String ul_element = button + "/../ul";
		js_click(button);
		select_drop_down_value(text, ul_element);
	}

	public  void yes_no(String yes_no, String element) throws InterruptedException {
		switch (yes_no.toLowerCase()) {
		case "yes":
			confirm_click(element + "/following::span[1]");
			break;
		case "no":
			confirm_click(element + "/following::span[2]");
			break;
		}
		Thread.sleep(1000L);
	}

	public  void yes_no(String yes_no, WebElement element) {
		switch (yes_no.toLowerCase()) {
		case "yes":
			confirm_click_ele(element.findElement(By.xpath("./following::span[1]")));
			break;
		case "no":
			confirm_click_ele(element.findElement(By.xpath("./following::span[2]")));
			break;
		}
	}

	public  void important_click(String element) throws InterruptedException {
		Thread.sleep(2000L);
		wait_click_wait(element);
		Thread.sleep(2000L);
	}

	public  void select_option(String option, String element) {
		confirm_click(element + "/following::span[contains(text(),'" + option + "')][1]");
	}

	public  void select_drop_down_index(int index, String button) {
		jQueryAJAXCallsHaveCompleted();
		String ul_element = button + "/../ul";
		wait_and_click(button);
		List<WebElement> li_elements = find_element(ul_element).findElements(By.tagName("a"));
		confirm_click_ele(li_elements.get(index));
	}

	/*
	 * public  void confirm_click(WebElement element){ try{
	 * element.click(); } catch(Exception e){ try{ js_click(element); }
	 * catch(Exception ee){ mouse_click(element); } } }
	 */

	public  void confirm_click_ele(WebElement element) {
		try {
			wait_for_element_to_be_clickable(element);

			element.click();
		} catch (Exception e) {
			try {
				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		} catch (Error e) {
			try {

				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		}
	}

	public  void confirm_click(String ele) {
		WebElement element = find_element(ele);
		try {
			wait_for_element_to_be_clickable(ele);
			element.click();
			
		} catch (Exception e) {
			try {
				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		} catch (Error e) {
			try {
				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		}
	}
	
	public  void confirm_click_withIndex(String ele) {
		List<WebElement> element1 = find_elements(ele);
		WebElement element = element1.get(1);
		try {
			wait_for_element_to_be_clickable(ele);
			element.click();
			
		} catch (Exception e) {
			try {
				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		} catch (Error e) {
			try {
				js_click(element);
			} catch (Exception ee) {
				mouse_click(element);
			} catch (Error ee) {
				mouse_click(element);
			}
		}
	}

	public  void mouse_click(WebElement element) {
		Actions act_click = new Actions(driver.getWebDriver());
		act_click.moveToElement(element);
		act_click.click(element);
		Action action = act_click.build();
		action.perform();
	}

	public  void action_click(String element) {
		WebElement ele = driver.findElement(By.xpath(element));

		Actions actions = new Actions(driver);

		actions.moveToElement(ele).click().perform();
	}
	
	/*
	 * Find all the available links on the URL
	 */
	public void findAllLinksWithHref(){
		
		List<WebElement> elementList = new ArrayList();
		elementList = driver.findElements(By.tagName("a"));
		elementList.addAll(driver.findElements(By.tagName("img")));
		//List finalList = new ArrayList();
        System.out.println("Total Number of Links:" +elementList.size());
        for(int i=0;i<elementList.size();i++){
        	WebElement ele = elementList.get(i);
        	String url = ele.getAttribute("href");
        	System.out.println("URL to be tested: " +url);
        	if(url != null && !url.isEmpty() && !url.equalsIgnoreCase("javascript:void(0);")){
        	   validateAllLinks(url);
        	}
        }        
	}
	
	/*
	 * Find if the Links are working fine or broken
	 */
	public void validateAllLinks(String linkURL){
		if (linkURL != null){
		try 
        {
           URL url = new URL(linkURL);
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           httpURLConnect.setConnectTimeout(3000);
           httpURLConnect.connect();
           if(httpURLConnect.getResponseCode()==200)
           {
               //System.out.println(linkURL+" - "+httpURLConnect.getResponseMessage());
               report.updateTestLog("Verify ActiveLink", linkURL+"- is active", Status.PASS);
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               //System.out.println(linkURL+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
               report.updateTestLog("Verify ActiveLink", linkURL+"- is NOT active", Status.FAIL);
            }
        } catch (Exception e) {
               //System.out.println("Process threw a exception on validating this");
               report.updateTestLog("Verify ActiveLink", linkURL+"- is NOT active and throwing exception", Status.FAIL);
        }	
		}
	}

	public  ExpectedCondition<Boolean> jQueryAJAXCallsHaveCompleted() {
		return new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return (Boolean) ((JavascriptExecutor) driver).executeScript(
						"return (window.jQuery != null) && (jQuery.active === 0) && ($(':animated').length == 0);");
			}
		};
	}
	
	public static void wait_for_loading_to_complete() {

		while ((((JavascriptExecutor) driver.getWebDriver()).executeScript(
				"document.evaluate('//*[contains(@class,\"loading\") and not(contains(@class,\"hidden\"))]', body, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;") != null)) {
		}

		while ((((JavascriptExecutor) driver.getWebDriver()).executeScript(
				"document.evaluate('//*[contains(@src,\"loading.gif\") and not(contains(@style,\"display:none\"))]', body, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;") != null)) {
		}

		while ((((JavascriptExecutor) driver.getWebDriver()).executeScript(
				"document.evaluate('//*[contains(@src,\"loading-img.gif\") and not(contains(@class,\"display:none\"))]', body, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;") != null)) {
		}

	}
	
	public void pressTab() throws InterruptedException, AWTException{
		Robot robot=new Robot();
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	public void pressSpace() throws InterruptedException, AWTException{
		Robot robot=new Robot();
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
	}
	public void pressEnter() throws InterruptedException, AWTException{
		Robot robot=new Robot();
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void scrollIntoView(Object args) throws InterruptedException{
		JavascriptExecutor executor = (JavascriptExecutor) driver.getWebDriver();
		((JavascriptExecutor) driver.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", args);
		executor.executeScript("arguments[0].click();", args);
	}
	public void js_mouse_click(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver.getWebDriver();
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", element);
	}
	public void mouseClick(WebElement element){
		Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
 
	}
	public void takeScreenshotForAlert() throws AWTException, IOException{
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("D:\\FullScreenshotRobot.png"));
	}
}

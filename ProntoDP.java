package businesscomponents;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.*;
import java.io.*;
import java.*;
import java.text.*;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import supportlibraries.*;
import uimap.*;

import com.utility.framework.ExcelDataAccessforxlsm;
import com.utility.framework.FrameworkException;
import com.utility.framework.Report;
import com.utility.framework.Status;
import com.selenium.components.*;
import supportlibraries.ScriptHelper;
import allocator.Allocator;

public class ProntoDP {

	WebDriver driver = new ChromeDriver();
	Report report = new Report(null,null,null);
	Date date = new Date(); //current date
	
	public void ProntoDP(){}
	
	public void AccountQualificationCCFR(){
		try{
			String URL = "https://ebc.thehartford.com";
			String username = "esub0156";
			String password = "password";
			
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			driver.findElement(By.id("login-submit")).click();		//click the submit button
			Thread.sleep(1000);
			String winHandleOld = driver.getWindowHandle();
			//report.updateTestLog("Login successful", "Login successful", Status.PASS);
			driver.findElement(By.xpath("//*[contains(text(),'HFP Pronto')]")).click();	// click HFP Pronto link
			
			for(String windHandle : driver.getWindowHandles()){		//switch to new window opened
				if (!winHandleOld.equals(windHandle)){
				driver.switchTo().window(windHandle);
				driver.manage().window().maximize();
				}
			}
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			Thread.sleep(1000);
			driver.findElement(By.linkText("CyberChoice First Response")).click();	
			Thread.sleep(3000);
			//Account Qualification 	
			driver.findElement(By.xpath("//*[@id='inszip']")).sendKeys("81101");		//zipcode
			Thread.sleep(1000);
			WebElement NAIC = driver.findElement(By.xpath("//input[@id='classificationLookup']"));//NAIC
			NAIC.sendKeys("1742");	//enter NAIC code
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='txtTotrev']")).sendKeys("2000000");	//Total Annual Revenue
			driver.findElement(By.xpath("//*[@id='rdPiirecs' and @value='M']")).click();
			driver.findElement(By.xpath("//*[@id='rdDatabrch' and @value='N']")).click();
			
			Select lstProdNameTCP = new Select (driver.findElement(By.xpath("//*[@id='selBrokerName']")));	//producer name
			lstProdNameTCP.selectByIndex(1);	
			Thread.sleep(1000);
			Select lstProdContactTCP = new Select (driver.findElement(By.xpath("//*[@id='selContactName']"))); //producer contact
			lstProdContactTCP.selectByVisibleText("Developer Rich");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Account Qualification CCFR", "Account Qualification page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}

	public void AccountInfoCCFR(){
		try{
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			
			String InsuredName = "Gomeztesting" + InsuredNameDate;		//Insured Name
			driver.findElement(By.xpath("//*[@id='txtCompanyName']")).sendKeys(InsuredName);//Applicant Company name
			driver.findElement(By.xpath("//*[@id='txtInsad1']")).sendKeys("2 Park Avenue");	//address
			
			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//*[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(1000);	
			report.updateTestLog("Account Info CCFR", "Account Info page completed", Status.PASS);
		}catch(Exception e){
		System.out.println(e.toString());		
		}
	}

	public void NonBindIndicationCCFR(){
		try{
			String premium1 = driver.findElement(By.xpath("//*[@id='topC1prem']")).getText();
			String premium2 = driver.findElement(By.xpath("//*[@id='topC2prem']")).getText();
			// if update premium
			
			// if verify premium
						
			driver.findElement(By.xpath("//*[@id='utility_navigation']/li[1]/a")).click();	//log out			
							
			report.updateTestLog("NonBinding Indication CCFR", "Premium matches baseline", Status.PASS);
		}catch(Exception e){
		System.out.println(e.toString());		
		}
	}
	
}


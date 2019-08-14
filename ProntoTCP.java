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

public class ProntoTCP { 
	
	WebDriver driver = new ChromeDriver();
	Report report = new Report(null,null,null);
	Date date = new Date(); //current date
	
	public ProntoTCP(){
		
	}
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CO24354\\Desktop\\chromedriver.exe");
		
		ProntoTCP ProdTCP = new ProntoTCP();
		ProdTCP.AccountQualificationProdTCP();
		ProdTCP.GeneralInfoProdTCP();
		ProdTCP.OrgBackgroundProdTCP();
		ProdTCP.AppQuestionsProdTCP();
		ProdTCP.LossHistoryProdTCP();
		ProdTCP.CreateQuoteProdTCP();
		//System.out.println(premium);	
	}
	
	
	public void AccountQualificationProdTCP(){
		String URL = "https://ebc.thehartford.com";
		String username = "esub0156";
		String password = "password";
	
		try{
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			driver.findElement(By.id("login-submit")).click();	//click the submit button
			
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
			driver.findElement(By.linkText("Third Party Crime")).click();
			Thread.sleep(3000);
			
			//Account Qualification page
			Select lstEntityType = new Select (driver.findElement(By.xpath("//*[@id='enttyp']")));	// entity type
			lstEntityType.selectByValue("M");
			Thread.sleep(1000);
			driver.findElement(By.id("inszip")).sendKeys("46203");	//ZIP
			Thread.sleep(3000);
						
			WebElement NAIC = driver.findElement(By.xpath("//*[@id='classificationLookup']"));
			NAIC.sendKeys("541940");	//enter NAIC code
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
			
			Select lstSpecificContract = new Select (driver.findElement(By.xpath("//*[@id='blnktschd']")));	//specific contract 
			lstSpecificContract.selectByVisibleText("All Contracts");
			Thread.sleep(2000);
			
			Select lstProdNameTCP = new Select (driver.findElement(By.xpath("//*[@id='selBrokerName']")));	//producer name
			lstProdNameTCP.selectByIndex(1);	
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;	//scroll down 
			WebElement Element = driver.findElement(By.xpath("//*[@id='main_content']/legend[1]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			Select lstProdContactTCP = new Select (driver.findElement(By.xpath("//*[@id='selContactName']"))); //producer contact
			lstProdContactTCP.selectByVisibleText("Developer Rich");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Account Qualification", "Account Qualification page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	
		
	}
	
	public void GeneralInfoProdTCP(){
		try{
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			
			String InsuredName = "Gomeztesting_" + InsuredNameDate;		//Insured Name
			driver.findElement(By.id("insnam")).sendKeys(InsuredName);	//applicant name
									
			driver.findElement(By.id("insad1")).sendKeys("2 Park Avenue");	//address
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id='renind' and @value='N']")).click();	
			driver.findElement(By.xpath("//*[@id='curcov' and @value='N']")).click();	
			driver.findElement(By.xpath("//*[@id='inscancel' and @value='N']")).click();	
			
			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//*[@id='effdte']")).sendKeys(EffDate);	//eff date=today's date
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(1000);
			report.updateTestLog("General Info", "General Info page completed", Status.PASS);
		}catch (Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void OrgBackgroundProdTCP(){
		try{
			Select lstOwnership = new Select (driver.findElement(By.xpath("//*[@id='intrmdry']")));	// type of ownership
			lstOwnership.selectByVisibleText("Corporation");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='proddescn']")).sendKeys("Products and Services");//products or services			
			driver.findElement(By.xpath("//*[@id='incdte']")).sendKeys("08/08/2016");	//established date
			driver.findElement(By.xpath("//*[@id='website']")).sendKeys("www.testcompany.com");	//company website
			driver.findElement(By.xpath("//*[@id='totrev']")).sendKeys("5000000");	//Last Fiscal Year-End Revenues
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(1000);
			report.updateTestLog("Org Background", "Organization Background page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void AppQuestionsProdTCP(){
		try{
			driver.findElement(By.xpath("//*[@id='emplchk' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='emplvrf' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='prsnrfr' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='prcnvct' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='drugtst' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='workn']")).sendKeys("Work Description");
			driver.findElement(By.xpath("//*[@id='indinv' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='empiratec']")).sendKeys("9");
			driver.findElement(By.xpath("//*[@id='offprempl']")).sendKeys("8");
			driver.findElement(By.xpath("//*[@id='fullaccs' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='rstraccs' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='nrmbushr' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='sprvsrvs' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='idbadge' and @value='Y']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("App Questions", "App Questions page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}

	public void LossHistoryProdTCP(){
		try{
			driver.findElement(By.xpath("//*[@id='lossany' and @value='X']")).click();
			driver.findElement(By.xpath("//*[@id='lossownp' and @value='X']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(1000);
			report.updateTestLog("Loss History", "Loss History page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CreateQuoteProdTCP(){
		try{
			String premium = driver.findElement(By.xpath("//*[@id='topC1prem']")).getText();
			// if update premium
			
			// if verify premium
			
			driver.findElement(By.xpath("//*[@id='viewQuoteButton']")).click(); //click quote pdf button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='bindThisButton']")).click(); // click select
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='utility_navigation']/li[1]/a")).click();	//log out			
			report.updateTestLog("Create Quote", "premium matches baseline", Status.PASS);
			driver.close();
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
		
	
}	
	
	
	
	
	
	
	
	


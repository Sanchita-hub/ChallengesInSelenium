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
import java.util.TimeZone;
import java.util.*;
import java.io.*;
import java.*;
import java.text.*;
import java.time.LocalDate;

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
import supportlibraries.ReusableLibrary;

//extends SeleniumActionClass
public class ProntoProdMMEL { 

	private WebDriver driver = new ChromeDriver();
	Report report = new Report(null, null, null);
	
	
	//public ProntoProdMMEL(){
	//}
	
	
	public ProntoProdMMEL(){
	}
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CO24354\\Desktop\\chromedriver.exe");
	
		ProntoProdMMEL prontoprodPCP = new ProntoProdMMEL();
		prontoprodPCP.AccountQualificationProdMMELOH();
		prontoprodPCP.selectCoverageProdMMELOH();
		prontoprodPCP.CompanyInfoProdMMELOH();
		prontoprodPCP.DNOProdMMEL();
		prontoprodPCP.EPLProdMMELOH();
		prontoprodPCP.FIDProdMMEL();
		prontoprodPCP.CRIProdMMEL();
		prontoprodPCP.lossHistoryProdMMEL();
		prontoprodPCP.createQuoteProdMMEL();
		WebDriver driver = new ChromeDriver();
		driver.quit();
	
		
		//System.out.println(date);	
	}
	
	public void AccountQualificationProdMMELOH(){
		try{
			String URL = "https://ebc.thehartford.com";
			
			//String URL = "https://www.hfpinsurance.com/worklist/ebc2sbu.jsp?SMSESSION=NO";
			String Username = "esub0156";
			String Password = "password";
			//String Username = dataTable.getData("General", "Username");	
			//String Password = dataTable.getData("General", "Password");	
			
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(Username);
			driver.findElement(By.name("PASSWORD")).sendKeys(Password);
			
			driver.findElement(By.id("login-submit")).click();	//click the submit button
			Thread.sleep(1000);
			String winHandleOld = driver.getWindowHandle();
										
			driver.findElement(By.xpath("//*[contains(text(),'HFP Pronto')]")).click();	// click HFP Pronto link
			
			for(String windHandle : driver.getWindowHandles()){		//switch to new window opened
				if (!winHandleOld.equals(windHandle)){
				driver.switchTo().window(windHandle);
				driver.manage().window().maximize();
				}
			}
			
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			Thread.sleep(1000);
			driver.findElement(By.linkText("Management Liability For Private & Non-Profit Risks")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='leftBox rounded']/div/div[2]/ul[2]/li/button/a")).click(); // choose private company
			Thread.sleep(3000);
						
			//Account Qualification 
			
			WebElement statelist = driver.findElement(By.xpath("//select[@id='selInsst']"));
			Select lstState = new Select (statelist);
			lstState.selectByVisibleText("Ohio");	//locate select state drop down list
			WebElement NAIC = driver.findElement(By.id("classificationLookup"));
			NAIC.sendKeys("115210");	//enter NAIC code
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
						
			driver.findElement(By.name("txtTotemp")).sendKeys("21");	////total emp
			driver.findElement(By.name("txtInszip")).sendKeys("43901");	//zipcode]
			Thread.sleep(2000);
			Select lstprodinfo = new Select (driver.findElement(By.xpath("//*[@id='selBrokerName']")));
			lstprodinfo.selectByIndex(1);		//producer info
			Thread.sleep(1000);
			Select lstprodcontact = new Select (driver.findElement(By.xpath("//*[@id='selContactName']")));
			lstprodcontact.selectByIndex(1);	//producer contact info
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;	//scroll down 
			WebElement Element = driver.findElement(By.xpath("//*[@id='main_content']/legend[2]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Account Qualification", "Account Qualification page completed", Status.PASS);			
		}catch(Exception e){
			System.out.println(e.toString());		
		}
				
	}
	
	public void selectCoverageProdMMELOH(){
		try{
			
			//String Address = dataTable.getData("General", "Address");	
			//String City = dataTable.getData("General", "City");	
			//String EPLCurrLimits = dataTable.getData("General", "EPLCurrLimits");
			//String FIDCurrLimits = dataTable.getData("General", "FIDCurrLimits");
			//String DNOCurrLimits = dataTable.getData("General", "DNOCurrLimits");
			//String CRICurrLimits = dataTable.getData("General", "CRICurrLimits");
						
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			String InsuredName = "Gomeztesting_" + InsuredNameDate;				
			
			driver.findElement(By.xpath("//*[@id='txtCompanyName']")).sendKeys(InsuredName);	//Insured Name
			//report.updateTestLog("Insured Name", "Insured Name for OH is: " + InsuredName, Status.DONE);	
			
			//driver.findElement(By.xpath("//*[@id='txtInsad1']")).sendKeys(Address);	//address
			//driver.findElement(By.xpath("//*[@id='txtInscty']")).sendKeys(City);	//city
			driver.findElement(By.xpath("//*[@id='txtInsad1']")).sendKeys("2 Cross Road");	//address
			driver.findElement(By.xpath("//*[@id='txtInscty']")).sendKeys("ADEDNA");	//city
			Thread.sleep(1000);
			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//*[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
			
			//checkbox DNO, EPL, FID, CRI
			driver.findElement(By.xpath("//*[@id='chkDOP']")).click();
			driver.findElement(By.xpath("//*[@id='chkEPL']")).click();
			driver.findElement(By.xpath("//*[@id='chkFID']")).click();
			driver.findElement(By.xpath("//*[@id='chkCRI']")).click();
			driver.findElement(By.xpath("//*[@id='chkCRDEPIND']")).click();
			driver.findElement(By.xpath("//*[@id='chkCRINSIND']")).click();
			driver.findElement(By.xpath("//*[@id='chkCROUTIND']")).click();
			driver.findElement(By.xpath("//*[@id='chkCRCMPIND']")).click();
			
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//WebElement Element = driver.findElement(By.xpath("//*[@id='main_content']/legend[2]"));
			//js.executeScript("arguments[0].scrollIntoView();", Element);	//scroll down
			
			//DNO
			driver.findElement(By.xpath("//input[@name='p_dopcovi' and @value='Y']")).click();
			//DNO date-366   
			//LocalDate DNOdate = LocalDate.now().minusDays(366);
			String DNOdateformat = "08/28/2017";
			driver.findElement(By.xpath("//*[@id='p_dopeff']")).sendKeys(DNOdateformat);
			driver.findElement(By.xpath("//*[@id='p_dopefferror']/label/span")).click();
			Thread.sleep(1000);
			//driver.findElement(By.id("p_doplmt")).sendKeys(DNOCurrLimits);
			driver.findElement(By.xpath("//*[@id='p_doplmt']")).sendKeys("10000");
			//EPL
			driver.findElement(By.xpath("//input[@name='p_eplcovi' and @value='Y']")).click();
			//EPL date-367
			//LocalDate EPLdate = LocalDate.now().minusDays(367);
			//String EPLdateformat = EffDateFormat.format(EPLdate);
			String EPLdateformat = "08/27/2017";
			driver.findElement(By.xpath("//*[@id='p_epleff']")).sendKeys(EPLdateformat);
			driver.findElement(By.xpath("//*[@id='p_eplefferror']/label/span")).click();
			Thread.sleep(1000);
			//driver.findElement(By.id("p_epllmt")).sendKeys(EPLCurrLimits);
			driver.findElement(By.xpath("//*[@id='p_epllmt']")).sendKeys("20000");	
			//FID 
			driver.findElement(By.xpath("//input[@name='p_fidcovi' and @value='Y']")).click();
			//date-366 
			//LocalDate FIDdate = LocalDate.now().minusDays(366);
			//String FIDdateformat = EffDateFormat.format(FIDdate);
			String FIDdateformat = "08/28/2017";
			driver.findElement(By.xpath("//*[@id='p_fideff']")).sendKeys(FIDdateformat);
			driver.findElement(By.xpath("//*[@id='p_fidefferror']/label/span")).click();
			Thread.sleep(1000);
			
			//driver.findElement(By.id("p_fidlmt")).sendKeys(FIDCurrLimits);
			driver.findElement(By.xpath("//*[@id='p_fidlmt']")).sendKeys("20000");		
			//CRI 
			driver.findElement(By.xpath("//input[@name='p_crpcovi' and @value='Y']")).click();
			//date-365 
			//LocalDate CRIdate = LocalDate.now().minusDays(365);
			//String CRIdateformat = EffDateFormat.format(CRIdate);
			String CRIdateformat = "08/29/2017";			
			driver.findElement(By.xpath("//*[@id='p_crpeff']")).sendKeys(CRIdateformat);
			driver.findElement(By.xpath("//*[@id='p_crpefferror']/label/span")).click();
			Thread.sleep(1000);
			
			//driver.findElement(By.id("p_crplmt")).sendKeys(CRICurrLimits);
			driver.findElement(By.xpath("//*[@id='p_crplmt']")).sendKeys("30000");
			
			driver.findElement(By.xpath("//input[@name='appknwl' and @value='N']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Select Coverage", "Select Coverage page completed", Status.PASS);			
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CompanyInfoProdMMELOH(){
		try{
			/*
			String REVENUES = dataTable.getData("General", "REVENUES");
			String LOCATIONS = dataTable.getData("General", "LOCATIONS");
			*/
			
			driver.findElement(By.id("txtDscoper")).sendKeys("Pronto testing");
			//driver.findElement(By.id("txtTotrev")).sendKeys(REVENUES);	
			driver.findElement(By.id("txtTotrev")).sendKeys("7500000");
			//driver.findElement(By.id("txtTotloc")).sendKeys(LOCATIONS);	
			driver.findElement(By.id("txtTotloc")).sendKeys("1");	
			
			driver.findElement(By.xpath("//input[@name='rdNonussb' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdMerger' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdRestrt' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdDownsize' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPrcdev12' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdFedcntcr' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(3000);
			report.updateTestLog("Company Info", "Company Info page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void DNOProdMMEL() {
		try{
			//financial info
			driver.findElement(By.id("txtcurmonth")).click();	//place cursor in, so that calendar pops up
			WebElement yyyy = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]"));	
			Select lstyyyy = new Select (yyyy);	// select YYYY dropdow list, 2014. select year first, otherwise it won't display sep/oct
			lstyyyy.selectByVisibleText("2014");
				
			WebElement MM = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]"));	
			Select lstMM = new Select (MM);	// select MM dropdow list, Sep
			lstMM.selectByVisibleText("Sep");
			
			//balance sheet
			driver.findElement(By.id("txtcurasset")).sendKeys("12,000,000");	
			driver.findElement(By.id("txtgdwill")).sendKeys("3,000,000");	
			driver.findElement(By.id("txttotasset")).sendKeys("15,000,000");	
			driver.findElement(By.id("txtcurlblt")).sendKeys("3,500,000");	
			driver.findElement(By.id("txtltdebt")).sendKeys("500,000");	
			driver.findElement(By.id("txttotlblt")).sendKeys("3,500,000");	
			driver.findElement(By.id("txtretearn")).sendKeys("1,000,000");	
			driver.findElement(By.id("txtstckeqt")).sendKeys("2,000,000");	
			//Profit loss or income statement
			//driver.findElement(By.id("txttotrev")).sendKeys("7,500,000");	//auto-filled
			driver.findElement(By.id("txtniatamt")).sendKeys("5,000,000");	
			driver.findElement(By.id("txtintexp")).sendKeys("750,000");	
			driver.findElement(By.id("txtearnbt")).sendKeys("3,000,000");	
			//statement of cashflow
			driver.findElement(By.id("txtcfopamt")).sendKeys("1,250,000");	
			
			driver.findElement(By.xpath("//input[@name='rdsubchpt' and @value='N']")).click();
			driver.findElement(By.id("txttotshrhd")).sendKeys("25");	
			driver.findElement(By.id("txtnumshr")).sendKeys("1,000");	
			driver.findElement(By.id("txtdoshr")).sendKeys("960");	
			driver.findElement(By.xpath("//input[@name='rdfamctr' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdappsup' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdsecofcmp' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdsecofant' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rddbtbrcur' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rddbtbrpr' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdantitrst' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdcrmact' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdclsact' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdothrlit' and @value='N']")).click();
			driver.findElement(By.id("txtdatinc")).sendKeys("2013");	
		
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			
			report.updateTestLog("DNO", "DNO page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void EPLProdMMELOH() {
		try{
			driver.findElement(By.xpath("//*[@id='txtCurft']")).sendKeys("19");	
			driver.findElement(By.id("txtCurpt")).sendKeys("0");	
			driver.findElement(By.id("txtCurindc")).sendKeys("0");	
			driver.findElement(By.id("txtCurunion")).sendKeys("1");	
			driver.findElement(By.id("txtFrnempl")).sendKeys("0");	
			
			driver.findElement(By.id("txtCaempl")).sendKeys("0");	
			driver.findElement(By.id("txtNjempl")).sendKeys("0");	
			
			driver.findElement(By.id("txt50Kempl")).sendKeys("4");	
			driver.findElement(By.id("txt100Kempl")).sendKeys("2");	
			
			driver.findElement(By.xpath("//input[@id='rdEmplsign' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdRskman' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@id='rdHrdept' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdEplcmpl' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("EPL", "EPL page completed", Status.PASS);			
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void FIDProdMMEL(){
		try{
			driver.findElement(By.xpath("//input[@name='rdErisa' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdEmplsec' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdRedben' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdDolirs' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPlnlitg' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPlntyp1' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='txtPlnast1']")).sendKeys("75000000");
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("FID", "FID page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void CRIProdMMEL(){
		try{
			driver.findElement(By.xpath("//input[@name='rdCriloss' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdApplocn' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdEmpchks' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdSignchk' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdBnkdpt' and @value='Y']")).click();
			
			driver.findElement(By.xpath("//input[@name='rdWthdrw' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdSignplt' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdAutvend' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdApprinv' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@name='rdApprwrtran' and @value='Y']")).click();
		
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("CRI", "CRI page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void lossHistoryProdMMEL(){
		try{
			driver.findElement(By.xpath("//input[@name='rdLwstclm' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdInsrefse' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPndclaim' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdNotice' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("loss History", "loss History page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void createQuoteProdMMEL(){
		try{
			String premium1 = driver.findElement(By.xpath("//*[@id='topC1prem']")).getText();			
			String premium2 = driver.findElement(By.xpath("//*[@id='topC2prem']")).getText();
			String premium3 = driver.findElement(By.xpath("//*[@id='topC3prem']")).getText();
			
			//String baseline1 = "$7,470";
			String baseline1 = "$6,873";
			String baseline2 = "$9,184";
			String baseline3 = "$13,256";
					
			System.out.println("premium option 1 is: "+premium1);
			System.out.println("premium option 2 is: "+premium2);
			System.out.println("premium option 3 is: "+premium3);
			
			if (premium1 == baseline1){
				System.out.println("premium1 matches baseline");
			}else{
				System.out.println("premium1 does not match baseline"+baseline1);
				
			}
			
			report.updateTestLog("create Quote", "premium matches baseline", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
			report.updateTestLog("create Quote", "premium does not match the baseline", Status.FAIL);
		}
	}
	
	public void AccountQualificationProdMMELGA(){
		try{
			// launch website in popup window???
			String URL = "https://ebc.thehartford.com";
			String username = "esub0156";
			String password = "password";
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			driver.findElement(By.id("login-submit")).click();	//click the submit button
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@onclick='javascript:openPopupWin('https://www.hfpinsurance.com/worklist/ebc2sbu.jsp')']")).click(); 	//click on HFP pronto link
			//how???  //now focus on the new page?
			driver.manage().window().maximize();
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			driver.findElement(By.linkText("Management Liability For Private & Non-Profit Risks")).click();
			driver.findElement(By.xpath("//*[@class='leftBox rounded']//li[contains(text(),'Up to $50M in revenue or assets')]"));
			Thread.sleep(3000);
			report.updateTestLog("Login page", "Login is successful", Status.PASS);
			//Account Qualification 
			
			WebElement statelist = driver.findElement(By.xpath("//select[@id='selInsst']"));
			Select lstState = new Select (statelist);
			lstState.selectByVisibleText("Georgia");	//locate select state drop down list
			WebElement NAIC = driver.findElement(By.id("classificationLookup"));
			NAIC.sendKeys("541511");	//enter NAIC code
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
						
			driver.findElement(By.name("txtTotemp")).sendKeys("22");	////total emp
			driver.findElement(By.name("txtInszip")).sendKeys("31620");	//zipcode
			Select lstprodinfo = new Select (driver.findElement(By.name("selBrokerName")));
			lstprodinfo.selectByIndex(1);		//producer info
			Select lstprodcontact = new Select (driver.findElement(By.name("selContactName")));
			lstprodcontact.selectByIndex(1);	//producer contact info
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			report.updateTestLog("Account Qualification", "GA_Account Qualification page is completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
				
	}
	
	public void selectCoverageProdMMELGA(){
		try{
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			String InsuredName = "Gomeztesting_" + InsuredNameDate;				
			driver.findElement(By.id("txtCompanyName")).sendKeys(InsuredName);	//Insured Name
			report.updateTestLog("Insured Name", "Insured Name for GA is: " +InsuredName, Status.PASS);
			
			driver.findElement(By.id("txtInsad1")).sendKeys("22 Broad St");	//address
			driver.findElement(By.id("txtInscty")).sendKeys("ADEL");	//city

			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//input[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
			
			//checkbox DNO, EPL, FID, CRI
			driver.findElement(By.id("chkDOP")).click();
			driver.findElement(By.id("chkEPL")).click();
			driver.findElement(By.id("chkFID")).click();
			driver.findElement(By.id("chkCRI")).click();
			driver.findElement(By.id("chkCRDEPIND")).click();
			driver.findElement(By.id("chkCRINSIND")).click();
			driver.findElement(By.id("chkCROUTIND")).click();
			driver.findElement(By.id("chkCRCMPIND")).click();
			
			//DNO
			driver.findElement(By.xpath("//input[@name='p_dopcovi' and @value='Y']")).click();
			//DNO date-366   
			LocalDate DNOdate = LocalDate.now().minusDays(366);
			String DNOdateformat = EffDateFormat.format(DNOdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(DNOdateformat);
			
			driver.findElement(By.id("p_doplmt")).sendKeys("100000");
			//EPL
			driver.findElement(By.xpath("//input[@name='p_eplcovi' and @value='Y']")).click();
			//EPL date-367
			LocalDate EPLdate = LocalDate.now().minusDays(367);
			String EPLdateformat = EffDateFormat.format(EPLdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(EPLdateformat);
			
			driver.findElement(By.id("p_epllmt")).sendKeys("200000");
				
			//FID 
			driver.findElement(By.xpath("//input[@name='p_fidcovi' and @value='Y']")).click();
			//date-366 
			LocalDate FIDdate = LocalDate.now().minusDays(366);
			String FIDdateformat = EffDateFormat.format(FIDdate);
			driver.findElement(By.id("p_fideff")).sendKeys(FIDdateformat);
			
			driver.findElement(By.id("p_fidlmt")).sendKeys("100000");
					
			//CRI 
			driver.findElement(By.xpath("//input[@name='p_crpcovi' and @value='Y']")).click();
			//date-365 
			LocalDate CRIdate = LocalDate.now().minusDays(365);
			String CRIdateformat = EffDateFormat.format(CRIdate);
			driver.findElement(By.id("p_crpeff")).sendKeys(CRIdateformat);
			
			driver.findElement(By.id("p_crplmt")).sendKeys("300000");
				
			driver.findElement(By.xpath("//input[@name='appknwl' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			report.updateTestLog("Select Coverage", "Select Coverage page completed", Status.PASS);	
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CompanyInfoProdMMELGA(){
		try{
			driver.findElement(By.id("txtDscoper")).sendKeys("Pronto testing");
			driver.findElement(By.id("txtTotrev")).sendKeys("7500000");	
			driver.findElement(By.id("txtTotloc")).sendKeys("2");		
			driver.findElement(By.xpath("//input[@name='rdNonussb' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdMerger' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdRestrt' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdDownsize' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPrcdev12' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdFedcntcr' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Company Info", "Company Info page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void EPLProdMMELGA() {
		try{
			driver.findElement(By.id("txtCurft")).sendKeys("5");	
			driver.findElement(By.id("txtCurpt")).sendKeys("0");	
			driver.findElement(By.id("txtCurindc")).sendKeys("0");	
			driver.findElement(By.id("txtCurunion")).sendKeys("4");	
			driver.findElement(By.id("txtFrnempl")).sendKeys("0");	
			
			driver.findElement(By.id("txtCaempl")).sendKeys("0");	
			driver.findElement(By.id("txtNjempl")).sendKeys("0");	
			
			driver.findElement(By.id("txt50Kempl")).sendKeys("2");	
			driver.findElement(By.id("txt100Kemplerror")).sendKeys("1");	
			
			driver.findElement(By.xpath("//input[@id='rdEmplsign' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdRskman' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@id='rdHrdept' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdEplcmpl' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("EPL", "EPL page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void AccountQualificationProdMMELVA(){
		try{
			// launch website in popup window???
			String URL = "https://ebc.thehartford.com";
			String username = "esub0156";
			String password = "password";
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			//click the submit button
			driver.findElement(By.id("login-submit")).click();
			Thread.sleep(2000);
												
			driver.findElement(By.xpath("//a[@onclick='javascript:openPopupWin('https://www.hfpinsurance.com/worklist/ebc2sbu.jsp')']")).click(); 	//click on HFP pronto link
			//how???  //now focus on the new page?
			driver.manage().window().maximize();
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			driver.findElement(By.linkText("Management Liability For Private & Non-Profit Risks")).click();
			driver.findElement(By.xpath("//*[@class='leftBox rounded']//li[contains(text(),'Up to $50M in revenue or assets')]"));
			Thread.sleep(3000);
			report.updateTestLog("Login page", "Login is successful", Status.PASS);
			//Account Qualification 
			
			WebElement statelist = driver.findElement(By.xpath("//select[@id='selInsst']"));
			Select lstState = new Select (statelist);
			lstState.selectByVisibleText("Virginia");	//locate select state drop down list
			WebElement NAIC = driver.findElement(By.id("classificationLookup"));
			NAIC.sendKeys("561422");	//enter NAIC code
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
						
			driver.findElement(By.name("txtTotemp")).sendKeys("6");	////total emp
			driver.findElement(By.name("txtInszip")).sendKeys("20101");	//zipcode
			Select lstprodinfo = new Select (driver.findElement(By.name("selBrokerName")));
			lstprodinfo.selectByIndex(1);		//producer info
			Select lstprodcontact = new Select (driver.findElement(By.name("selContactName")));
			lstprodcontact.selectByIndex(1);	//producer contact info
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Account Qualification", "Account Qualification page is completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void selectCoverageProdMMELVA(){
		try{
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			String InsuredName = "Gomeztesting_" + InsuredNameDate;				
			driver.findElement(By.id("txtCompanyName")).sendKeys(InsuredName);	//Insured Name
			report.updateTestLog("Insured Name", "Insured Name for VA is: " +InsuredName, Status.PASS);
			
			driver.findElement(By.id("txtInsad1")).sendKeys("22 Stewart Ln");	//address
			driver.findElement(By.id("txtInscty")).sendKeys("ADAMS RUN");	//city

			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//input[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
			
			//checkbox DNO, EPL, FID, CRI
			driver.findElement(By.id("chkDOP")).click();
			driver.findElement(By.id("chkEPL")).click();
			driver.findElement(By.id("chkFID")).click();
			driver.findElement(By.id("chkCRI")).click();
			driver.findElement(By.id("chkCRDEPIND")).click();
			driver.findElement(By.id("chkCRINSIND")).click();
			driver.findElement(By.id("chkCROUTIND")).click();
			driver.findElement(By.id("chkCRCMPIND")).click();
			
			//DNO
			driver.findElement(By.xpath("//input[@name='p_dopcovi' and @value='Y']")).click();
			//DNO date-366   
			LocalDate DNOdate = LocalDate.now().minusDays(366);
			String DNOdateformat = EffDateFormat.format(DNOdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(DNOdateformat);
			
			driver.findElement(By.id("p_doplmt")).sendKeys("100000");
			//EPL
			driver.findElement(By.xpath("//input[@name='p_eplcovi' and @value='Y']")).click();
			//EPL date-367
			LocalDate EPLdate = LocalDate.now().minusDays(367);
			String EPLdateformat = EffDateFormat.format(EPLdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(EPLdateformat);
			
			driver.findElement(By.id("p_epllmt")).sendKeys("200000");
				
			//FID 
			driver.findElement(By.xpath("//input[@name='p_fidcovi' and @value='Y']")).click();
			//date-366 
			LocalDate FIDdate = LocalDate.now().minusDays(366);
			String FIDdateformat = EffDateFormat.format(FIDdate);
			driver.findElement(By.id("p_fideff")).sendKeys(FIDdateformat);
			
			driver.findElement(By.id("p_fidlmt")).sendKeys("100000");
					
			//CRI 
			driver.findElement(By.xpath("//input[@name='p_crpcovi' and @value='Y']")).click();
			//date-365 
			LocalDate CRIdate = LocalDate.now().minusDays(365);
			String CRIdateformat = EffDateFormat.format(CRIdate);
			driver.findElement(By.id("p_crpeff")).sendKeys(CRIdateformat);
			
			driver.findElement(By.id("p_crplmt")).sendKeys("300000");
				
			driver.findElement(By.xpath("//input[@name='appknwl' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Select Coverage", "Select Coverage page completed", Status.PASS);	
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CompanyInfoProdMMELVA(){
		try{
			driver.findElement(By.id("txtDscoper")).sendKeys("Pronto testing");
			driver.findElement(By.id("txtTotrev")).sendKeys("7500000");	
			driver.findElement(By.id("txtTotloc")).sendKeys("1");		
			driver.findElement(By.xpath("//input[@name='rdNonussb' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdMerger' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdRestrt' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdDownsize' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPrcdev12' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdFedcntcr' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Company Info", "Company Info page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void EPLProdMMELVA() {
		try{
			driver.findElement(By.id("txtCurft")).sendKeys("2");	
			driver.findElement(By.id("txtCurpt")).sendKeys("3");	
			driver.findElement(By.id("txtCurindc")).sendKeys("0");	
			driver.findElement(By.id("txtCurunion")).sendKeys("5");	
			driver.findElement(By.id("txtFrnempl")).sendKeys("0");	
			
			driver.findElement(By.id("txtCaempl")).sendKeys("0");	
			driver.findElement(By.id("txtNjempl")).sendKeys("0");	
			
			driver.findElement(By.id("txt50Kempl")).sendKeys("1");	
			driver.findElement(By.id("txt100Kemplerror")).sendKeys("1");	
			
			driver.findElement(By.xpath("//input[@id='rdEmplsign' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdRskman' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@id='rdHrdept' and @value='Y']")).click();
			driver.findElement(By.xpath("//input[@id='rdEplcmpl' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("EPL", "EPL page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void AccountQualificationProdMMELMD(){
		try{
			// launch website in popup window???
			String URL = "https://ebc.thehartford.com";
			String username = "esub0156";
			String password = "password";
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			//click the submit button
			driver.findElement(By.id("login-submit")).click();
			Thread.sleep(2000);
								
			driver.findElement(By.xpath("//a[@onclick='javascript:openPopupWin('https://www.hfpinsurance.com/worklist/ebc2sbu.jsp')']")).click(); 	//click on HFP pronto link
			//how???  //now focus on the new page?
			driver.manage().window().maximize();
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			driver.findElement(By.linkText("Management Liability For Private & Non-Profit Risks")).click();
			driver.findElement(By.xpath("//*[@class='leftBox rounded']//li[contains(text(),'Up to $50M in revenue or assets')]"));
			Thread.sleep(3000);
			report.updateTestLog("Login page", "Login is successful", Status.PASS);
			//Account Qualification 
			
			WebElement statelist = driver.findElement(By.xpath("//select[@id='selInsst']"));
			Select lstState = new Select (statelist);
			lstState.selectByVisibleText("Maryland");	//locate select state drop down list
			WebElement NAIC = driver.findElement(By.id("classificationLookup"));
			NAIC.sendKeys("115210");	//enter NAIC code
			NAIC.sendKeys(Keys.DOWN);	//click down arrow
			Thread.sleep(2000);
			NAIC.sendKeys(Keys.RETURN);	// press enter
			Thread.sleep(2000);
						
			driver.findElement(By.name("txtTotemp")).sendKeys("11");	////total emp
			driver.findElement(By.name("txtInszip")).sendKeys("20601");	//zipcode
			Select lstprodinfo = new Select (driver.findElement(By.name("selBrokerName")));
			lstprodinfo.selectByIndex(1);		//producer info
			Select lstprodcontact = new Select (driver.findElement(By.name("selContactName")));
			lstprodcontact.selectByIndex(1);	//producer contact info
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Account Qualification", "Account Qualification page is completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void selectCoverageProdMMELMD(){
		try{
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			String InsuredName = "Gomeztesting_" + InsuredNameDate;				
			driver.findElement(By.id("txtCompanyName")).sendKeys(InsuredName);	//Insured Name
			report.updateTestLog("Insured Name", "Insured Name for MD is: " +InsuredName, Status.PASS);
			
			driver.findElement(By.id("txtInsad1")).sendKeys("44 Crossby st");	//address
			driver.findElement(By.id("txtInscty")).sendKeys("ACME");	//city

			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//input[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
			
			//checkbox DNO, EPL, FID, CRI
			driver.findElement(By.id("chkDOP")).click();
			driver.findElement(By.id("chkEPL")).click();
			driver.findElement(By.id("chkFID")).click();
			driver.findElement(By.id("chkCRI")).click();
			driver.findElement(By.id("chkCRDEPIND")).click();
			driver.findElement(By.id("chkCRINSIND")).click();
			driver.findElement(By.id("chkCROUTIND")).click();
			driver.findElement(By.id("chkCRCMPIND")).click();
			
			//DNO
			driver.findElement(By.xpath("//input[@name='p_dopcovi' and @value='Y']")).click();
			//DNO date-366   
			LocalDate DNOdate = LocalDate.now().minusDays(366);
			String DNOdateformat = EffDateFormat.format(DNOdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(DNOdateformat);
			
			driver.findElement(By.id("p_doplmt")).sendKeys("100000");
			//EPL
			driver.findElement(By.xpath("//input[@name='p_eplcovi' and @value='Y']")).click();
			//EPL date-367
			LocalDate EPLdate = LocalDate.now().minusDays(367);
			String EPLdateformat = EffDateFormat.format(EPLdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(EPLdateformat);
			
			driver.findElement(By.id("p_epllmt")).sendKeys("200000");
				
			//FID 
			driver.findElement(By.xpath("//input[@name='p_fidcovi' and @value='Y']")).click();
			//date-366 
			LocalDate FIDdate = LocalDate.now().minusDays(366);
			String FIDdateformat = EffDateFormat.format(FIDdate);
			driver.findElement(By.id("p_fideff")).sendKeys(FIDdateformat);
			
			driver.findElement(By.id("p_fidlmt")).sendKeys("100000");
					
			//CRI 
			driver.findElement(By.xpath("//input[@name='p_crpcovi' and @value='Y']")).click();
			//date-365 
			LocalDate CRIdate = LocalDate.now().minusDays(365);
			String CRIdateformat = EffDateFormat.format(CRIdate);
			driver.findElement(By.id("p_crpeff")).sendKeys(CRIdateformat);
			
			driver.findElement(By.id("p_crplmt")).sendKeys("300000");
				
			driver.findElement(By.xpath("//input[@name='appknwl' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Select Coverage", "Select Coverage page completed", Status.PASS);	
			
		}catch(Exception e){
			System.out.println(e.toString());	
		}	
	}
	
	public void CompanyInfoProdMMELMD(){
		try{
			driver.findElement(By.id("txtDscoper")).sendKeys("Pronto testing");
			driver.findElement(By.id("txtTotrev")).sendKeys("7500000");	
			driver.findElement(By.id("txtTotloc")).sendKeys("11");		
			driver.findElement(By.xpath("//input[@name='rdNonussb' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdMerger' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdRestrt' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdDownsize' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdPrcdev12' and @value='N']")).click();
			driver.findElement(By.xpath("//input[@name='rdFedcntcr' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("Company Info", "Company Info page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
		
	public void EPLProdMMELMD() {
		try{
			driver.findElement(By.xpath("//*[@id='txtCurft']")).sendKeys("15");	
			driver.findElement(By.xpath("//*[@id='txtCurpt']")).sendKeys("15");	
			driver.findElement(By.xpath("//*[@id='txtCurindc']")).sendKeys("0");	
			driver.findElement(By.xpath("//*[@id='txtCurunion']")).sendKeys("2");	
			driver.findElement(By.xpath("//*[@id='txtFrnempl']")).sendKeys("4");	
			
			driver.findElement(By.xpath("//*[@id='txtCaempl']")).sendKeys("0");	
			driver.findElement(By.xpath("//*[@id='txtNjempl']")).sendKeys("0");	
			
			driver.findElement(By.xpath("//*[@id='txt50Kempl']")).sendKeys("3");	
			driver.findElement(By.xpath("//*[@id='txt100Kemplerror']")).sendKeys("3");	
			
			driver.findElement(By.xpath("//*[@id='rdEmplsign' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='rdRskman' and @value='N']")).click();
			driver.findElement(By.xpath("//*[@id='rdHrdept' and @value='Y']")).click();
			driver.findElement(By.xpath("//*[@id='rdEplcmpl' and @value='N']")).click();
			
			driver.findElement(By.xpath("//*[@id='continueButton']")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("EPL", "EPL page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	
}	
	
	
	
	
	
	
	
	


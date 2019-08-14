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

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
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

public class ProntoTLSP { 
	
	WebDriver driver = new ChromeDriver();
	Report report = new Report(null,null,null);
	Date date = new Date(); //current date
	
	public ProntoTLSP(){
		
	}
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CO24354\\Desktop\\chromedriver.exe");
		
		ProntoTLSP prodTLSP = new ProntoTLSP();
		prodTLSP.theBasicP();
		prodTLSP.theMoneyP();
		prodTLSP.WhatYouDoP();
		prodTLSP.WhoYouDoItForP();
		prodTLSP.WhatItDoesP();
		prodTLSP.YourTeamP();
		prodTLSP.WhatCouldGoWrongP();
		prodTLSP.YourLawsP();
		prodTLSP.KeepingItAllPrivateP();
		prodTLSP.ITOperationsP();
		prodTLSP.ContentPropertyP();
		prodTLSP.HistoryPageP();
		//System.out.println("");	
		
	}
			
	public void theBasicP(){
		String URL = "https://ebc.thehartford.com";
		//String URL = "https://www.hfpinsurance.com/worklist/ebc2sbu.jsp?SMSESSION=NO";
		String username = "esub0156";
		String password = "password";
	
		try{
			
			driver.get(URL);
			driver.findElement(By.name("USERText")).sendKeys(username);
			driver.findElement(By.name("PASSWORD")).sendKeys(password);
			driver.findElement(By.id("login-submit")).click();	//click the submit button, open the new window
			
			String winHandleOld = driver.getWindowHandle();
						
			//how???	//verify page displays, 
			driver.findElement(By.xpath("//*[contains(text(),'HFP Pronto')]")).click();	// click HFP Pronto link
				
			for(String windHandle : driver.getWindowHandles()){		//switch to new window opened
				if (!winHandleOld.equals(windHandle)){
				driver.switchTo().window(windHandle);
				driver.manage().window().maximize();
				}
			}
			
			driver.findElement(By.id("newQuoteText")).click(); //click on create new submission
			driver.findElement(By.linkText("Errors & Omissions for Technology Companies")).click();
			//report.updateTestLog("Login successful", "Login successful", Status.PASS);
				
			//producer info
			Thread.sleep(2000);
					
			Date TodayDate = new Date();
			SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyyyHHmmSS");
			String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
			String InsuredName = "GomeztestingTLSP_" + InsuredNameDate;				
				
			driver.findElement(By.id("insnam")).sendKeys(InsuredName);	//applicant name
			driver.findElement(By.id("insad1")).sendKeys("14 Main st");	//physical address
			driver.findElement(By.id("inscty")).sendKeys("ARMONK");		//city
			Select lstState = new Select (driver.findElement(By.id("insst")));	//state
			lstState.selectByVisibleText("NY");
			driver.findElement(By.id("inszip")).sendKeys("10016");		//zipcode
			
			SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String EffDate = EffDateFormat.format(TodayDate);
			driver.findElement(By.xpath("//input[@id='effdte']")).sendKeys(EffDate);	//eff date=today's date
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='apprevenerror']/span[1]/input[1]")).click();	//applicant's revenue
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[22]/div/span[1]/input[2]")).click();	//renewal policy
			
			Select lstProdName = new Select (driver.findElement(By.id("agent")));	//producer name
			lstProdName.selectByIndex(1);	
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;	//scroll down 
			WebElement Element = driver.findElement(By.xpath("//*[@id='basics']/fieldset/legend[4]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			
			Select lstProdContact = new Select (driver.findElement(By.id("selContactName")));	//producer contact
			lstProdContact.selectByVisibleText("Tester Mony");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='clearanceSubmitButton']")).click();		//click continue
			Thread.sleep(10000);
		
			/*WebElement AppCleared = driver.findElement(By.xpath("//div[@class='informational cleared']//p[text()='This applicant has cleared!']")); // verify application has been cleared
			String txt = AppCleared.getText();
			if (txt == "This applicant has cleared!"){
				report.updateTestLog("Applicant cleared", "Applicant has been cleared", Status.PASS);
			} else {
				report.updateTestLog("Applicant cleared", "Applicant has not been cleared", Status.FAIL);  	//correct??? 	report err
			}
			*/	
					
			js.executeScript("arguments[0].scrollIntoView();", Element);	//scroll down
			
			driver.findElement(By.xpath("//input[@name='frstcov' and @value='0']")).click();	// select FirstPurchase
			Select lstOpt1LiabLim = new Select (driver.findElement(By.id("limit1")));	// select Opt1LiabLim
			lstOpt1LiabLim.selectByValue("1000000");	
			Select lstOpt1Retention = new Select (driver.findElement(By.id("retent1")));	// select Opt1Retention
			lstOpt1Retention.selectByValue("10000");
			Select lstOpt2LiabLim = new Select (driver.findElement(By.id("limit2")));	// select Opt2LiabLim
			lstOpt2LiabLim.selectByValue("2000000");	
			Select lstOpt2Retention = new Select (driver.findElement(By.id("retent2")));	// select Opt2Retention
			lstOpt2Retention.selectByValue("15000");	
			
			WebElement Element2 = driver.findElement(By.xpath("//*[@id='limit_retention']/tbody/tr[2]/td[1]"));
			js.executeScript("arguments[0].scrollIntoView();", Element2);
			
			driver.findElement(By.id("addSubsidiaries1")).sendKeys("Test1");	// add subsidiaries		
			driver.findElement(By.xpath("//div[@id='addSubsidiary']//input[@class='addButton']")).click();// click + button
			driver.findElement(By.id("addFrgnofcs1")).sendKeys("tst");	// add countries
			driver.findElement(By.xpath("//div[@id='addFrgnofc']//input[@class='addButton']")).click();	// click + button
			driver.findElement(By.id("yearsbus")).sendKeys("5");	// years in business
			driver.findElement(By.id("addWebsites1")).sendKeys("www.Hartfordtest.com");	// add websites
			driver.findElement(By.xpath("//div[@id='addWebsite']//input[@class='addButton']")).click();	// click + button
			driver.findElement(By.xpath("//input[@name='prchins' and @value='1']")).click();	// select radiobutton
			driver.findElement(By.xpath("//input[@name='mrgacq' and @value='1']")).click();	// select radiobutton
			
			driver.findElement(By.id("continueButtonBlue")).click();	// click continue
			Thread.sleep(2000);
			report.updateTestLog("basic", "basic page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void theMoneyP(){
		try{
			driver.findElement(By.id("fscyrend")).sendKeys("12/31/2018");	// select YearEndDate 
			driver.findElement(By.id("actdmrevp")).sendKeys("500,000");		// select PriorDomRev
			driver.findElement(By.id("actfrrevp")).sendKeys("500,000");		// select PriorForRev
			driver.findElement(By.id("prjdmrevc")).sendKeys("500,000");		// select CurrDomRev
			driver.findElement(By.id("prjfrrevc")).sendKeys("500,000");		// select CurrForRev
			driver.findElement(By.id("prjdmrevn")).sendKeys("500,000");		// select NextDomRev
			driver.findElement(By.id("prjfrrevn")).sendKeys("500,000");		// select NextForRev
			driver.findElement(By.id("actopexpp")).sendKeys("300,000");		// select PriorOptExpense
			driver.findElement(By.id("prjopexpc")).sendKeys("300,000");		// select CurrOptExpense
			driver.findElement(By.id("prjopexpn")).sendKeys("300,000");		// select NextOptExpense
			driver.findElement(By.id("continueButtonBlue")).click();		// click continue 
			Thread.sleep(3000);
			report.updateTestLog("theMoney", "theMoney page completed", Status.PASS);
		}catch (Exception e){
			System.out.println(e.toString());		
		}
		
	}
	
	public void WhatYouDoP(){
		try{
			//product descrp
			driver.findElement(By.xpath("//textarea[@id='whatyoudon']")).sendKeys("Testing. Detailed Description Of Products and Services");
			//Hardware Products / Services
			driver.findElement(By.xpath("//div[@id='mnftdsgnerror']//input[@id='mnftdsgn']")).sendKeys("4");
			driver.findElement(By.xpath("//div[@id='resalehrdwerror']//input[@id='resalehrdw']")).sendKeys("9");
			driver.findElement(By.xpath("//div[@id='insthrdwerror']//input[@id='insthrdw']")).sendKeys("9");
			
			//Software Products / Services
			driver.findElement(By.xpath("//div[@id='sftwdevslerror']//input[@id='sftwdevsl']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='cstmprgmerror']//input[@id='cstmprgm']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='sftwinsterror']//input[@id='sftwinst']")).sendKeys("4");
			driver.findElement(By.xpath("//div[@id='aspsrvcerror']//input[@id='aspsrvc']")).sendKeys("4");
			driver.findElement(By.xpath("//div[@id='webdssrvcerror']//input[@id='webdssrvc']")).sendKeys("2");
			
			//Communication / Community Services
			driver.findElement(By.xpath("//div[@id='webaccesserror']//input[@id='webaccess']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='telecmsrvcerror']//input[@id='telecmsrvc']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='websearcherror']//input[@id='websearch']")).sendKeys("9");
			
			//Other Information Technology Services
			driver.findElement(By.xpath("//div[@id='sysmngmterror']//input[@id='sysmngmt']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='secsrvcerror']//input[@id='secsrvc']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='cnsltsrvserror']//input[@id='cnsltsrvs']")).sendKeys("7");
			driver.findElement(By.xpath("//div[@id='staffsrvcerror']//input[@id='staffsrvc']")).sendKeys("7");
			driver.findElement(By.xpath("//div[@id='othrsrvcerror']//input[@id='othrsrvc']")).sendKeys("6");
			
			driver.findElement(By.xpath("//div[@id='othrsrvcerror']//input[@id='othrsrvcd']")).sendKeys("Support");
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("WhatYouDo", "WhatYouDo page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void WhoYouDoItForP(){
		try{
			driver.findElement(By.xpath("//div[@id='fedgvrnmerror']//input[@id='fedgvrnm']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='lclgvrnmerror']//input[@id='lclgvrnm']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='biotecherror']//input[@id='biotech']")).sendKeys("10");
			driver.findElement(By.xpath("//div[@id='hlthcareerror']//input[@id='hlthcare']")).sendKeys("9");
			driver.findElement(By.xpath("//div[@id='entrtmnterror']//input[@id='entrtmnt']")).sendKeys("7");
			driver.findElement(By.xpath("//div[@id='infotecherror']//input[@id='infotech']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='aviationerror']//input[@id='aviation']")).sendKeys("10");
			driver.findElement(By.xpath("//div[@id='finsrvcserror']//input[@id='finsrvcs']")).sendKeys("9");
			driver.findElement(By.xpath("//div[@id='insurnceerror']//input[@id='insurnce']")).sendKeys("7");
			driver.findElement(By.xpath("//div[@id='industrlerror']//input[@id='industrl']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='lawfrmserror']//input[@id='lawfrms']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='othrindrerror']//input[@id='othrindr']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='othrindrerror']//input[@id='othrindrd']")).sendKeys("Finance");
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("WhoYouDoItFor", "WhoYouDoItFor page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}

	public void WhatItDoesP(){
		try{
			driver.findElement(By.xpath("//div[@class='formRow fullWidthLabel']//textarea[@id='whatitdon']")).sendKeys("Testing. Detailed Description Of the applicable end use");
			driver.findElement(By.xpath("//div[@id='medprpserror']//input[@id='medprps']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='aerospapperror']//input[@id='aerospapp']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='dfnsapperror']//input[@id='dfnsapp']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='edctnprpserror']//input[@id='edctnprps']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='firesecerror']//input[@id='firesec']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='syssecurerror']//input[@id='syssecur']")).sendKeys("9");
			driver.findElement(By.xpath("//div[@id='sysadminerror']//input[@id='sysadmin']")).sendKeys("7");
			driver.findElement(By.xpath("//div[@id='busintlgerror']//input[@id='busintlg']")).sendKeys("9");
			driver.findElement(By.xpath("//div[@id='commctapperror']//input[@id='commctapp']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='fintrapperror']//input[@id='fintrapp']")).sendKeys("4");
			driver.findElement(By.xpath("//div[@id='acctgapperror']//input[@id='acctgapp']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='adminapperror']//input[@id='adminapp']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='physcprcerror']//input[@id='physcprc']")).sendKeys("8");
			driver.findElement(By.xpath("//div[@id='multimederror']//input[@id='multimed']")).sendKeys("5");
			driver.findElement(By.xpath("//div[@id='sclntwkerror']//input[@id='sclntwk']")).sendKeys("4");
			driver.findElement(By.xpath("//div[@id='othprderror']//input[@id='othprd']")).sendKeys("6");
			driver.findElement(By.xpath("//div[@id='othprderror']//input[@id='othprdd']")).sendKeys("Finance");
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("WhatItDoes", "WhatItDoes page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void YourTeamP(){
		try{
			driver.findElement(By.id("nbrprtnrs")).sendKeys("5");
			driver.findElement(By.id("nbrtech")).sendKeys("7");
			driver.findElement(By.id("nbrincntr")).sendKeys("10");
			driver.findElement(By.id("nbrsupprt")).sendKeys("20");
			driver.findElement(By.id("nbrsales")).sendKeys("15");
			driver.findElement(By.id("nbrother")).sendKeys("35");
			driver.findElement(By.id("avryrexp")).sendKeys("3");
			//subcontract radiobutton
			driver.findElement(By.xpath("//div[@class='formRow mostWidthLabel']//input[@name='subcntact' and @value='1']")).click();
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("YourTeam", "YourTeam page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void WhatCouldGoWrongP(){
		try{
			driver.findElement(By.xpath("//div//span//textarea[@id='whatcouldn']")).sendKeys("Most likely scenario. Testing");
			driver.findElement(By.xpath("//span[@class='options']//input[@name='affctuser' and @value='1']")).click();
			driver.findElement(By.xpath("//span[@class='options']//input[@name='prddwntme' and @value='2']")).click();
			driver.findElement(By.id("fixperc")).sendKeys("20");
			driver.findElement(By.xpath("//span[@class='options']//input[@name='prdwrnty' and @value='1']")).click();
			driver.findElement(By.xpath("//span[@class='options']//input[@name='secwrnty' and @value='1']")).click();
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("WhatCouldGoWrong", "WhatCouldGoWrong page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void YourLawsP(){
		try{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='procedr' and @value='1']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='corppolr' and @value='0']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='secpolr' and @value='1']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='intpropr' and @value='1']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='cntrrvsr' and @value='1']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='custcnrr' and @value='0']")).click();
			driver.findElement(By.xpath("//div[@id='coverages']//input[@name='vndragrr' and @value='0']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='custcnmdnerror']//input[@id='custcnmdn']")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id='custcnmd']")).sendKeys("20");
			driver.findElement(By.xpath("//*[@id='custpcmdn']")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id='custpcmd']")).sendKeys("8");
			driver.findElement(By.xpath("//*[@id='nocntrct']")).sendKeys("5");
			
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[5]/div[9]/div/span[1]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[5]/div[12]/div/span[1]/input[2]")).click();
			
			driver.findElement(By.xpath("//*[@id='cntravg']")).sendKeys("1000");
			driver.findElement(By.xpath("//*[@id='cntravgm']")).sendKeys("6");
			driver.findElement(By.xpath("//*[@id='cntravgy']")).sendKeys("2");
			driver.findElement(By.xpath("//*[@id='cntrlrg']")).sendKeys("10000");
			driver.findElement(By.xpath("//*[@id='cntrlrgm']")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id='cntrlrgy']")).sendKeys("3");
			
			driver.findElement(By.xpath("//*[@id='lrgcustnm']")).sendKeys("Testing Customer Name");
			driver.findElement(By.xpath("//*[@id='qpalphat']")).click();
			driver.findElement(By.xpath("//*[@id='qpcustsgn']")).click();
			driver.findElement(By.xpath("//*[@id='qpvdrcrtf']")).click();
			driver.findElement(By.xpath("//*[@id='qpprotdev']")).click();
			driver.findElement(By.xpath("//*[@id='cstfnbr']")).click();
			driver.findElement(By.xpath("//*[@id='csmonfr']")).click();
			
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("YourLaws", "YourLaws page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}	
	}
	
	public void KeepingItAllPrivateP(){
		try{
		driver.findElement(By.xpath("//div[@class='formRow autoWidthLabel']//input[@name='othrpinfo' and @value='0']")).click();
		driver.findElement(By.xpath("//div[@id='othrpinfodesc']//input[@id='indivnmes']")).sendKeys("6");	
		driver.findElement(By.xpath("//div[@class='formRow autoWidthLabel']//input[@name='encrptpi' and @value='0']")).click();	
		
		driver.findElement(By.xpath("//*[@id='persinfo']")).click();	
		driver.findElement(By.xpath("//*[@id='medhlth']")).click();	
		driver.findElement(By.xpath("//*[@id='ssnbr']")).click();
		
		driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[4]/span/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[7]/span/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[10]/span/input[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='cnfdiaccsn']")).sendKeys("All measures in Place. Testing");
		
		//click continue
		driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
		Thread.sleep(3000);
		report.updateTestLog("KeepingItAllPrivate", "KeepingItAllPrivate page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}	
	}
	
	public void ITOperationsP(){
		try{
			driver.findElement(By.xpath("//div[@class='hide4unico']//input[@name='itnwrkmn' and @value='0']")).click();
			driver.findElement(By.xpath("//div[@class='hide4unico']//input[@name='itoutsrc' and @value='0']")).click();
			driver.findElement(By.xpath("//*[@id='itoutsrcp']")).sendKeys("35");
			driver.findElement(By.xpath("//*[@id='itoutsrcpn']")).sendKeys("Testing1, Testing2, Testing3, and Testing4 are outsourced");	
			
			driver.findElement(By.xpath("//*[@id='infomrkt']")).click();
			driver.findElement(By.xpath("//*[@id='cntntagg']")).click();
			driver.findElement(By.xpath("//*[@id='intrctsit']")).click();
			driver.findElement(By.xpath("//*[@id='ecommerce']")).click();
			
			driver.findElement(By.xpath("//*[@id='acsrstrc']")).click();
			driver.findElement(By.xpath("//*[@id='firwlctl']")).click();
			driver.findElement(By.xpath("//*[@id='encrstrg']")).click();
			driver.findElement(By.xpath("//*[@id='warmsite']")).click();
			
			driver.findElement(By.xpath("//div[@class='formRow mostWidthLabel']//input[@name='encrdata' and @value='0']")).click();
			driver.findElement(By.xpath("//div[@class='formRow mostWidthLabel']//input[@name='acsprvlp' and @value='0']")).click();
			driver.findElement(By.xpath("//div[@id='adminacserror']//input[@id='adminacs']")).sendKeys("15");
			Select lstRevokeAccess = new Select (driver.findElement(By.xpath("//select[@id='rvkacsc']")));
			lstRevokeAccess.selectByValue("2");
			
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[13]/div/span/input[1]")).click();
			
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("ITOperations", "ITOperations page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}	
	}
	
	public void ContentPropertyP(){
		try{
			driver.findElement(By.xpath("//textarea[@id='contpropn']")).sendKeys("Testing of Included software");
			
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[4]/div/span[1]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[5]/div/span[1]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[8]/div/span[1]/input[1]")).click();
			Select lstRevokeAccess = new Select (driver.findElement(By.xpath("//*[@id='frmlpolr']")));
			lstRevokeAccess.selectByValue("1");
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[11]/div[2]/div/span[1]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id='basics']/fieldset/div[11]/div[5]/div/span[1]/input[2]")).click();
			
			//click continue
			driver.findElement(By.xpath("//div[@id='continueButtonDiv']//input[@id='continueButtonBlue']")).click();
			Thread.sleep(3000);
			report.updateTestLog("ContentProperty", "ContentProperty page completed", Status.PASS);		
		}catch(Exception e){
			System.out.println(e.toString());		
		}	
	}
	
	public void HistoryPageP(){
		try{
			
			driver.findElement(By.xpath("//input[@name='custcmpl' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='srvcfail' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='stoppay' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='refndreq' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='latedlvr' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='clmexpct' and @value='0']")).click();
			driver.findElement(By.xpath("//textarea[@id='clmexpctn']")).sendKeys("Aware of testing being conducted to ensure quality of application in production");
			driver.findElement(By.xpath("//input[@name='vltnacvt' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='clmsmade' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='clmprdcs' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='clmafflt' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='clmempl' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='nonpaysd' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='dscntsrvs' and @value='1']")).click();
			
			//click continue
			driver.findElement(By.xpath("//*[@id='continueButtonBlue']")).click();
			Thread.sleep(2000);
			
			//submit to the Hartford
			driver.findElement(By.xpath("//*[@id='completeSubmitButton']")).click();
			
			Thread.sleep(5000);
			
			//DesiredCapabilities dc = new DesiredCapabilities();
			//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "IGNORE");
			//d = new ChromeDriver(dc);
			
			//Alert alert = driver.switchTo().alert();
			//alert.accept();			// pop up window click ok
			//driver.switchTo().alert().accept();	 	
			
			Thread.sleep(5000);
			if (driver.findElement(By.id("quoteNewButton")).isDisplayed() ){		// verify application is submitted
				report.updateTestLog("submission", "Successfully submitted transaction to The Hartford", Status.PASS);	
				System.out.println("submitted");
			} else{
				report.updateTestLog("submission", "failed to submitted transaction to The Hartford", Status.FAIL);							
			}
			
		}catch(Exception e){
			System.out.println(e.toString());		
		}	
	}
	
}
	
	
	

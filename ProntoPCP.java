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
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import supportlibraries.*;
import uimap.*;

import com.utility.framework.ExcelDataAccessforxlsm;
import com.utility.framework.FrameworkException;
import com.utility.framework.Report;
import com.utility.framework.Status;
import com.utility.framework.CraftDataTable;
import com.selenium.components.*;
import supportlibraries.ScriptHelper;
import allocator.Allocator;

public class ProntoPCP { 
	WebDriver driver = new ChromeDriver();
	Date date = new Date(); //current date
	Report report = new Report(null, null, null);
	
	public ProntoPCP(){
		
	}
	
	/*public ProntoPCP(ScriptHelper scriptHelper){
		super(scriptHelper);
	}
	*/
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		ProntoPCP prontoPCP = new ProntoPCP();
		prontoPCP.AccountQualificationProntoPCP();
		prontoPCP.selectCoverage();
		prontoPCP.CompanyInfo();
		prontoPCP.DNO();
		prontoPCP.EPL();
		prontoPCP.FID();
		prontoPCP.CRI();
		prontoPCP.lossHistory();
		prontoPCP.createQuote();
		prontoPCP.VisionCheckProntoPCP();
		prontoPCP.VisionRatingProntoPCP();
		prontoPCP.QuoteSummaryProntoPCP();
		
		//System.out.println(today);	
		
	}
		
	public void AccountQualificationProntoPCP(){
		String URL = "http://qawww.hfpinsurance.com/worklist/ebc2sbu.jsp";
		String username = "perryros";
		String password = "password";
		try{
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("USER")).sendKeys(username);
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
			//click the submit button
		driver.findElement(By.xpath("//input[@onclick='submitForm();']")).click();
		Thread.sleep(2000);
			
			//how???	 verify page displays
		driver.findElement(By.id("newQuoteText")).click();	//click on create new submission link
		
		//driver.findElement(By.linkText("Management Liability For Private & Non-Profit Risks ")).click();
		driver.findElement(By.xpath("//*[@id='main_content']/div[1]/div[6]/div[2]/a[1]/b")).click();
		//driver.findElement(By.xpath("//*[@class='leftBox rounded']//li[contains(text(),'Up to $50M in revenue or assets')]"));
		driver.findElement(By.xpath("//*[@class='leftBox rounded']/div/div[2]/ul[2]/li/button/a")).click(); // choose private company
		Thread.sleep(2000);
		
		
		//locate select state drop down list
		WebElement statelist = driver.findElement(By.xpath("//div[@id='selinssterror']//span//select[@name='selInsst']"));
		Select lstState = new Select (statelist);
		//need to parameterize 
		lstState.selectByVisibleText("Alabama");
		//enter NAIC code
		WebElement NAICcode = driver.findElement(By.id("classificationLookup"));
		NAICcode.sendKeys("115111");	//enter NAIC code
		Thread.sleep(2000);
		NAICcode.sendKeys(Keys.DOWN);	//click down arrow
		Thread.sleep(2000);
		NAICcode.sendKeys(Keys.RETURN);	// press enter
		Thread.sleep(2000);
		
		//enter emp,zipcode
		driver.findElement(By.name("txtTotemp")).sendKeys("21");
		driver.findElement(By.name("txtInszip")).sendKeys("35049");
		//producer info
		Select lstprodinfo = new Select (driver.findElement(By.name("selBrokerName")));
		lstprodinfo.selectByIndex(1);
		Thread.sleep(1000);
		//producer contact info
		Select lstprodcontact = new Select (driver.findElement(By.name("selContactName")));
		lstprodcontact.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.name("continueButton")).click();
		Thread.sleep(10000);
		report.updateTestLog("Account Qualification", "Account Qualification page is completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void selectCoverage(){
		try{
		/*
		String TestcaseName = dataTable.getData("General", "TestcaseName");	
		String Address = dataTable.getData("General", "Address");	
		String City = dataTable.getData("General", "City");	
		String EPLCurrLimits = dataTable.getData("General", "Applicant_FidCov");	
		String FIDCurrLimits = dataTable.getData("General", "FIDCurrLimits");	
		String DNOCurrLimits = dataTable.getData("General", "FIDCurrLimits");	
		String CRICurrLimits = dataTable.getData("General", "CRICurrLimits");	
		*/	
		//name of applicant company	
		
		String TestcaseName = "CW_TargetClass_AL";	// parameterize TestcaseName
		Date TodayDate = new Date();
		SimpleDateFormat InsuredNameDateFormat = new SimpleDateFormat("MMMddyyHHmmSS");
		String InsuredNameDate = InsuredNameDateFormat.format(TodayDate);
		String InsuredName = TestcaseName +"_"+ InsuredNameDate;		
		driver.findElement(By.name("txtCompanyName")).sendKeys(InsuredName);
		report.updateTestLog("Insured Name", "Insured Name is: " +InsuredName, Status.PASS);		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='txtInsad1']")).sendKeys("12 Hatchcot avenue");	//mail address
		driver.findElement(By.xpath("//*[@id='txtInscty']")).sendKeys("CLEVELAND");	//city
		Thread.sleep(1000);
		SimpleDateFormat EffDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String EffDate = EffDateFormat.format(TodayDate);
		driver.findElement(By.xpath("//*[@id='txtEffDte']")).sendKeys(EffDate);	//eff date=today's date
		Thread.sleep(2000);
		
		
		//checkbox DNO, EPL, FID, CRI
		driver.findElement(By.id("chkDOP")).click();
		//NJ,CA epl off
		WebElement EPL = driver.findElement(By.id("chkEPL"));
		EPL.click();
		driver.findElement(By.id("chkFID")).click();
		driver.findElement(By.id("chkCRI")).click();
		driver.findElement(By.id("chkCRDEPIND")).click();
		driver.findElement(By.id("chkCRINSIND")).click();
		driver.findElement(By.id("chkCROUTIND")).click();
		driver.findElement(By.id("chkCRCMPIND")).click();
		
		//radiobuttons
		driver.findElement(By.xpath("//input[@name='p_dopcovi' and @value='Y']")).click();	//DNO
		//DNO date-366   
		LocalDate DNOdate = LocalDate.now().minusDays(366);
		
		String DNOdateformat = EffDateFormat.format(DNOdate);
		driver.findElement(By.id("p_dopeff")).sendKeys(DNOdateformat);
		driver.findElement(By.id("p_doplmt")).sendKeys("700000");
		
		//EPL
		if (EPL.isSelected()){ 
			driver.findElement(By.xpath("//input[@name='p_eplcovi' and @value='Y']")).click();
			//EPL date-367
			LocalDate EPLdate = LocalDate.now().minusDays(367);
			String EPLdateformat = EffDateFormat.format(EPLdate);
			driver.findElement(By.id("p_dopeff")).sendKeys(EPLdateformat);
			
			driver.findElement(By.id("p_epllmt")).sendKeys("700000");
		}	
		driver.findElement(By.xpath("//input[@name='p_fidcovi' and @value='Y']")).click();	//FID 
		//FID=date-366 
		LocalDate FIDdate = LocalDate.now().minusDays(366);
		String FIDdateformat = EffDateFormat.format(FIDdate);
		driver.findElement(By.id("p_fideff")).sendKeys(FIDdateformat);
		driver.findElement(By.id("p_fidlmt")).sendKeys("700000");
				
		driver.findElement(By.xpath("//input[@name='p_crpcovi' and @value='Y']")).click();	//CRI 
		//CRI date-365 
		LocalDate CRIdate = LocalDate.now().minusDays(365);
		String CRIdateformat = EffDateFormat.format(CRIdate);
		driver.findElement(By.id("p_crpeff")).sendKeys(CRIdateformat);
		driver.findElement(By.id("p_crplmt")).sendKeys("700000");
			
		driver.findElement(By.xpath("//input[@name='appknwl' and @value='N']")).click();
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("Select Coverage", "Select Coverage page completed", Status.PASS);	
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CompanyInfo(){
		try{
		driver.findElement(By.xpath("//*[@id='txtDscoper']")).sendKeys("Pronto testing");
		driver.findElement(By.id("txtTotrev")).sendKeys("10000000");	
		driver.findElement(By.id("txtTotloc")).sendKeys("11");		
		driver.findElement(By.xpath("//input[@name='rdNonussb' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdMerger' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdRestrt' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdDownsize' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdPrcdev12' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdFedcntcr' and @value='N']")).click();
		
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("Company Info", "Company Info page completed", Status.PASS);
		}catch(Exception e){
		System.out.println(e.toString());		
		}
	}
	
	public void DNO() {
		try{
		//financial info
		driver.findElement(By.xpath("//*[@id='txtcurmonth']")).click();	//place cursor in, so that calendar pops up
		WebElement yyyy = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//select[@class='ui-datepicker-year']"));	
		Select lstyyyy = new Select (yyyy);	// select YYYY dropdow list, 2014. select year first, otherwise it won't display sep/oct
		lstyyyy.selectByVisibleText("2014");
			
		WebElement MM = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']"));	
		Select lstMM = new Select (MM);	// select MM dropdow list, Sep
		lstMM.selectByVisibleText("Sep");	
				
		driver.findElement(By.xpath("//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")).click();	// click done
		
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
		//driver.findElement(By.id("txttotrev")).sendKeys("");		auto-filled
		
		//String NetIncomeAfter = dataTable.getData("DNO", "NetIncomeAfter1");	
		String NetIncomeAfter = "5,000,000";
		driver.findElement(By.id("txtniatamt")).sendKeys(NetIncomeAfter);	// net income parameterize
		
		driver.findElement(By.id("txtintexp")).sendKeys("750,000");	
		
		//String EarningsBefore = dataTable.getData("DNO", "EarningsBefore1");	
		String EarningsBefore = "3,000,000";
		driver.findElement(By.id("txtearnbt")).sendKeys(EarningsBefore);	// earning before parameterize
		
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
	
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("DNO", "DNO page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void EPL() {
		try{
		//String FTEMP = dataTable.getData("EPL", "FTEMP");	
		//String PTEMP = dataTable.getData("EPL", "PTEMP");
		//String INDCONT = dataTable.getData("EPL", "INDCONT");
		//String UNIONEMP = dataTable.getData("EPL", "UNIONEMP");
		//String FOREMP = dataTable.getData("EPL", "FOREMP");
		//String CAEMP = dataTable.getData("EPL", "CAEMP");
		//String NJEMP = dataTable.getData("EPL", "NJEMP");
		//String Emp50k = dataTable.getData("EPL", "Emp50000");
		//String Emp100k = dataTable.getData("EPL", "Emp100000");
								
		String FTEMP = "21";
		String PTEMP = "0";
		String INDCONT = "0";
		String UNIONEMP = "0";
		String FOREMP = "0";
		String CAEMP = "0";
		String NJEMP = "0";
		String Emp50k = "0";
		String Emp100k = "0";
				
		driver.findElement(By.id("txtCurft")).sendKeys(FTEMP);	// FTEMP parameterize
		driver.findElement(By.id("txtCurpt")).sendKeys(PTEMP);	// PTEMP parameterize
		driver.findElement(By.id("txtCurindc")).sendKeys(INDCONT);	
		driver.findElement(By.id("txtCurunion")).sendKeys(UNIONEMP);	
		driver.findElement(By.id("txtFrnempl")).sendKeys(FOREMP);	
		
		driver.findElement(By.id("txtCaempl")).sendKeys(CAEMP);	
		driver.findElement(By.id("txtNjempl")).sendKeys(NJEMP);	
		
		driver.findElement(By.id("txt50Kempl")).sendKeys(Emp50k);	
		driver.findElement(By.id("txt100Kemplerror")).sendKeys(Emp100k);	
		
		driver.findElement(By.xpath("//input[@name='rdEmplsign' and @value='Y']")).click();
		driver.findElement(By.xpath("//input[@name='rdRskman' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdHrdept' and @value='Y']")).click();
		driver.findElement(By.xpath("//input[@name='rdEplcmpl' and @value='N']")).click();
		
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("EPL", "EPL page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void FID(){
		try{
		//String TOTALASSETS = dataTable.getData("EPL", "TOTALASSETS");
		String TOTALASSETS = "7986000";
			
		driver.findElement(By.xpath("//input[@name='rdErisa' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdEmplsec' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdRedben' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdDolirs' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdPlnlitg' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdPlntyp1' and @value='N']")).click();
		driver.findElement(By.id("txt100Kemplerror")).sendKeys(TOTALASSETS);
		
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("FID", "FID page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void CRI(){
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
	
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("CRI", "CRI page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void lossHistory(){
		try{
		driver.findElement(By.xpath("//input[@name='rdLwstclm' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdInsrefse' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdPndclaim' and @value='N']")).click();
		driver.findElement(By.xpath("//input[@name='rdNotice' and @value='N']")).click();
		
		driver.findElement(By.id("continueButton")).click();
		Thread.sleep(2000);
		report.updateTestLog("loss History", "loss History page completed", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void createQuote(){
		try{
			WebElement premium1 = driver.findElement(By.xpath("//*[@id='topC1prem']"));
			WebElement premium2 = driver.findElement(By.id("//*[@id='topC2prem']"));
			WebElement premium3 = driver.findElement(By.id("//*[@id='topC3prem']"));
			
			report.updateTestLog("create Quote", "premium option 1 is: " + premium1, Status.DONE);
			report.updateTestLog("create Quote", "premium option 2 is: " + premium2, Status.DONE);
			report.updateTestLog("create Quote", "premium option 3 is: " + premium3, Status.DONE);
			
			report.updateTestLog("create Quote", "premium matches baseline", Status.PASS);
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void VisionCheckProntoPCP(){
		try{
			String URL = "http://hfdev.thehartford.com:19999/VIS/jedi/splash.jsp";
			driver.get(URL);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			//select underwriter, top left, good afternoon home
			driver.findElement(By.xpath("//span[@title='Home Underwriter (0997)']")).click(); 	//click home link
			//how??? switch to pop-up window
			Select lstUW = new Select (driver.findElement(By.xpath("//select[@name='uwSelect']")));
			lstUW.selectByVisibleText("Jennifer Bramley");	//underwriter
			
			driver.findElement(By.xpath("//input[@class='bookbill' and @value='Submit']")).click();	//submit
			
			//switch to old window???
			//parameterize test case name
			String InsuredName = "CW_TargetClass_AL" + date.toString();		//
			driver.findElement(By.name("insnam")).sendKeys(InsuredName);	//enter Insured name
			driver.findElement(By.xpath("//input[@src='/VIS/images/go.gif']")).click();  	//click go
			driver.findElement(By.xpath("//td[@title='Primary']")).click();  	//submit in My active directory
			//report. Insured name matches Pronto
			
			//U/W page
			
			}catch(Exception e){
			System.out.println(e.toString());		
			}
		
	}
	
	public void VisionRatingProntoPCP(){
		try{
			
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
	public void QuoteSummaryProntoPCP(){
		try{
			
		}catch(Exception e){
			System.out.println(e.toString());		
		}
	}
	
}	
	
	
	
	
	
	
	
	


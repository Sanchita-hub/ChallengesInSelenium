package allocator;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.Platform;

import com.selenium.components.Browser;
import com.selenium.components.ExecutionMode;
import com.selenium.components.MobileExecutionPlatform;
import com.selenium.components.MobileToolName;
import com.selenium.components.ResultSummaryManager;
import com.selenium.components.SeleniumTestParameters;
import com.utility.framework.ExcelDataAccessforxlsm;
import com.utility.framework.FrameworkParameters;
import com.utility.framework.IterationOptions;
import com.utility.framework.Settings;


public class Allocator {
	private FrameworkParameters frameworkParameters = FrameworkParameters
			.getInstance();
	private Properties properties;
	private Properties mobileProperties;
	private ResultSummaryManager resultSummaryManager = ResultSummaryManager.getInstance();
	public static String envPath;
 	public static String appName;
 	public static String lob;
 	
	public static void main(String[] args) {
		Allocator.setLOB("LOB");
		Allocator.setAppName("Project");
		Allocator.setEnvpath("INT");
		if(args.length!=0)
			Allocator.setEnvpath(args[0]);
		Allocator allocator = new Allocator();
		allocator.driveBatchExecution();
	}
	
	public static void setLOB(String lobSet){
		lob = lobSet;
	}
	
	public static void setAppName(String appNameSet){
		appName = appNameSet;
	}
	
	public static void setEnvpath(String path){
		envPath = path;
	}

	private void driveBatchExecution() {
		resultSummaryManager.setRelativePath();
		properties = Settings.getInstance();
		mobileProperties = Settings.getMobilePropertiesInstance();
		String runConfiguration;
		if (System.getProperty("RunConfiguration") != null) {
			runConfiguration = System.getProperty("RunConfiguration");
		} else {
			runConfiguration = properties.getProperty("RunConfiguration");
		}
		resultSummaryManager.initializeTestBatch(runConfiguration);

		int nThreads = Integer.parseInt(properties.getProperty("NumberOfThreads"));
		resultSummaryManager.initializeSummaryReport(nThreads);

		resultSummaryManager.setupErrorLog();
        
		int testBatchStatus = executeTestBatch(nThreads);
		resultSummaryManager.wrapUp(false);
		
		resultSummaryManager.copyFolder();	
		resultSummaryManager.launchResultSummary();
		System.exit(testBatchStatus);
	}
		
	private int executeTestBatch(int nThreads) {
		System.out.println("***********Executing the Test batch method************");
		List<SeleniumTestParameters> testInstancesToRun = getRunInfo(frameworkParameters
				.getRunConfiguration());
		ExecutorService parallelExecutor = Executors
				.newFixedThreadPool(nThreads);
		ParallelRunner testRunner = null;

		for (int currentTestInstance = 0; currentTestInstance < testInstancesToRun
				.size(); currentTestInstance++) {
			testRunner = new ParallelRunner(
					testInstancesToRun.get(currentTestInstance));
			parallelExecutor.execute(testRunner);

			if (frameworkParameters.getStopExecution()) {
				break;
			}
		}

		parallelExecutor.shutdown();
		while (!parallelExecutor.isTerminated()) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

		if (testRunner == null) {
			return 0; // All tests flagged as "No" in the Run Manager
		} else {
			return testRunner.getTestBatchStatus();
		}
	}

	private List<SeleniumTestParameters> getRunInfo  (String sheetName){
		
	 ExcelDataAccessforxlsm runManagerAccess = new ExcelDataAccessforxlsm(
					       frameworkParameters.getRelativePath(), "RunManager");
	 String testpath = frameworkParameters.getRelativePath();
	 runManagerAccess.setDatasheetName(sheetName);
	 int nTestInstances = runManagerAccess.getLastRowNum();
		//System.out.println("Last Row Number:"+nTestInstances);
		List<SeleniumTestParameters> testInstancesToRun = new ArrayList<SeleniumTestParameters>();

		for (int currentTestInstance = 1; currentTestInstance <= nTestInstances; currentTestInstance++) {
			String executeFlag = runManagerAccess.getValue(currentTestInstance,
					"Execute");

			if ("Yes".equalsIgnoreCase(executeFlag)) {
				String currentScenario = runManagerAccess.getValue(currentTestInstance, "TestScenario");
				String currentTestcase = runManagerAccess.getValue(currentTestInstance, "TestCase");
				SeleniumTestParameters testParameters = new SeleniumTestParameters(currentScenario, currentTestcase);

				testParameters.setCurrentTestInstance("Instance"+ runManagerAccess.getValue(currentTestInstance, "TestInstance"));
				testParameters.setCurrentTestDescription(runManagerAccess.getValue(currentTestInstance, "Description"));

				String iterationMode = runManagerAccess.getValue(currentTestInstance, "IterationMode");
				if (!"".equals(iterationMode)) {testParameters.setIterationMode(IterationOptions.valueOf(iterationMode));
				} else {
					testParameters.setIterationMode(IterationOptions.RUN_ALL_ITERATIONS);
				}

				String startIteration = runManagerAccess.getValue(currentTestInstance, "StartIteration");
				if (!"".equals(startIteration)) {
					testParameters.setStartIteration(Integer.parseInt(startIteration));
				}
				String endIteration = runManagerAccess.getValue(currentTestInstance, "EndIteration");
				if (!"".equals(endIteration)) {
					testParameters.setEndIteration(Integer.parseInt(endIteration));
				}

				String executionMode = runManagerAccess.getValue(currentTestInstance, "ExecutionMode");
				if (!"".equals(executionMode)) {
					testParameters.setExecutionMode(ExecutionMode.valueOf(executionMode));
				} else {
					testParameters.setExecutionMode(ExecutionMode.valueOf(properties.getProperty("DefaultExecutionMode")));
				}

				String toolName = runManagerAccess.getValue(currentTestInstance, "MobileToolName");
				if (!"".equals(toolName)) {
					testParameters.setMobileToolName(MobileToolName.valueOf(toolName));
				} else {
					testParameters.setMobileToolName(MobileToolName.valueOf(mobileProperties.getProperty("DefaultMobileToolName")));
				}

				String executionPlatform = runManagerAccess.getValue(currentTestInstance, "MobileExecutionPlatform");
				if (!"".equals(executionPlatform)) {
					testParameters.setMobileExecutionPlatform(MobileExecutionPlatform.valueOf(executionPlatform));
				} else {
					testParameters.setMobileExecutionPlatform(MobileExecutionPlatform.valueOf(mobileProperties
									.getProperty("DefaultMobileExecutionPlatform")));
				}

				String mobileOSVersion = runManagerAccess.getValue(currentTestInstance, "MobileOSVersion");
				if (!"".equals(mobileOSVersion)) {
					testParameters.setmobileOSVersion(mobileOSVersion);
				}

				String deviceName = runManagerAccess.getValue(currentTestInstance, "DeviceName");
				if (!"".equals(deviceName)) {
					testParameters.setDeviceName(deviceName);
				} else {
					testParameters.setDeviceName(mobileProperties.getProperty("DefaultDevice"));
				}

				String browser = runManagerAccess.getValue(currentTestInstance,"Browser");
				if (!"".equals(browser)) {
					testParameters.setBrowser(Browser.valueOf(browser));
				} else {
					testParameters.setBrowser(Browser.valueOf(properties.getProperty("DefaultBrowser")));
				}
				String browserVersion = runManagerAccess.getValue(currentTestInstance, "BrowserVersion");
				if (!"".equals(browserVersion)) {
					testParameters.setBrowserVersion(browserVersion);
				}
				String platform = runManagerAccess.getValue(currentTestInstance, "Platform");
				if (!"".equals(platform)) {
					testParameters.setPlatform(Platform.valueOf(platform));
				} else {
					testParameters.setPlatform(Platform.valueOf(properties.getProperty("DefaultPlatform")));
				}
				String seeTestPort = runManagerAccess.getValue(currentTestInstance, "SeeTestPort");
			
				if (!"".equals(seeTestPort)) {
					testParameters.setSeeTestPort(seeTestPort);
				} else {
					testParameters.setSeeTestPort(properties.getProperty("SeeTestDefaultPort"));
				}
				testInstancesToRun.add(testParameters);
			}
		}
		return testInstancesToRun;
	}
}
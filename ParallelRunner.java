package allocator;

import com.selenium.components.ResultSummaryManager;
import com.selenium.components.SeleniumTestParameters;
import com.utility.framework.FrameworkParameters;

import supportlibraries.DriverScript;


/**
 * Class to facilitate parallel execution of test scripts
 * @author Cognizant
 */
public class ParallelRunner implements Runnable {
	private final SeleniumTestParameters testParameters;
	private int testBatchStatus = 0;
	
	
	/**
	 * Constructor to initialize the details of the test case to be executed
	 * @param testParameters The {@link SeleniumTestParameters} object (passed from the {@link Allocator})
	 */
	ParallelRunner(SeleniumTestParameters testParameters) {
		
		super();
		
		this.testParameters = testParameters;
		//System.out.println("Setting the Selenium test parameters");
	}
	
	/**
	 * Function to get the overall test batch status
	 * @return The test batch status (0 = Success, 1 = Failure)
	 */
	public int getTestBatchStatus() {
		return testBatchStatus;
	}
	
	@Override
	public void run() {
		FrameworkParameters frameworkParameters = FrameworkParameters.getInstance();
		String testReportName, executionTime, testStatus;
		
		if(frameworkParameters.getStopExecution()) {
			testReportName = "N/A";
			executionTime = "N/A";
			testStatus = "Aborted";
			testBatchStatus = 1;	// Non-zero outcome indicates failure
		} else {
			DriverScript driverScript = new DriverScript(this.testParameters);
			try{
				driverScript.driveTestExecution();
			}catch(Exception e){
				System.out.println("Handled Exception in the code");
			}
						
			testReportName = driverScript.getReportName();
			executionTime = driverScript.getExecutionTime();
			testStatus = driverScript.getTestStatus();
			System.out.println("Status of the Test case:" +testStatus);
			
			
			if ("failed".equalsIgnoreCase(testStatus)) {
				testBatchStatus = 1;	// Non-zero outcome indicates failure
			}
		}
		
		ResultSummaryManager resultSummaryManager = ResultSummaryManager.getInstance();
		resultSummaryManager.updateResultSummary(testParameters, testReportName,
															executionTime, testStatus);
		//QC update
		//String testSetID = DriverScript.dataTable.getData("General_Data", "TestCaseID");
	}
}
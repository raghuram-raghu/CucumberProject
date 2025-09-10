package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getReportInstance(){

         if(extent==null) {

             String timestamp = new SimpleDateFormat("dd/MM/yyyy  HH/mm/ss").format(new Date());

             String reportPath = "reports/Extentreport"+timestamp+".html";

             ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

             reporter.config().setDocumentTitle("Automation Test Report");

             reporter.config().setReportName("Test Execution Report ");

             extent = new ExtentReports();

             extent.attachReporter(reporter);

         }
        return extent;

    }

    public static ExtentTest createTest(String testName){

        test = getReportInstance().createTest(testName);

        return test;
    }

}

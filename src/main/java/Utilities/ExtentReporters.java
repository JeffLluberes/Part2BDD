package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ExtentReporters {
    public static ExtentReports generateExtentReporter() throws Exception {

    ExtentReports extentReport = new ExtentReports();
    File extentReportFile = new File(System.getProperty("user.dir") + "\\Test_Output\\ExtentReport\\extentreporterTuturialNinja.html");
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);

        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("TutrialsNinja REGRESSION Test");
        sparkReporter.config().setDocumentTitle("BootCamp Part2 BDD Framework");
        sparkReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss");

        extentReport.attachReporter(sparkReporter);

        return extentReport;
}
}
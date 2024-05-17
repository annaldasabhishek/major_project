package utliles;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Base_class.class_browser;
public class Generic_methods
{
	public static String captureScreenshot() throws IOException {

		String screenshotPath = "       ";

		//1. take screenshot object
		TakesScreenshot scrShot =( (TakesScreenshot) class_browser.driver);

		File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File("C:\\Users\\LILT_87\\Documents\\screenshots//"
				+ "ScreenCapture" + System.currentTimeMillis() + ".png");
		
		// 4. copy the source file into destination path
		FileUtils.copyFile(sourceFile, destinationPath);
		
		//5. capturing the  in string
		screenshotPath = destinationPath.getAbsolutePath();

		return screenshotPath;
	}
}

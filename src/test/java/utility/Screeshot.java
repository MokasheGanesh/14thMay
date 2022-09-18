package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screeshot {
	
	public static String captureScreeshot(WebDriver driver) throws IOException
	{ 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "D:\\14th may SS\\"+System.currentTimeMillis()+".jpg";
		
		File dest = new File(path);
		
		FileUtils.copyFile(src, dest);
		return path;
				
	}

}

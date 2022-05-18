package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	public static String getTData(int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Login1\\TestData\\Zk.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

	public static String getPFData(String propName) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Login1\\Property.properties");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(propName);
		return value;
	}
	
	public static void getSnapShot(WebDriver driver ,int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File tgt= new File("C:\\Users\\admin\\eclipse-workspace\\Login1\\ScreenShot\\"+TCID+" Test.png");
		FileHandler.copy(src, tgt);
	}

}

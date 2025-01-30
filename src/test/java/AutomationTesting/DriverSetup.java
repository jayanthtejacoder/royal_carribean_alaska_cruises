package AutomationTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	
	static WebDriver driver;
	static Thread thread = new Thread();
    
	static String baseurl;
	
	public static WebDriver getDriver(String browserName) throws IOException {
		baseurl = Excel.me();
		if (driver == null) {
        	//Setting the WebDriver
            switch (browserName.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get(baseurl);
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    //Navigating to Quora Website
                    driver.get(baseurl);
                    //File launch=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            		//Files.copy(launch,new File("C:\\Users\\2320144\\eclipse-workspace\\GadgetsAutomation\\Screenshots\\websitelaunch.jpg"));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser name: " + browserName);
            }
        }
        return driver;
	}
//	public static void popupClose()
//	{
//		WebElement continueButt = driver.findElement(By.xpath("//div[@class='headerCountryNotification__CTA']"));
//		continueButt.click();
//	}
	public static void SearchTextfield() throws InterruptedException, IOException
	{
		WebElement searchButton = driver.findElement(By.xpath("//button[@id='rciSearchHeaderIcon']"));
		searchButton.click();
		Thread.sleep(3000);
		WebElement searchValue = driver.findElement(By.xpath("//div[@class='headerSearch__base__container__searchbox']//input[@id='rciSearchInput']"));
		searchValue.click();
		Thread.sleep(2000);
		WebElement searchValue2 = driver.findElement(By.xpath("//div[@class='headerSearch__base__container__searchbox']//input[@id='rciSearchInput']"));
		Excel my=new Excel();
		String searchTxt = my.te();
		searchValue2.sendKeys(searchTxt);
		
	}
	public static void SearchButton()
	{
		WebElement searchButton = driver.findElement(By.id("rciSearchInputIcon"));
		searchButton.click();
	}
	public static void SearchResult()
	{
		WebElement searchLink = driver.findElement(By.xpath("//a[contains(text(),'Rhapsody of the Seas | Cruise Ships | Royal Caribb')]"));
		searchLink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	public static void BookOption()
	{
		WebElement bookOption = driver.findElement(By.xpath("//a[@id='promoHeroCTAButton']"));
		bookOption.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	public static void CruiseDates()
	{
		WebElement cruiseDates = driver.findElement(By.xpath("//button[normalize-space()='Cruise dates']"));
		cruiseDates.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		/*WebElement months = driver.findElement(By.className("MuiButtonBase"));
		months.click();*/
	}
	public static void Months() throws InterruptedException
	{
		//Thread.sleep(3000);
		//WebElement monthButton = driver.findElement(By.xpath("//button[@tabindex='0' and @xpath='1']"));
		//monthButton.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> months = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation styles__MonthButton-sc-e7674c24-5 gHuZrk month-button css-csbzia']"));
		for(WebElement m:months)
		{
			if(m.getText().equals("May") || m.getText().equals("Jun") || m.getText().equals("Jul") || m.getText().equals("Aug"))
			{
				js.executeScript("arguments[0].click()", m);
			}
		}
		
		WebElement seeResult = driver.findElement(By.xpath("//button[normalize-space()='See results']"));
		seeResult.click();
		
	}
	public static void DeparturePort()
	{
		WebElement depPort = driver.findElement(By.xpath("//button[normalize-space()='Departure Port']//*[name()='svg']"));
		depPort.click();
		
		//WebElement sanJuanButton = driver.findElement(By.xpath("//button[@id='departure-port-label-SJU']"));
		//sanJuanButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement sanJuanButton = driver.findElement(By.xpath("//button[@id='departure-port-label-SJU']"));
		js.executeScript("arguments[0].click()", sanJuanButton);
		
		WebElement seeResult = driver.findElement(By.xpath("//button[normalize-space()='See results']"));
		seeResult.click();
	}
	public static void Destinations()
	{
		WebElement destination = driver.findElement(By.xpath("//button[normalize-space()='Destinations']//*[name()='svg']"));
		destination.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement caribbeanButton = driver.findElement(By.xpath("//button[@id='destination-card-label-CARIB']"));
		js.executeScript("arguments[0].click()", caribbeanButton);
		
		WebElement seeResult = driver.findElement(By.xpath("//button[normalize-space()='See results']"));
		seeResult.click();
		
	}
	public static void NoOfNights()
	{
		WebElement nights = driver.findElement(By.xpath("//button[normalize-space()='Number of nights']//*[name()='svg']"));
		nights.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement six2eight = driver.findElement(By.xpath("//button[normalize-space()='6 - 8']"));
		js.executeScript("arguments[0].click()", six2eight);
		
		WebElement seeResult = driver.findElement(By.xpath("//button[normalize-space()='See results']"));
		seeResult.click();
	}
	public static void SortBy()
	{
		WebElement sortDropDown = driver.findElement(By.xpath("//button[@class='MuiTypography-root MuiTypography-title2 styles__Select-sc-57c6701c-2 fMhUgK btn-style-text DROPDOWN_BUTTON css-13jcdqr']//*[name()='svg']"));
		sortDropDown.click();
		
		WebElement lowToHigh = driver.findElement(By.xpath("//p[normalize-space()='Price lowest to highest']"));
		lowToHigh.click();
		
		
	}
	public static void quitDriver()
	{
		driver.quit();
	}
	
		
	}
}


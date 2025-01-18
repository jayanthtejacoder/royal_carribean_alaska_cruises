package AutomationTesting;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.io.IOException;
public class Main 
{
	@BeforeTest
    public void LaunchApplication() throws IOException, InterruptedException
    {
    	DriverSetup.getDriver("chrome");
    }
	
	@Test(priority=1)
    public void clickSearchTextfield() throws InterruptedException, IOException
    {
    	DriverSetup.SearchTextfield();
    }
	
	@Test(priority=2)
    public void clickSearchButton()
    {
    	DriverSetup.SearchButton();
    }
	
	@Test(priority=3)
    public void clickSearchResult()
    {
    	DriverSetup.SearchResult();
    }
	
	@Test(priority=4)
    public void clickBookOption()
    {
    	DriverSetup.BookOption();
    }
	
	@Test(priority=5)
    public void clickCruiseDates()
    {
    	DriverSetup.CruiseDates();
    }
	
	@Test(priority=6)
    public void clickMonths() throws InterruptedException
    {
    	DriverSetup.Months();
    }
	
	@Test(priority=7)
    public void clickDeparturePort()
    {
    	DriverSetup.DeparturePort();
    }
	
	@Test(priority=8)
    public void clickDestinations()
    {
    	DriverSetup.Destinations();
    }
	
	@Test(priority=9)
    public void clickNoOfNights()
    {
    	DriverSetup.NoOfNights();
    }
	
	@Test(priority=10)
    public void clickSortBy()
    {
    	DriverSetup.SortBy();
    }
	
	@AfterTest
    public void clickCloseApp()
    {
    	DriverSetup.quitDriver();
    }
}

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class orgurl{
	
	private static final String MyAccount = null;
	//	WebDriver driver;
	static AppiumDriver<MobileElement> driver;
	//	androidDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
	public static void openCalculator() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("AUTOMATION_NAME","Appium");
		cap.setCapability("deviceName", "vivo Y15C");
		cap.setCapability("udid", "300E6005N092902282");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability(MobileCapabilityType.NO_RESET,"True");
		cap.setCapability(MobileCapabilityType.FULL_RESET,"false");
		cap.setCapability("appPackage", "com.kockpit.kube");
		cap.setCapability("appActivity", "com.kockpit.kube.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
	
// Org url flow with blank valid invalid details
		
		System.out.println("Work successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
//Blank flow		
		MobileElement organizationUrlinput = (MobileElement) driver.findElementByXPath("");
		organizationUrlinput.sendKeys(" ");
		MobileElement Submit = (MobileElement) driver.findElementByXPath("");
		Submit.click();
		String Blankerror = driver.findElementByXPath("").getText();
		if(Blankerror.equals("")){
			System.out.println("The organizational Blank Url flow is fine");
		}
		else{
			System.out.println("Have some error in the blank url flow");
		}
//Invalid without domain and @
	
		organizationUrlinput.sendKeys("teamsdfsd");
		Submit.click();
		String Invaliderror = driver.findElementByXPath("").getText();
		if(Invaliderror.equals("")){
			System.out.println("The organizational Invalid domain Url flow is fine");
		}
		else{
			System.out.println("Have some error in the Invalid domain url flow");
		}
// Unregistered url		
	
		organizationUrlinput.sendKeys("team.com");
		Submit.click();
		String unregisterederror = driver.findElementByXPath("").getText();
		if(unregisterederror.equals("")){
			System.out.println("The organizational unregistred domain Url flow is fine");
		}
		else{
			System.out.println("Have some error in the unregistred domain url flow");
		}
		

// Valid URL
		
		organizationUrlinput.sendKeys("team.com");
		Submit.click();
		String Loginpageheader = driver.findElementByXPath("").getText();
		if(Loginpageheader.equals("")){
			System.out.println("Url flow is fine");
		}
		else{
			System.out.println("Have some error in the url flow");
		}
							

	}
}


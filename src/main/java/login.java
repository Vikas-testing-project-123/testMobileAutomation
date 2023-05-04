import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class login{
	
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
		Thread.sleep(2000);
// Org url flow with blank valid invalid details
		Thread.sleep(7000);
		System.out.println("Work successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
// Try our demo app
		
		MobileElement Tryourdemo= (MobileElement) driver.findElementByXPath("");
		Tryourdemo.click();
		String Loginheader = driver.findElementByXPath("").getText();
		if(Loginheader.equals("")){
			System.out.println("Try our demo button working fine");
		}
		else{
			System.out.println("Have some error in the Try our demo app flow");
		}

//Blank flow		
		MobileElement Logininput= (MobileElement) driver.findElementByXPath("");	
		Logininput.sendKeys(" ");
		MobileElement Submit= (MobileElement) driver.findElementByXPath("");	
		String errorblank = driver.findElementByXPath("").getText();
		if (errorblank.equals("")){
			System.out.println("The Login blank flow is fine");
		}
		else{
			System.out.println("Have some error in teh login blank flow");
		}
			
// without @ and domain
		Logininput.sendKeys("testing");
		Submit.click();
		String errorwithoutdomain = driver.findElementByXPath("").getText();
		if (errorwithoutdomain.equals("")){
			System.out.println("The Login without domain flow is fine");
		}
		else{
			System.out.println("Have some error in without domain login");
		}
// unregistered
		Logininput.sendKeys("Test@kockpit.in");
		Submit.click();
		String errorunregistered = driver.findElementByXPath("").getText();
		if (errorunregistered.equals("")){
			System.out.println("The Login with unregistered flow is fine");
		}
		else{
			System.out.println("Have some error in without domain login");
		}
// Registered email with blank password
		Logininput.sendKeys("google.play@kockpit.in");
		Submit.click();
		MobileElement Loginpass = (MobileElement)driver.findElementByXPath("");
		Loginpass.sendKeys(" ");
		Submit.click();
		String errorblankpass = driver.findElementByXPath("").getText();
		if (errorblankpass.equals("")){
			System.out.println("The Login with blank pass is fine");
		}
		else{
			System.out.println("Have some error in blank login");
		}
		
//		Invalid pass and valid password
		Logininput.sendKeys("google.play@kockpit.in");
		Submit.click();
		Loginpass.sendKeys("dsfsdfsd");
		Submit.click();
		String errorinvalidpass = driver.findElementByXPath("").getText();
		if (errorinvalidpass.equals("")){
			System.out.println("The Login with invalid pass is fine");
		}
		else{
			System.out.println("Have some error in invalid pass login");
		}

// Valid user password
		Logininput.sendKeys("google.play@kockpit.in");
		Submit.click();
		Loginpass.sendKeys("password@123");
		Submit.click();
		MobileElement policy1 =	(MobileElement)driver.findElementByXPath("");
		policy1.click();
		MobileElement policy2 =	(MobileElement)driver.findElementByXPath("");	
		policy2.click();
		MobileElement policy3 =	(MobileElement)driver.findElementByXPath("");
		policy3.click();
		MobileElement policysubmit = (MobileElement)driver.findElementByXPath("");
		policysubmit.click();
		
		String Dashboardheader = driver.findElementByXPath("").getText();
		
		if (Dashboardheader.equals("")){
			System.out.println("The User Login successfully");
		}
		else{
			System.out.println("Not login");
		}
		
		Thread.sleep(5000);
		System.out.println("Application started...");

	}
}

